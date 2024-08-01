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

@WebServlet(urlPatterns = {"/TestCookie1"})
public class TestCookie1 extends HttpServlet {

    
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title> The GET method</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("The Servlet has received  GET.Now ,Click the button below.");
        out.println("<br>");
        out.println("<form action =TestCookie2 method=POST>");
        out.println("Username : <input type=text name=username><br>");
        out.println("Password : <input type=password name=password><br>");
        out.println("<input type=submit value=submit><br>");
        out.println("<form>");
        out.println("</body>");
        out.println("</html>");
    }      
}