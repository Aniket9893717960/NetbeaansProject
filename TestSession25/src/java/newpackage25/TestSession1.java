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
@WebServlet(name = "TestSession1", urlPatterns = {"/TestSession1"})
public class TestSession1 extends HttpServlet {

  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
        PrintWriter out = response.getWriter();
            /* TODO output your page here. You may use following sample code. */
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet TestSession1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("The servlet has recevied a GET. " + "Now ,click the button below.");
            out.println("<br>");
           out.println("<form action =TestSession2 method=POST>");
        out.println("Username : <input type=text name=username><br>");
        out.println("Password : <input type=password name=password><br>");
        out.println("<input type=submit value=submit><br>");
        out.println("<form>");
            out.println("</body>");
            out.println("</html>");
        
    }

}
