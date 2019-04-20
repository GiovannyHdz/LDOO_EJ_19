/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Clase_Usuario.Invitado;
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
@WebServlet(name = "RegistroUsuariosInvitado", urlPatterns = {"/RegistroUsuariosInvitado"})
public class RegistroUsuariosInvitado extends HttpServlet {

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
        String nombre_completo= request.getParameter("nombre_completo");
        String fecha_registro= request.getParameter("fecha_registro");
        UsuarioFactory usuarioFactory = UsuarioFactory.getUsuarioFactory();
        Invitado invitado = (Invitado) usuarioFactory.getUsuario("invitado");
        HttpSession session = request.getSession();
        
        invitado.setUsuario(usuario);
        invitado.setPassword(password);
        invitado.setEmail(email);
        invitado.setFecha_nacimiento(fecha_nacimiento);
        invitado.setTipo_usuario(usuario);
        invitado.setNombre_completo(nombre_completo);
        invitado.setFecha_registro(fecha_registro);
        
        session.setAttribute("invitado", invitado);
        
        Consultas con = new Consultas();
        
        if(con.registrarInvitado(usuario, password, email, fecha_nacimiento,nombre_completo,fecha_registro)){
            response.sendRedirect("index.jsp?var=normal");
        }else{
            response.sendRedirect("registroInvitado.jsp");
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
