package Clase_Usuario;

public class Normal extends Usuario {
    String nombre_completo = "";
    String tipo_subscripcion = "";
    String domicilio = "";

    public Normal() {
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getTipo_subscripcion() {
        return tipo_subscripcion;
    }

    public void setTipo_subscripcion(String tipo_subscripcion) {
        this.tipo_subscripcion = tipo_subscripcion;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "Normal{" + "nombre_completo=" + nombre_completo + ", tipo_subscripcion=" + tipo_subscripcion + ", domicilio=" + domicilio + '}';
    }
}
