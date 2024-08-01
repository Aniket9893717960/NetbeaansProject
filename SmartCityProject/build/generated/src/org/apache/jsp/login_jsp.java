package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("  <title>Login Page</title>\n");
      out.write("  <!-- Bootstrap CSS -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("  <!-- Custom CSS -->\n");
      out.write("  <style>\n");
      out.write("    body {\n");
      out.write("      background-color: #f8f9fa;\n");
      out.write("    }\n");
      out.write("    .container {\n");
      out.write("      margin-top: 100px;\n");
      out.write("    }\n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"row justify-content-center\">\n");
      out.write("      <div class=\"col-md-6\">\n");
      out.write("        <div class=\"card\">\n");
      out.write("          <div class=\"card-header\">\n");
      out.write("            <h4>Login</h4>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"card-body\">\n");
      out.write("            <form id=\"loginForm\">\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label for=\"username\">Username</label>\n");
      out.write("                <input type=\"text\" id=\"username\" class=\"form-control\" required>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label for=\"password\">Password</label>\n");
      out.write("                <input type=\"password\" id=\"password\" class=\"form-control\" required>\n");
      out.write("              </div>\n");
      out.write("              <button type=\"submit\" class=\"btn btn-primary btn-block\">Login</button>\n");
      out.write("            </form>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <!-- Bootstrap JS and jQuery -->\n");
      out.write("  <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js\"></script>\n");
      out.write("  <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("  <!-- Custom JavaScript -->\n");
      out.write("  <script>\n");
      out.write("    document.getElementById('loginForm').addEventListener('submit', function(event) {\n");
      out.write("      event.preventDefault(); // Prevent the form from submitting\n");
      out.write("\n");
      out.write("      // Get username and password\n");
      out.write("      var username = document.getElementById('username').value;\n");
      out.write("      var password = document.getElementById('password').value;\n");
      out.write("\n");
      out.write("      // Validate username and password (for demonstration purpose)\n");
      out.write("      if (username === 'admin' && password === 'password') {\n");
      out.write("        alert('Login successful!');\n");
      out.write("        // You can redirect the user to another page here if needed\n");
      out.write("      } else {\n");
      out.write("        alert('Invalid username or password!');\n");
      out.write("      }\n");
      out.write("    });\n");
      out.write("  </script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
