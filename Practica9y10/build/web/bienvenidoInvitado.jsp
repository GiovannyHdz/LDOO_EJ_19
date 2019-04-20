<%@page import="Clase_Usuario.Invitado"%>
<%@page import="Clase_Usuario.UsuarioFactory"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    HttpSession httpSession = request.getSession();
    String usuario = "", password = "", email = "", fechaN = "", fecha_nacimiento = "", nombre_completo = "", fecha_registro = "";
    UsuarioFactory usuarioFactory = UsuarioFactory.getUsuarioFactory();
    Invitado invitado = (Invitado) usuarioFactory.getUsuario("admin");

    if(httpSession != null){
        invitado = (Invitado) httpSession.getAttribute("normal");
    }

    if(invitado!=null){
        usuario = invitado.getUsuario();
        password = invitado.getPassword();
        email = invitado.getEmail();
        fecha_nacimiento = invitado.getFecha_nacimiento();
        nombre_completo = invitado.getNombre_completo();
        fecha_registro = invitado.getFecha_registro();
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
        <% out.println(nombre_completo); %><br>
        <% out.println(fecha_registro); %>
    </body>
</html>
