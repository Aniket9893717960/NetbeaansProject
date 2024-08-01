package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import db.DBConnector;;

public final class showjsp1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String mailid = (String) session.getAttribute("mailid");

            Statement st = null;
            ResultSet rs = null;
        
      out.write("\n");
      out.write("        <h1><strong><center> successfully Registration</center></strong></h1>\n");
      out.write("        <a href=\"login.jsp\">Sign In</a>\n");
      out.write("        <form action=\"showChecker\"  method=\"post\">\n");
      out.write("            ");

                try {
                    st = DBConnector.getStatement();
                    String query = "SELECT * FROM emp WHERE empmailid='" + mailid + "'";
                    System.out.println("Query =" + query);

                    rs = st.executeQuery(query);
            if (rs.next()) 
            {
            
      out.write("\n");
      out.write("\n");
      out.write("            <table>     \n");
      out.write("                <tr>\n");
      out.write("                    <td>Employee ID:</td>\n");
      out.write("                    <td><h3>");
      out.print(rs.getString("empid"));
      out.write("</h3></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>First Name:</td>\n");
      out.write("                    <td><h3>");
      out.print(rs.getString("empname"));
      out.write("</h3></td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>Last Name:</td>\n");
      out.write("                    <td><h3>");
      out.print(rs.getString("emplastname"));
      out.write("</h3></td>\n");
      out.write("                </tr>                         \n");
      out.write("                <tr>\n");
      out.write("                    <td>Address:</td>\n");
      out.write("                    <td><h3>");
      out.print(rs.getString("empaddress"));
      out.write("</h3></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Additional Address:</td>\n");
      out.write("                    <td><h3>");
      out.print(rs.getString("empaddress2"));
      out.write("</h3></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>City:</td>\n");
      out.write("                    <td><h3>");
      out.print(rs.getString("empcity"));
      out.write("</h3></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>State:</td>\n");
      out.write("                    <td><h3>");
      out.print(rs.getString("empstate"));
      out.write("</h3></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Date Of Birth:</td>\n");
      out.write("                    <td><h3>");
      out.print(rs.getString("empdob"));
      out.write("</h3></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>ZIP CODE:</td>\n");
      out.write("                    <td><h3>");
      out.print(rs.getString("empzipcode"));
      out.write("</h3></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Phone No:</td>\n");
      out.write("                    <td><h3>");
      out.print(rs.getString("empphoneNo"));
      out.write("</h3></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>salary:</td>\n");
      out.write("                    <td><h3>");
      out.print(rs.getString("empsalary"));
      out.write("</h3></td>\n");
      out.write("                </tr>\n");
      out.write("                ");

                        }
                    } catch (SQLException ex) {
                        System.out.println(ex);
                    }
      out.write("\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td><a href=\"logout.jsp\">Sign Out</a></td>\n");
      out.write("                    <td><a href=\"update.jsp\">update</a></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
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
