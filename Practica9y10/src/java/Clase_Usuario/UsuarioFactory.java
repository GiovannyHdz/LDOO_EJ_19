package Clase_Usuario;
    
public class UsuarioFactory{
    private static UsuarioFactory singleton;
    
    public  static UsuarioFactory getUsuarioFactory(){
    if (singleton==null) {
        singleton=new UsuarioFactory();
    }
    return singleton;
    }

    public UsuarioFactory() {
    }
    
    public static Usuario getUsuario(String tipoUsuario){
        if("admin".equalsIgnoreCase(tipoUsuario)){
            return new Administrador();
        }else if("invitado".equalsIgnoreCase(tipoUsuario)){
            return new Invitado();
        }else if("normal".equalsIgnoreCase(tipoUsuario)){
            return new Normal();
        }
        return null;
    }
}
