<%-- 
    Document   : resultado
    Created on : 5/03/2019, 07:32:49 PM
    Author     : LSTI204_C6
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Practica 4</title>
    </head>
    <body>
        <h2>Informacion:</h2>
      <table>
         <tr>
            <td>nombre</td>
            <td>${nombre}</td>
         </tr>
         <tr>
            <td>Contraseña:</td>
            <td>${password}</td>
         </tr>
         <tr>
            <td>correo:</td>
            <td>${correo}</td>
         </tr>
         <tr>
            <td>Fecha de nacimiento:</td>
            <td>${FechaNacimiento}</td>
         </tr>
      </table>  
    </body>
</html>
