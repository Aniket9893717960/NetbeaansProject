
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


/**
 *
 * @author INDIA
 */
public class TestGenricServlet extends GenericServlet {

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        //To change body of generated methods, choose Tools | Templates.
        PrintWriter out = response.getWriter();
         out.println("<html>");
         out.println("<head>");
         out.println("<title>Generic Servlet</title> ");
         out.println("</head>");
         out.println("<body>");
         for (int i = 0; i < 10; i++) {
             out.println("<h1>Hello From my Genericq Servlet </h1>");
        }
        
         out.println("</body>");
         out.println("</html>");
         //System.out.println("Service methord");
    }

}
