package Clase_Usuario;

public class Administrador extends Usuario{
    String numero_empleado = "";

    public Administrador(){
        numero_empleado = "";
    }
    
    public Administrador(String numero_empleado){
        this.numero_empleado = numero_empleado;
    }

    public String getNumero_empleado() {
        return numero_empleado;
    }

    public void setNumero_empleado(String numero_empleado) {
        this.numero_empleado = numero_empleado;
    }

    @Override
    public String toString() {
        return "Administrador{" + "numEmpleado=" + numero_empleado + '}';
    }
}
