/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author gio78_000
 */
@WebServlet(name = "loginServlet", urlPatterns = {"/loginServlet"})
public class loginServlet extends HttpServlet {

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
       
        String correo, password, idSession, email="", pass="";
        correo = request.getParameter("correo");
        password = request.getParameter("password");
        HttpSession session = request.getSession();
        Cookie[] cookie=request.getCookies();
        
        if(cookie!=null){
            for(Cookie cookie_usuario: cookie){
                if("idSession".equals(cookie_usuario.getName())){
                    idSession=cookie_usuario.getValue();
                }
                if("email".equals(cookie_usuario.getName())){
                    email=cookie_usuario.getValue();
                }  
            }
            for(Cookie cookie_pass: cookie){
                if("pass".equals(cookie_pass.getName())){
                    pass=cookie_pass.getValue();
                }   
            }    
        }
        if(session==null && cookie==null){
            request.getRequestDispatcher("registro.html").forward(request, response);
        }
        else{
            if(correo.equalsIgnoreCase(correo)){
           if(password.equalsIgnoreCase(password)){
               Usuario usuario = new Usuario(correo,password);
               session.setAttribute("usuario",usuario);
               request.getRequestDispatcher("MenuServlet").forward(request, response);
            
           }else{
               request.getRequestDispatcher("ErrorServlet").forward(request, response);
           }
       }else{
                request.getRequestDispatcher("ErrorServlet").forward(request, response);
       }      
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
