/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author USER
 */
@WebServlet(name = "Shaggi", urlPatterns = {"/Shaggi"})
public class Shaggi extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Shaggi</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Shaggi at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
//        processRequest(request, response);
//        PrintWriter out =response.getWriter();
//        double p =Double.parseDouble(request.getParameter("principal"));
//        double t =Double.parseDouble(request.getParameter("time"));
//        double r =Double.parseDouble(request.getParameter("rate"));
//        double y =Double.parseDouble(request.getParameter("no/yr"));
//        double CI=p;
//        
//        request.setAttribute("CI", CI);
//        request.setAttribute("p", p);
//        request.setAttribute("r", r);
//        request.setAttribute("t", t);
//        request.setAttribute("y", y);
//        RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
//        rd.forward(request, response);
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
//        processRequest(request, response);
        String email = request.getParameter("email");
        String pass = request.getParameter("psw");
        String tempPass = "12345";
        String tempEmail = "jay@gmail.com";
        String error = "Incorrect login details";

        if (email.equals(tempEmail) && pass.equals(tempPass)) {
            request.setAttribute("email", email);
            RequestDispatcher rd = request.getRequestDispatcher("compound_calc.jsp");
            rd.forward(request, response);
        } else {
            request.setAttribute("error", error);
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.forward(request, response);
        }
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
omo 
i 
am 
trying
it 
now
still
