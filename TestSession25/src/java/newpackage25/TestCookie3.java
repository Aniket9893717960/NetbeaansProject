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


@WebServlet(urlPatterns = {"/TestCookie3"})
public class TestCookie3 extends HttpServlet {
 public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           response.sendRedirect("TestCookie1");  
        
}
 
 public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        Cookie cookies[] = request.getCookies();
         String firstname=request.getParameter("firstname");
         String lastname=request.getParameter("lastname");
         
          Cookie c3 = new Cookie("firstname",firstname);
         Cookie c4 = new Cookie("lastname",lastname);
         
          response.addCookie(c3);
         response.addCookie(c4);
            /* TODO output your page here. You may use following sample code. */
            
            out.println("<html>");
            out.println("<head>");
            out.println("<title>The Get Methord </title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("The servlet has recevied a post");
            out.println("<br>");
            for(int i=0;i<cookies.length;i++)
            {
                out.println(cookies[i].getName()+" = "+cookies[i].getValue()+"<br>");
            }
            out.println("<br>Click on button for next page");
            out.println("<form action=TestCookie4 method=POST>");
            out.println("<input type =submit value=submit><br>");
            out.print("</form>");
            
            out.println("</body>");
            out.println("</html>");
        
    }
}

