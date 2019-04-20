package Clase_Usuario;

public class Invitado extends Usuario{
    String nombre_completo = "";
    String fecha_registro = "";

    public Invitado() {
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(String fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    @Override
    public String toString() {
        return "Invitado{" + "nombre_completo=" + nombre_completo + ", fechaRegistro=" + fecha_registro + '}';
    }
}
