package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import java.sql.ResultSet;
import db.DBConnector;
import java.sql.Statement;

public final class deletejsp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String delete = (String) session.getAttribute("mailid");

            Statement st = null;
            ResultSet rs = null;
        
      out.write("\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <td> <h1><b>You're about to delete your account</b></h1></td>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <td<h2>Your account will be permanently removed and\n");
      out.write("            you won't be able to see them again,including the\n");
      out.write("            ones you've shared with your friends.</h2></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td><input type=\"reset\" value=\"Cancel\" /></td>\n");
      out.write("            <button type = \"button\" value=\"delete\"> Delete Account</button>\n");
      out.write("            <td>\n");
      out.write("                ");

                if(delete!=null)
                {
                try {
             st = DBConnector.getStatement();
            String query="DELETE FROM emp where empmailid='"+delete+"'";
            System.out.println("Query=" +query);
            
             int i =st.executeUpdate(query);
            
            if(i!=0){
                
      out.write("\n");
      out.write("             <tr>\n");
      out.write("                    <td>User Mailid ID:</td>\n");
      out.write("                    <td><h3>Is Deleted</h3></td>\n");
      out.write("                </tr>\n");
      out.write("                ");

            }
        }
      
        catch(SQLException e){
            System.out.println(e);
        }
} 
      out.write("\n");
      out.write("            </td>\n");
      out.write("                    \n");
      out.write("                \n");
      out.write("                </tr>\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
