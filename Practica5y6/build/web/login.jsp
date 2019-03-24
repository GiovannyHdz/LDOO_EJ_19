<%-- 
    Document   : login
    Created on : 23/03/2019, 10:09:28 PM
    Author     : gio78_000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio Sesión</title>
    </head>
    <body>
        <form action="loginServlet" method="POST">
           <h1>Iniciar Sesión</h1>
           <label>Correo:</label>
           <input type="text" name="correo"/><br><br>

           <label>Contraseña:</label>
           <input type="text" name="password"/><br><br>

           <input type="submit" name="enviar" id="enviar" value="enviar"/>
           </form>
    </body>
</html>
