/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lucas
 */
@WebServlet(name = "operations", urlPatterns = {"/operations"})
public class operations extends HttpServlet {

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

            //Obtém parametros do html e trás o objeto calc da classe Calculadora
            String op = request.getParameter("op");
            Calculadora calc = new Calculadora();
            
            //Obtém os dados digitados pelo usuário na caixa de texto
            double v1 = Double.parseDouble(request.getParameter("txtv1"));
            double v2 = Double.parseDouble(request.getParameter("txtv2"));
            double res = 0;
            
            //Seta os valores
            calc.setV1(v1);
            calc.setV2(v2);

            //Switch para cada ação do usuário
            switch (op) {
                case "+":
                    res = calc.somar();     //Soma
                    break;

                case "-":
                    res = calc.subtrair();     //Subtração
                    break;

                case "/":
                    res = calc.dividir();   //Divisão
                    break;

                case "*":
                    res = calc.multiplicar();   //Multiplicação
                    break;
            }

            //Tela do resultado
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Calculadora</title>");  //Título da página html
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Resultado: " + res + "</h1>"); //Exibe o resultado na tela.
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
