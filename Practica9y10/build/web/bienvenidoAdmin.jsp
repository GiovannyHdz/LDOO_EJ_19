<%@page import="Clase_Usuario.Administrador"%>
<%@page import="Clase_Usuario.UsuarioFactory"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    HttpSession httpSession = request.getSession();
    String usuario = "", password = "", email = "", fechaN = "", fecha_nacimiento = "",numero_empleado = "";
    UsuarioFactory usuarioFactory = UsuarioFactory.getUsuarioFactory();
    Administrador administrador = (Administrador) usuarioFactory.getUsuario("admin");

    if(httpSession != null){
        administrador = (Administrador) httpSession.getAttribute("normal");
    }

    if(administrador!=null){
        usuario = administrador.getUsuario();
        password = administrador.getPassword();
        email = administrador.getEmail();
        fecha_nacimiento = administrador.getFecha_nacimiento();
        numero_empleado = administrador.getNumero_empleado();
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
        <h2>Estos son tus datos</h2>
        <% out.println(usuario); %><br>
        <% out.println(password); %><br>
        <% out.println(email); %><br>
        <% out.println(fechaN); %><br>
        <% out.println(numero_empleado); %>
    </body>
</html>
