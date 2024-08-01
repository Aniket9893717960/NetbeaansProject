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
@WebServlet(name = "TestHidden2", urlPatterns = {"/TestHidden2"})
public class TestHidden2 extends HttpServlet {
     
 public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        String username=request.getParameter("username");
         String password=request.getParameter("password");
            /* TODO output your page here. You may use following sample code. */
            
            out.println("<html>");
            out.println("<head>");
            out.println("<title>The POST Methord </title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("The servlet has recevied a Post.");
            out.println("<br>");
            out.println("<form action=TestHidden3 method=POST>");
            out.println("FirstName : <input type=text name=firstname /><br>");
            out.println("LastName : <input type=text name=lastname /><br>");
             out.println("<input type=hidden value="+username+" name=username /><br>");
           out.println("<input type=hidden value="+password+" name=password /><br>");
            out.println("<input type=submit value=submit>");
           out.println("</form>");
            out.println("</body>");
            out.println("</html>");
    }
}

 

