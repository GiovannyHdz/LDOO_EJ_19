<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registro Administrador</h1>
        <form action="RegistroUsuariosAdmin" method="post">
            <label>Usuario:</label>
            <input type="text" name="usuario"/><br><br>
            
            <label>Correo:</label>
            <input type="text" name="email"/><br><br>
            
            <label>Contraseña:</label>
            <input type="text" name="password"/><br><br>
            
            <label>Fecha de nacimiento:</label>
            <input type="date" name="fecha_nacimiento"/><br><br>
            
            <label>Numero Empleado</label>
            <input type="text" name="numero_empleado"/><br><br>
            
             <input type="submit" value="Registrarse"/>
        </form>
    </body>
</html>
