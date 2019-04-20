<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registro Normal</h1>
        <form action="RegistroUsuariosNormal" method="post">
            <label>Usuario:</label>
            <input type="text" name="usuario"/><br><br>
            
            <label>Correo:</label>
            <input type="text" name="email"/><br><br>
            
            <label>Contraseña:</label>
            <input type="text" name="password"/><br><br>
            
            <label>Fecha de nacimiento:</label>
            <input type="date" name="fecha_nacimiento"/><br><br>
            
            <label>Nombre Completo</label>
            <input type="text" name="nombre_completo"/><br><br>
            
            <label>Subscripcion:</label>
            <input type="text" name="tipo_subscripcion"/><br><br>
            
            <label>Domicilio</label>
            <input type="text" name="domicilio"/><br><br>
            
             <input type="submit" value="Registrarse"/>
        </form>
    </body>
</html>
