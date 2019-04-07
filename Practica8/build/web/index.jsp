<%-- 
    Document   : index.jsp
    Created on : 6/04/2019, 08:55:17 PM
    Author     : gio78_000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Iniciar Sesion</h1>
        <form action="IniciarSesion" method="post">
            <label>Usuario:</label>
            <input type="text" name="usuario"/><br><br>
            
            <label>Contraseña:</label>
            <input type="text" name="password"/><br><br>
            
             <input type="submit" value="Iniciar sesion"/>
        </form>
        
        <a href="registro.jsp">Registrarse</a>
    </body>
</html>
