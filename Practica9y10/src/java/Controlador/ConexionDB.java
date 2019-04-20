/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 *
 * @author gio78_000
 */
public class ConexionDB {
    private String USERNAME = "gio";
    private String PASSWORD = "123";
    private String CLASSNAME = "com.mysql.jdbc.Driver";
    private String URL = "jdbc:derby://localhost:1527/Usuarios";
    private Connection con;
    
    public ConexionDB(){
        try {
            Class.forName(CLASSNAME);
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("ERROR "+e);
        }
    }
    
    public Connection obtenerConexion(){
        return con;
    }
}
