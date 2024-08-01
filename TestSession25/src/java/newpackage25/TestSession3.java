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
@WebServlet(name = "TestSession3", urlPatterns = {"/TestSession3"})
public class TestSession3 extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           response.sendRedirect("TestSession1");  
        
}
 public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession(true);//By this oommand we havee to enable session
        /*session object is behave like a global object
         by this we have to access every page or data of the webApplication TestSession*/
       String username = (String)session.getAttribute("username");
         String password = (String)session.getAttribute("password");
        
         String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
            /* TODO output your page here. You may use following sample code. */
            
            out.println("<html>");
            out.println("<head>");
            out.println("<title>The GET Methord </title>");            
            out.println("</head>");
            out.println("<body>");
           out.println("The servlet has recevied a Post." + "Session value: <br>");
           out.println("<br>");
            out.println("<br>FirstNmae : "+firstname);
            out.println("<br>LastName : "+lastname);
              out.println("Username : "+username);
            out.println(password);
           out.println("<br>");
            out.println("</body>");
            out.println("</html>");
        
    }
}
