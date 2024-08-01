package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class indexjsp2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Healthcare System</title>\n");
      out.write("    <link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\">\n");
      out.write("    <style>\n");
      out.write("        /* Custom CSS */\n");
      out.write("        .jumbotron {\n");
      out.write("            background-image: linear-gradient(to right bottom, #f8f9fa, #dee2e6), url('https://images.unsplash.com/photo-1594055138554-6e13cd5f9f5b');\n");
      out.write("            background-size: cover;\n");
      out.write("            color: #fff;\n");
      out.write("            text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.8);\n");
      out.write("            padding: 100px 0;\n");
      out.write("        }\n");
      out.write("        .feature-icon {\n");
      out.write("            font-size: 50px;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("            color: #007bff;\n");
      out.write("        }\n");
      out.write("        .feature-box {\n");
      out.write("            padding: 30px;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            transition: transform 0.3s ease-in-out;\n");
      out.write("            background-color: #fff;\n");
      out.write("            box-shadow: 0px 0px 20px rgba(0, 0, 0, 0.1);\n");
      out.write("            height: 100%;\n");
      out.write("        }\n");
      out.write("        .feature-box:hover {\n");
      out.write("            transform: translateY(-5px);\n");
      out.write("            box-shadow: 0px 0px 40px rgba(0, 0, 0, 0.2);\n");
      out.write("        }\n");
      out.write("        .footer {\n");
      out.write("            background-color: #343a40;\n");
      out.write("            color: #fff;\n");
      out.write("            padding: 50px 0;\n");
      out.write("        }\n");
      out.write("        .footer a {\n");
      out.write("            color: #fff;\n");
      out.write("        }\n");
      out.write("        .footer a:hover {\n");
      out.write("            color: #007bff;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("  <a class=\"navbar-brand\" href=\"#\">Healthcare System</a>\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("  </button>\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("    <ul class=\"navbar-nav ml-auto\">\n");
      out.write("      <li class=\"nav-item active\">\n");
      out.write("        <a class=\"nav-link\" href=\"#\">Home</a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"#\">About Us</a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"#\">Services</a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"#\">Contact</a>\n");
      out.write("      </li>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<div class=\"jumbotron\">\n");
      out.write("    <div class=\"container text-center\">\n");
      out.write("        <h1 class=\"display-3\">Welcome to Our Healthcare System</h1>\n");
      out.write("        <p class=\"lead\">Providing top-notch healthcare services</p>\n");
      out.write("        <a class=\"btn btn-primary btn-lg\" href=\"#\" role=\"button\">Learn More</a>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"container mt-5\">\n");
      out.write("    <div class=\"row text-center\">\n");
      out.write("        <div class=\"col-md-4\">\n");
      out.write("            <div class=\"feature-box\">\n");
      out.write("                <i class=\"fas fa-user-md feature-icon\"></i>\n");
      out.write("                <h3>Expert Staff</h3>\n");
      out.write("                <p>Our team consists of highly qualified medical professionals.</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-4\">\n");
      out.write("            <div class=\"feature-box\">\n");
      out.write("                <i class=\"fas fa-hospital feature-icon\"></i>\n");
      out.write("                <h3>State-of-the-Art Facilities</h3>\n");
      out.write("                <p>We offer modern facilities equipped with advanced medical technology.</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-4\">\n");
      out.write("            <div class=\"feature-box\">\n");
      out.write("                <i class=\"fas fa-heartbeat feature-icon\"></i>\n");
      out.write("                <h3>Comprehensive Services</h3>\n");
      out.write("                <p>From consultations to surgeries, we provide a wide range of healthcare services.</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<footer class=\"footer text-center\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <p>&copy; 2024 Healthcare System. All rights reserved. Designed by <a href=\"#\" target=\"_blank\">Your Name</a></p>\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
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
