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
@WebServlet(name = "TestHidden3", urlPatterns = {"/TestHidden3"})
public class TestHidden3 extends HttpServlet {

   public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        String username=request.getParameter("username");
         String password=request.getParameter("password");
         String firstname=request.getParameter("firstname");
         String lastname=request.getParameter("lastname");
            /* TODO output your page here. You may use following sample code. */
            
            out.println("<html>");
            out.println("<head>");
            out.println("<title>The POST Methord </title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("Username : "+username);
            out.println("<br>Password : "+password);
            out.println("<br>FirstNmae : "+firstname);
            out.println("<br>LastName : "+lastname);
            out.println("</body>");
            out.println("</html>");
        
    }
}
