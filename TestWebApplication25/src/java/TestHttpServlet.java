/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author INDIA
 */
public class TestHttpServlet extends HttpServlet {

  
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         PrintWriter out = response.getWriter();
         out.println("<html>");
         out.println("<head>");
         out.println("<title>Http Servlet</title> ");
         out.println("</head>");
         out.println("<body>");
         for (int i = 0; i < 10; i++) {
             out.println("<h1>Hello From my Http Servlet </h1>");
        }
        
         out.println("</body>");
         out.println("</html>");
         //System.out.println("Service methord");
      
    }

  
}
