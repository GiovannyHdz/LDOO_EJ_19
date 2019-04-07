/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author gio78_000
 */
public class Consultas extends ConexionDB{
    
    public boolean autenticar(String usuario, String password){
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            String consulta = "select * from USUARIOS where NOMBRE_USUARIO = ? and PASSWORD = ?";
            pst = obtenerConexion().prepareStatement(consulta);
            pst.setString(1, usuario);
            pst.setString(2, password);
            
            rs = pst.executeQuery();
            
            if(rs.next()){
                return true;
            }
            
        } catch (Exception e) {
            System.err.println("ERROR"+e);
        }finally{
            try {
                if(obtenerConexion() != null){
                    obtenerConexion().close();
                } 
                if(pst != null){
                    pst.close();
                } 
                if(rs != null){
                    rs.close();
                } 
            } catch (Exception e) {
                System.err.println("ERROR"+e);
            }
        }
        return false;
    }
    
    public boolean registrar(String nombre_usuario, String password, String email, String fecha_nacimiento){
        PreparedStatement pst= null;
        
        try {
            String consulta = "insert into USUARIOS(nombre_usuario, password, email, fecha_nacimiento) values(?,?,?,?)";
            pst = obtenerConexion().prepareStatement(consulta);
            pst.setString(1, nombre_usuario);
            pst.setString(2, password);
            pst.setString(3, email);
            pst.setString(4, fecha_nacimiento);
            
            if(pst.executeUpdate() == 1){
                return true;
            }
        } catch (Exception e) {
            System.err.println("ERROR"+e);    
        }finally{
            try {
                if(obtenerConexion() != null){
                obtenerConexion().close();
                }
                if(pst != null){
                    pst.close();
                }
                
            } catch (Exception e) {
                System.err.println("ERROR"+e);
            }
        }
          return false;
    }
}
