

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author INDIA
 */
public class HttpServlet2 extends HttpServlet {

      protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          response.sendRedirect("login.html"); 
      
    }
    
       protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         String username=request.getParameter("username");
         String password=request.getParameter("password");
         String tablePassword = null;
         Connection con= null;
         Statement  st= null;
         ResultSet rs= null;
         
         
          try
        {
            Class.forName("com.mysql.jdbc.Driver");//if any problem found then jrh will treate those error
//Driver is a class which is under jdbc package and the campany name in last 
            System.out.println("Driver loaded");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db25","root","root"); //This is the connectivity url
            System.out.println("Connected");
            
            st = con.createStatement();
            
            String query = "SELECT emppassword FROM emp WHERE empname='"+username+"'";
              System.out.println("Query ="+query);
              
              rs =st.executeQuery(query);
              if(rs.next())
                      {
                 tablePassword = rs.getString(1);
                      }
              con.close();
        }
        catch(ClassNotFoundException ex)
        {
            System.out.println(ex);
    }
        catch(SQLException ex)
        {
            System.out.println(ex);
        }
          
         PrintWriter out = response.getWriter();
         out.println("<html>");
         out.println("<head>");
         out.println("<title>Http Servlet</title> ");
         out.println("</head>");
         out.println("<body bgcolor =cyan>");
         out.println("<h1>Hello From my Http Servlet2 -Post</h1>");
         //out.println("<h2>Username = "+username+" </h2>");
         //out.println("<h2>Password = "+password+" </h2>");
          
         
         
         out.println("</body>");
         out.println("</html>");
         //System.out.println("Service methord");
      
    }
}
