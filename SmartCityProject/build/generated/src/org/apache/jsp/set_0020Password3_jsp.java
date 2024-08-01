package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class set_0020Password3_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <title>Password Setup</title>\n");
      out.write("  <!-- Bootstrap CSS -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("  <!-- Font Awesome CSS -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css\">\n");
      out.write("  <!-- Custom CSS -->\n");
      out.write("  <style>\n");
      out.write("    body {\n");
      out.write("      background-color: #f4e04d;\n");
      out.write("      color: #333;\n");
      out.write("      font-family: Arial, sans-serif;\n");
      out.write("      height: 100vh;\n");
      out.write("      margin: 0;\n");
      out.write("      display: flex;\n");
      out.write("      justify-content: center;\n");
      out.write("      align-items: center;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .password-setup {\n");
      out.write("      background-color: #fff;\n");
      out.write("      border-radius: 10px;\n");
      out.write("      box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);\n");
      out.write("      padding: 20px;\n");
      out.write("      width: 300px;\n");
      out.write("      text-align: center;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .password-setup h2 {\n");
      out.write("      margin-bottom: 20px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .password-setup input[type=\"password\"] {\n");
      out.write("      width: calc(100% - 20px);\n");
      out.write("      padding: 10px;\n");
      out.write("      border-radius: 5px;\n");
      out.write("      border: 1px solid #ccc;\n");
      out.write("      margin-bottom: 10px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .password-setup button[type=\"submit\"] {\n");
      out.write("      width: calc(100% - 20px);\n");
      out.write("      padding: 10px;\n");
      out.write("      border-radius: 5px;\n");
      out.write("      border: none;\n");
      out.write("      background-color: #f2a154;\n");
      out.write("      color: #fff;\n");
      out.write("      cursor: pointer;\n");
      out.write("      transition: background 0.3s ease;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .password-setup button[type=\"submit\"]:hover {\n");
      out.write("      background-color: #f4e04d;\n");
      out.write("    }\n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("  <div class=\"password-setup\">\n");
      out.write("    <h2>Set Password</h2>\n");
      out.write("    <form id=\"passwordForm\">\n");
      out.write("      <input type=\"password\" id=\"password\" placeholder=\"Enter Password\" required>\n");
      out.write("      <input type=\"password\" id=\"confirmPassword\" placeholder=\"Confirm Password\" required>\n");
      out.write("      <button type=\"submit\">Set Password</button>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <!-- Bootstrap JS and jQuery -->\n");
      out.write("  <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js\"></script>\n");
      out.write("  <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("  <!-- Font Awesome JS -->\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/js/all.min.js\"></script>\n");
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
