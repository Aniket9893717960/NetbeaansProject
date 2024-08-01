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
@WebServlet(name = "TestHidden1", urlPatterns = {"/TestHidden1"})
public class TestHidden1 extends HttpServlet {

   
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
            /* TODO output your page here. You may use following sample code. */
            
            out.println("<html>");
            out.println("<head>");
            out.println("<title>The Get Methord </title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("The servlet has recevied a GET . Now , click the button below.");
            out.println("<br>");
            out.println("<form action=TestHidden2 method=POST>");
            out.println("Username : <input type=text name=username /><br>");
            out.println("Password : <input type=password name=password /><br>");
            out.println("<input type=submit value=submit>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        
    }

  

}
