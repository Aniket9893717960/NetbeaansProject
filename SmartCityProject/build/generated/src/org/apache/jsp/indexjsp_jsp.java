package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class indexjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Hospital Website</title>\n");
      out.write("    <link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;600;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <style>\n");
      out.write("        /* Custom CSS */\n");
      out.write("        body {\n");
      out.write("            font-family: 'Open Sans', sans-serif;\n");
      out.write("            background-color: #f8f9fa;\n");
      out.write("            color: #555;\n");
      out.write("        }\n");
      out.write("        .navbar {\n");
      out.write("            background-color: #007bff;\n");
      out.write("        }\n");
      out.write("        .navbar-brand {\n");
      out.write("            color: #fff;\n");
      out.write("            font-weight: 700;\n");
      out.write("        }\n");
      out.write("        .navbar-nav .nav-link {\n");
      out.write("            color: #fff;\n");
      out.write("            font-weight: 600;\n");
      out.write("        }\n");
      out.write("        .jumbotron {\n");
      out.write("            background-image: linear-gradient(to right bottom, rgba(0, 123, 255, 0.8), rgba(0, 172, 230, 0.8)), url('https://images.unsplash.com/photo-1521737711867-61faca5cc2a2');\n");
      out.write("            background-size: cover;\n");
      out.write("            color: #fff;\n");
      out.write("            text-align: center;\n");
      out.write("            padding: 150px 0;\n");
      out.write("        }\n");
      out.write("        .jumbotron h1 {\n");
      out.write("            font-weight: 700;\n");
      out.write("        }\n");
      out.write("        .jumbotron p {\n");
      out.write("            font-size: 20px;\n");
      out.write("            font-weight: 600;\n");
      out.write("        }\n");
      out.write("        .services {\n");
      out.write("            padding: 80px 0;\n");
      out.write("            background-color: #fff;\n");
      out.write("        }\n");
      out.write("        .service-item {\n");
      out.write("            text-align: center;\n");
      out.write("            margin-bottom: 50px;\n");
      out.write("        }\n");
      out.write("        .service-icon {\n");
      out.write("            font-size: 40px;\n");
      out.write("            color: #007bff;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("        .service-title {\n");
      out.write("            font-size: 24px;\n");
      out.write("            font-weight: 700;\n");
      out.write("            margin-bottom: 15px;\n");
      out.write("        }\n");
      out.write("        .service-description {\n");
      out.write("            font-size: 18px;\n");
      out.write("            line-height: 1.6;\n");
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
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <a class=\"navbar-brand\" href=\"#\">Hospital Name</a>\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("      <ul class=\"navbar-nav ml-auto\">\n");
      out.write("        <li class=\"nav-item active\">\n");
      out.write("          <a class=\"nav-link\" href=\"#\">Home</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"#services\">Services</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"#contact\">Contact</a>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<div class=\"jumbotron\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h1>Welcome to Hospital Name</h1>\n");
      out.write("        <p>We care for your health</p>\n");
      out.write("        <a class=\"btn btn-primary btn-lg\" href=\"#services\" role=\"button\">Our Services</a>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"services\" class=\"services\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h2 class=\"text-center mb-5\">Our Services</h2>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("                <div class=\"service-item\">\n");
      out.write("                    <i class=\"fas fa-user-md service-icon\"></i>\n");
      out.write("                    <h3 class=\"service-title\">Medical Care</h3>\n");
      out.write("                    <p class=\"service-description\">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla fermentum velit nec libero mollis, nec commodo mi fermentum.</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("                <div class=\"service-item\">\n");
      out.write("                    <i class=\"fas fa-stethoscope service-icon\"></i>\n");
      out.write("                    <h3 class=\"service-title\">Diagnostic Services</h3>\n");
      out.write("                    <p class=\"service-description\">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla fermentum velit nec libero mollis, nec commodo mi fermentum.</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("                <div class=\"service-item\">\n");
      out.write("                    <i class=\"fas fa-ambulance service-icon\"></i>\n");
      out.write("                    <h3 class=\"service-title\">Emergency Care</h3>\n");
      out.write("                    <p class=\"service-description\">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla fermentum velit nec libero mollis, nec commodo mi fermentum.</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<footer class=\"footer text-center\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <p>&copy; 2024 Hospital Name. All rights reserved. Designed by <a href=\"#\" target=\"_blank\">Your Name</a></p>\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("<script src=\"https://kit.fontawesome.com/a076d05399.js\"></script>\n");
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
