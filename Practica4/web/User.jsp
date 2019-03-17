<%-- 
    Document   : User
    Created on : 5/03/2019, 07:31:39 PM
    Author     : LSTI204_C6
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Practica 4</title>
    </head>
    <body>
        <h2>Formulario:</h2>
      <form:form method = "POST" action = "addUser">
         <table>
            <tr>
               <td><form:label path = "nombre">Nombre</form:label></td>
               <td><form:input path = "nombre"/></td>
            </tr>
            <tr>
               <td><form:label path = "correo">Correo:</form:label></td>
               <td><form:input path = "corre" /></td>
            </tr>
            <tr>
               <td><form:label path = "password">Contraseña:</form:label></td>
               <td><form:input path = "password" /></td>
            </tr>
            <tr>
               <td><form:label path = "fechaNacimiento">Fecha de nacimiento:</form:label></td>
               <td><form:input path = "fechaNacimiento" /></td>
            </tr>
            <tr>
               <td colspan = "2">
                  <input type = "submit" value = "Submit"/>
               </td>
            </tr>
         </table>  
      </form:form>
    </body>
</html>
