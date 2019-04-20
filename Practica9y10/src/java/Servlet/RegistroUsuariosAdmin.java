/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Clase_Usuario.Administrador;
import Clase_Usuario.UsuarioFactory;
import Controlador.Consultas;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author gio78_000
 */
@WebServlet(name = "RegistroUsuariosAdmin", urlPatterns = {"/RegistroUsuariosAdmin"})
public class RegistroUsuariosAdmin extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String usuario= request.getParameter("usuario");
        String password= request.getParameter("password");
        String email= request.getParameter("email");
        String fecha_nacimiento= request.getParameter("fecha_nacimiento");
        String numero_empleado= request.getParameter("numero_empleado");
        UsuarioFactory usuarioFactory = UsuarioFactory.getUsuarioFactory();
        Administrador administrador = (Administrador) usuarioFactory.getUsuario("admin");
        HttpSession session = request.getSession();
        
        administrador.setUsuario(usuario);
        administrador.setPassword(password);
        administrador.setEmail(email);
        administrador.setFecha_nacimiento(fecha_nacimiento);
        administrador.setTipo_usuario(usuario);
        administrador.setNumero_empleado(numero_empleado);
        
        session.setAttribute("administrador", administrador);
        
        Consultas con = new Consultas();
        
        if(con.registrarAdministrador(usuario, password, email, fecha_nacimiento,numero_empleado)){
            response.sendRedirect("index.jsp?var=admin");
        }else{
            response.sendRedirect("registroAdmin.jsp");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
