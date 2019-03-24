/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author gio78_000
 */
public class Usuario {
  private String nombre, correo, password, fechaNacimiento; 
  //Constructor para el login 
    public Usuario(String correo, String password) {
        this.correo = correo;
        this.password = password;
    }
    
    //Constructor para el registro
    public Usuario(String nombre, String correo, String password, String fechaNacimiento) {
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
  
   Usuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
