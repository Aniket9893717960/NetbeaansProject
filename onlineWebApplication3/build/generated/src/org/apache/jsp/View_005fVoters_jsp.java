package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import db.DBConnecter;
import java.sql.ResultSet;
import java.sql.Statement;

public final class View_005fVoters_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("   <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <title>Bootstrap 5 Project</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.2/font/bootstrap-icons.min.css\">\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.19.0/font/bootstrap-icons.css\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"Homepage.css\">\n");
      out.write("  </head>\n");
      out.write("    <body>\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-light bg-light fixed-top\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\"><span class=\"text-warning\">Voting</span>System</a>\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("      <ul class=\"navbar-nav ms-auto mb-2 mb-lg-0\">\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"AdminHome.jsp\">Home</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"Add_Election.jsp\">ADD Election</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"Add_Candidate.jsp\">ADD Candidate</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"AdminView_result.jsp\">View Result</a>\n");
      out.write("        </li>\n");
      out.write("         <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"View_Voters.jsp\">View Voters</a>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("       <img src=\"images/google.png\" class=\"user-pic\" onclick=\"toggleMenu()\">\n");
      out.write("        \n");
      out.write("        <div class=\"sub-menu-wrap\" id=\"subMenu\">\n");
      out.write("            <div class=\"sub-menu\">\n");
      out.write("                <div class=\"user-info\">\n");
      out.write("                    <img src=\"images/user.png\">\n");
      out.write("                    <h3>James Aldrino</h3>\n");
      out.write("                </div>\n");
      out.write("                <hr>\n");
      out.write("                <a href=\"adminUpdatePage.jsp\" class=\"sub-menu-link\" >\n");
      out.write("                    <img src=\"images/profile.png\">\n");
      out.write("                    <p>Edit Profile</p>\n");
      out.write("                </a>\n");
      out.write("                <a href=\"#\" class=\"sub-menu-link\">\n");
      out.write("                <form action=\"Mainlogout.jsp\" method=\"post\" class=\"sub-menu-link\">\n");
      out.write("                    <img src=\"images/logout.png\">\n");
      out.write("                    <input style=\"background: #FFFFFF;border: 0;\" type=\"submit\" value=\"Logout\" />\n");
      out.write("                </form>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("        \n");
      out.write("<div id=\"carouselExampleCaptions\" class=\"carousel slide\">\n");
      out.write("  <div class=\"carousel-indicators\">\n");
      out.write("    <button type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide-to=\"0\" class=\"active\" aria-current=\"true\" aria-label=\"Slide 1\"></button>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"carousel-inner\">\n");
      out.write("    <div class=\"carousel-item active\">\n");
      out.write("      <img src=\"images/flag.jpg\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("      <div class=\"carousel-caption\">\n");
      out.write("        <h5>Empower Your Voice</h5>\n");
      out.write("        <p>Everyone has the right to life, liberty and security of person</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("        ");
  String user_id = (String) session.getAttribute("user_id");
            String name = (String) session.getAttribute("name");
            String email_Id = (String) session.getAttribute("mailid");
            String dob = (String) session.getAttribute("dob");
            String gender = (String) session.getAttribute("gender");
            String address = (String) session.getAttribute("address");
            String phoneNo = (String) session.getAttribute("phoneNo");
            String status = (String) session.getAttribute("status");
            String email_id = (String) session.getAttribute("email_id");
            
            Statement st = null;
            ResultSet rs = null;
            int i=0;
                try {
                    st = DBConnecter.getStatement(); 
String query = "SELECT voters.name,voters.email_Id,voters.dob,voters.address,voters.gender,voters.phoneNo,status.status FROM voters INNER JOIN STATUS ON voters.email_Id = status.email_Id;";
                    System.out.println("Query =" + query);
                    rs = st.executeQuery(query);
            
      out.write("\n");
      out.write("        <!--Content -->\n");
      out.write("        <div class=\"container mt-5\">\n");
      out.write("            <table id =\"myTable\" class=\"table table-responsive table-bordered border-dark text-hover text-center text-capitalize\">\n");
      out.write("            <tr class =\"table-black table-action text-uppercase text-white\">\n");
      out.write("                <th style=\"width:15%;background: #B87333;\">Name</th>\n");
      out.write("                <th style=\"width:15%;background: #B87333;\">Email ID</th>\n");
      out.write("                <th style=\"width:15%;background: #B87333;\">DOB</th>\n");
      out.write("                <th style=\"width:15%;background: #B87333;\">Gender</th>\n");
      out.write("                <th style=\"width:15%;background: #B87333;\">Address</th>\n");
      out.write("                <th style=\"width:15%;background: #B87333;\">Phone No</th>\n");
      out.write("                <th style=\"width:15%;background: #B87333;\">Status</th>\n");
      out.write("                <th style=\"width:15%;background: #B87333;\">Action</th>\n");
      out.write("                <th style=\"width:15%;background: #B87333;\">Reject</th>\n");
      out.write("                <th style=\"width:15%;background: #B87333;\">Submit</th>\n");
      out.write("            </tr>\n");
      out.write("            ");
 while(rs.next())
            {  
      out.write("\n");
      out.write("             <tr>\n");
      out.write("                 <td>");
      out.print(rs.getString("name"));
      out.write("</td>\n");
      out.write("                 <td>");
      out.print(rs.getString("email_id"));
      out.write("</td>\n");
      out.write("                 <td>");
      out.print(rs.getString("dob"));
      out.write("</td>\n");
      out.write("                 <td>");
      out.print(rs.getString("gender"));
      out.write("</td>\n");
      out.write("                 <td>");
      out.print(rs.getString("address"));
      out.write("</td>\n");
      out.write("                 <td>");
      out.print(rs.getString("phoneNo"));
      out.write("</td>\n");
      out.write("                 <td>");
      out.print(rs.getString("status"));
      out.write("</td>\n");
      out.write("                              <form action=\"viewVotersChecker\" method=\"post\">\n");
      out.write("                                  <td><input type=\"radio\" class=\"btn btn-warning\"  value=\"Accept\" id=\"");
      out.print(rs.getString("email_id"));
      out.write("\"/></td>                 \n");
      out.write("                                  <td><input type=\"radio\" class=\"btn btn-warning\"  value=\"Reject\" id=\"");
      out.print(rs.getString("email_id"));
      out.write("\"/></td>\n");
      out.write("                                  <td><input type=\"submit\" class=\"btn btn-warning\" value=\"submit\" id=\"submit\" /></td>\n");
      out.write("                              </form> \n");
      out.write("                 </tr>\n");
      out.write("              </div>\n");
      out.write("             ");
          }
                        }
                     catch (SQLException ex) {
                        System.out.println(ex);
                    }
      out.write("\n");
      out.write("        </table>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!--footer -->\n");
      out.write("      \n");
      out.write("      <footer class=\"bg-dark p-2 text-center\">\n");
      out.write("          <div class=\"container\">\n");
      out.write("              <p class=\"text-white\"> All Right Reserved @website Name</p>\n");
      out.write("          </div>\n");
      out.write("      </footer>\n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("      <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\" ></script>\n");
      out.write("      <script>\n");
      out.write("          let subMenu=document.getElementById(\"subMenu\");\n");
      out.write("          \n");
      out.write("          function toggleMenu(){\n");
      out.write("              subMenu.classList.toggle(\"open-menu\");\n");
      out.write("          }\n");
      out.write("      </script>\n");
      out.write("      <script>\n");
      out.write("           let popup = document.getElementById(\"popup\");;\n");
      out.write("          function openPopup(){\n");
      out.write("              popup.classList.add(\"open-popup\");\n");
      out.write("          }\n");
      out.write("          function closePopup(){\n");
      out.write("              popup.classList.remove(\"open-popup\");\n");
      out.write("          }\n");
      out.write("      </script>\n");
      out.write("      </script>\n");
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
