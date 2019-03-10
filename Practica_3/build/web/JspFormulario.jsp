<%-- 
    Document   : JspFormulario
    Created on : 2/03/2019, 08:25:24 PM
    Author     : gio78_000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

  <%
            String nombre= request.getParameter("nombre");
            String correo= request.getParameter("correo");
            String password= request.getParameter("password");
            String FechaDeNacimiento= request.getParameter("FechaDeNacimiento");
  %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Practica 3</title>
    </head>
    <body>
        
        <%
            out.println("Nombre: "+nombre+"<br>");
            out.println("correo: "+correo+"<br>");
            out.println("Contraseña: "+password+"<br>");
            out.println("Fecha de nacimiento: "+FechaDeNacimiento+"<br>");
        %>
      
    </body>
</html>
