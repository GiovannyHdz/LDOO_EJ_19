<%-- 
    Document   : registro
    Created on : 6/04/2019, 09:00:29 PM
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
        <h1>Registro</h1>
        <form action="RegistroUsuarios" method="post">
            <label>Usuario:</label>
            <input type="text" name="usuario"/><br><br>
            
            <label>Correo:</label>
            <input type="text" name="email"/><br><br>
            
            <label>Contraseña:</label>
            <input type="text" name="password"/><br><br>
            
             <label>Fecha de nacimiento:</label>
            <input type="date" name="fecha_nacimiento"/><br><br>
            
             <input type="submit" value="Registrarse"/>
        </form>
    </body>
</html>
