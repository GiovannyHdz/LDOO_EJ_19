<%@page import="Clase_Usuario.Normal"%>
<%@page import="Clase_Usuario.UsuarioFactory"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    HttpSession httpSession = request.getSession();
    String usuario = "", password = "", email = "", fechaN = "", fecha_nacimiento = "", nombre_completo = "", tipo_subscripcion = "",  domicilio = "";
    UsuarioFactory usuarioFactory = UsuarioFactory.getUsuarioFactory();
    Normal normal = (Normal) usuarioFactory.getUsuario("admin");

    if(httpSession != null){
        normal = (Normal) httpSession.getAttribute("normal");
    }

    if(normal!=null){
        usuario = normal.getUsuario();
        password = normal.getPassword();
        email = normal.getEmail();
        fecha_nacimiento = normal.getFecha_nacimiento();
        nombre_completo = normal.getNombre_completo();
        tipo_subscripcion = normal.getTipo_subscripcion();
        domicilio = normal.getDomicilio();        
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Inicio de Sesión exitoso!!</h1>
        <% out.println(usuario); %><br>
        <% out.println(password); %><br>
        <% out.println(email); %><br>
        <% out.println(fechaN); %><br>
        <% out.println(nombre_completo); %><br>
        <% out.println(tipo_subscripcion); %><br>
        <% out.println(domicilio); %>
    </body>
</html>
