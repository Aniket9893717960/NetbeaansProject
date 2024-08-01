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
@WebServlet(name = "TestCookie2", urlPatterns = {"/TestCookie2"})
public class TestCookie2 extends HttpServlet {
      public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           response.sendRedirect("TestCookie1");  
        
}
    
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        Cookie c1 = new Cookie("username",username);
         Cookie c2 = new Cookie("password",password);
         
         response.addCookie(c1);
         response.addCookie(c2);
        PrintWriter out = response.getWriter();
            /* TODO output your page here. You may use following sample code. */
            
            out.println("<html>");
            out.println("<head>");
            out.println("<title>The POST method</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("The Servlet has recevied a POST.Now, click the button below.");
            out.println("<br>");
            out.println("<form action=TestCookie3 method=POST>");
            out.println("First Name :<input type =text name=firstname><br>");
             out.println("Last Name :<input type =text name=lastname><br>");
              out.println("<input type =submit value=submit><br>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    

}
