/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Clase_Usuario.Administrador;
import Clase_Usuario.Usuario;
import Clase_Usuario.UsuarioFactory;
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
    
    public boolean registrarAdministrador(String nombre_usuario, String password, String email, String fecha_nacimiento, String numero_empleado){
        PreparedStatement pst1= null;
        PreparedStatement pst2= null;
        
        try {
            String consulta1 = "insert into USUARIOS(nombre_usuario, password, email, fecha_nacimiento, tipo_usuario) values(?,?,?,?,'Administrador')";
            pst1 = obtenerConexion().prepareStatement(consulta1);
            pst1.setString(1, nombre_usuario);
            pst1.setString(2, password);
            pst1.setString(3, email);
            pst1.setString(4, fecha_nacimiento);
            
            String consulta2 = "insert into ADMINISTRADORES(numero_empleado) values(?)";
            pst2 = obtenerConexion().prepareStatement(consulta2);
            pst2.setString(1, numero_empleado);
            
            if((pst1.executeUpdate() == 1)&&(pst2.executeUpdate() == 1)){
                return true;
            }
        } catch (Exception e) {
            System.err.println("ERROR"+e);    
        }finally{
            try {
                if(obtenerConexion() != null){
                obtenerConexion().close();
                }
                if(pst1 != null){
                    pst1.close();
                }
                if(pst2 != null){
                    pst2.close();
                }
            } catch (Exception e) {
                System.err.println("ERROR"+e);
            }
        }return false;
    }
    
    public boolean registrarInvitado(String nombre_usuario, String password, String email, String fecha_nacimiento, String nombre_completo, String fecha_registro){
        PreparedStatement pst1= null;
        PreparedStatement pst2= null;
        
        try {
            String consulta1 = "insert into USUARIOS(nombre_usuario, password, email, fecha_nacimiento, tipo_usuario) values(?,?,?,?,'Invitado')";
            pst1 = obtenerConexion().prepareStatement(consulta1);
            pst1.setString(1, nombre_usuario);
            pst1.setString(2, password);
            pst1.setString(3, email);
            pst1.setString(4, fecha_nacimiento);
            
            String consulta2 = "insert into INVITADOS(nombre_completo,fecha_registro) values(?,?)";
            pst2 = obtenerConexion().prepareStatement(consulta2);
            pst2.setString(1, nombre_completo);
            pst2.setString(2, fecha_registro);
            
            if((pst1.executeUpdate() == 1)&&(pst2.executeUpdate() == 1)){
                return true;
            }
            
        } catch (Exception e) {
            System.err.println("ERROR"+e);    
        }finally{
            try {
                if(obtenerConexion() != null){
                obtenerConexion().close();
                }
                if(pst1 != null){
                    pst1.close();
                }
                if(pst2 != null){
                    pst2.close();
                }
            } catch (Exception e) {
                System.err.println("ERROR"+e);
            }
        }return false;
    }
    
    public boolean registrarNormal(String nombre_usuario, String password, String email, String fecha_nacimiento, String nombre_completo, String tipo_subscripcion, String domicilio){
        PreparedStatement pst1= null;
        PreparedStatement pst2= null;
        
        try {
            String consulta1 = "insert into USUARIOS(nombre_usuario, password, email, fecha_nacimiento, tipo_usuario) values(?,?,?,?,'Normal')";
            pst1 = obtenerConexion().prepareStatement(consulta1);
            pst1.setString(1, nombre_usuario);
            pst1.setString(2, password);
            pst1.setString(3, email);
            pst1.setString(4, fecha_nacimiento);
            
            String consulta2 = "insert into NORMALES(nombre_completo, tipo_subscripcion, domicilio) values(?,?,?)";
            pst2 = obtenerConexion().prepareStatement(consulta2);
            pst2.setString(1, nombre_completo);
            pst2.setString(2, tipo_subscripcion);
            pst2.setString(3, domicilio);
            
            if((pst1.executeUpdate() == 1)&&(pst2.executeUpdate() == 1)){
                return true;
            }
        } catch (Exception e) {
            System.err.println("ERROR"+e);    
        }finally{
            try {
                if(obtenerConexion() != null){
                obtenerConexion().close();
                }
                if(pst1 != null){
                    pst1.close();
                }
                if(pst2 != null){
                    pst2.close();
                }
            } catch (Exception e) {
                System.err.println("ERROR"+e);
            }
        }return false;
    }
}
