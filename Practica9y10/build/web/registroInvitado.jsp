<%@page import="java.util.GregorianCalendar"%>
<%@page import="java.util.Calendar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Calendar fecha = new GregorianCalendar();
    int año = fecha.get(Calendar.YEAR);
    int mes = fecha.get(Calendar.MONTH);
    int dia = fecha.get(Calendar.DAY_OF_MONTH);

    String fecha_actual = dia + "/" + (mes+1) + "/" + año;
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registro Invitado</h1>
        <form action="RegistroUsuariosInvitado" method="post">
            <label>Usuario:</label>
            <input type="text" name="usuario"/><br><br>
            
            <label>Correo:</label>
            <input type="text" name="email"/><br><br>
            
            <label>Contraseña:</label>
            <input type="text" name="password"/><br><br>
            
             <label>Fecha de nacimiento:</label>
            <input type="date" name="fecha_nacimiento"/><br><br>
            
            <label>Nombre Completo:</label>
            <input type="text" name="nombre_completo"/><br><br>
            
            <input style="display:none" type="text" name="fecha_registro" value = "<% out.println(fecha_actual); %>"/>
            
             <input type="submit" value="Registrarse"/>
        </form>
    </body>
</html>
