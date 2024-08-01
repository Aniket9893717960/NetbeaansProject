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
@WebServlet(name = "TestSession2", urlPatterns = {"/TestSession2"})
public class TestSession2 extends HttpServlet {

     public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           response.sendRedirect("TestSession1");  
        
}
    
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        HttpSession session = request.getSession(true);//By this oommand we havee to enable session
        /*session object is behave like a global object
         by this we have to access every page or data of the webApplication TestSession*/
        session.setAttribute("username",username);
         session.setAttribute("password",password);
         
         System.out.println(session.getId());/*by session.getId() we have to see session ID 
         this method print session id into consol screen */
        PrintWriter out = response.getWriter();
            /* TODO output your page here. You may use following sample code. */
            
            out.println("<html>");
            out.println("<head>");
            out.println("<title>The POST method</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("The Servlet has recevied a POST.Now, click the button below.");
            out.println("<br>");
            out.println("<form action=TestSession3 method=POST>");
            out.println("First Name :<input type =text name=firstname><br>");
             out.println("Last Name :<input type =text name=lastname><br>");
              out.println("<input type =submit value=submit><br>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    
}
