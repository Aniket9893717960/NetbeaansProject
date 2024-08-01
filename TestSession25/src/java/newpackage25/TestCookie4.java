/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage25;


import java.io.*;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author INDIA
 */
@WebServlet(name = "TestCookie4", urlPatterns = {"/TestCookie4"})
public class TestCookie4 extends HttpServlet {

  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           response.sendRedirect("TestCookie1");  
        
}
 public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        Cookie cookies[] = request.getCookies();
            /* TODO output your page here. You may use following sample code. */
            
            out.println("<html>");
            out.println("<head>");
            out.println("<title>The POST Methord </title>");            
            out.println("</head>");
            out.println("<body>");
           out.println("The servlet has recevied a Post.");
           out.print("<br>");
           for(int i=0;i<cookies.length;i++){
               out.print("<h3>"+cookies[i].getName()+" = "+ cookies[i].getValue()+"<h3>");
           }
            out.println("</body>");
            out.println("</html>");
        
    }
}
