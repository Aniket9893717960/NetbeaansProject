
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


/**
 *
 * @author INDIA
 */
public class NewServlet implements Servlet  {

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Init Methord");
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
         //To change body of generated methods, choose Tools | Templates.
         PrintWriter out = response.getWriter();
         out.println("<html>");
         out.println("<head>");
         out.println("<title>First Servlet</title> ");
         out.println("</head>");
         out.println("<body>");
         out.println("<h1>Hello From my First Servlet </h1>");
         out.println("</body>");
         out.println("</html>");
         //System.out.println("Service methord");
    }

     @Override
    public void destroy() {
         //To change body of generated methods, choose Tools | Templates.
         System.out.println("destroy methord");
    }
    @Override
    public String getServletInfo() {
         //To change body of generated methods, choose Tools | Templates.
         return null;
    }
    
    @Override
    public ServletConfig getServletConfig() {
         //To change body of generated methods, choose Tools | Templates.
         return null;
    }
}
