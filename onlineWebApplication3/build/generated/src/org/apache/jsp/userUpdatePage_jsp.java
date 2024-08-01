package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userUpdatePage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
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
      out.write("  <body>\n");
      out.write("       \n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-light bg-light fixed-top\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\"><span class=\"text-primary\">Get</span>Home</a>\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("      <ul class=\"navbar-nav ms-auto mb-2 mb-lg-0\">\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"#home\">Home</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"ElectionPage1.jsp\">Elections</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"#\">Logout</a>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("        \n");
      out.write("         <img src=\"images/google.png\" class=\"user-pic\" onclick=\"toggleMenu()\">\n");
      out.write("        \n");
      out.write("        <div class=\"sub-menu-wrap\" id=\"subMenu\">\n");
      out.write("            <div class=\"sub-menu\">\n");
      out.write("                <div class=\"user-info\">\n");
      out.write("                    <img src=\"images/google.png\">\n");
      out.write("                    <h3>James Aldrino</h3>\n");
      out.write("                </div>\n");
      out.write("                <hr>\n");
      out.write("                <a href=\"#\" class=\"sub-menu-link\" >\n");
      out.write("                    <img src=\"images/google.png\">\n");
      out.write("                    <p>Edit Profile</p>\n");
      out.write("                </a>\n");
      out.write("                <a href=\"#\" class=\"sub-menu-link\">\n");
      out.write("                    <img src=\"images/google.png\">\n");
      out.write("                    <p>Help & Support</p>\n");
      out.write("                </a>\n");
      out.write("                <a href=\"#\" class=\"sub-menu-link\">\n");
      out.write("                    <img src=\"images/google.png\">\n");
      out.write("                    <p>Logout</p>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("      \n");
      out.write("<div id=\"carouselExampleCaptions\" class=\"carousel slide\">\n");
      out.write("  <div class=\"carousel-indicators\">\n");
      out.write("    <button type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide-to=\"0\" class=\"active\" aria-current=\"true\" aria-label=\"Slide 1\"></button>\n");
      out.write("    <button type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide-to=\"1\" aria-label=\"Slide 2\"></button>\n");
      out.write("    <button type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide-to=\"2\" aria-label=\"Slide 3\"></button>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"carousel-inner\">\n");
      out.write("    <div class=\"carousel-item active\">\n");
      out.write("      <img src=\"images/home-1.jpg\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("      <div class=\"carousel-caption\">\n");
      out.write("        <h5>Your Dream House</h5>\n");
      out.write("        <p>Some representative placeholder content for the first slide.</p>\n");
      out.write("        <button type=\"button\" class=\"btn btn-primary\">Click Me</button>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("      \n");
      out.write("      <!--contact section-->\n");
      out.write("      <section id=\"contact\" class=\"contact section-padding\">\n");
      out.write("          <div class=\"container\">\n");
      out.write("              <div class=\"row\">\n");
      out.write("                  <div class=\"col-md-12\">\n");
      out.write("                      <div class=\"section-header text-center pb-5\">\n");
      out.write("                          <h2>Update Detail Page</h2>\n");
      out.write("                          <p>For Accessing over Services First you have to sign in according to your Eligibility.</p>\n");
      out.write("                      </div>\n");
      out.write("                  </div>\n");
      out.write("              </div>\n");
      out.write("              \n");
      out.write("              <div class=\"row m-0\">\n");
      out.write("                  <div class=\"col-md-12 p-0 pt-4 pb-4\">\n");
      out.write("                      <form action=\"UpdateChecker\" class=\"bg light p-4,m-auto\" method=\"post\">\n");
      out.write("                          <div class=\"row\">\n");
      out.write("                          <div class=\"col-md-12\">\n");
      out.write("                              <div class=\"mb-3\">\n");
      out.write("                                  <input type=\"text\" name=\"name\" class=\"form-control\" required placeholder=\"Your full name\" />\n");
      out.write("                              </div>\n");
      out.write("                          </div>\n");
      out.write("                          <div class=\"col-md-12\">\n");
      out.write("                              <div class=\"mb-3\">\n");
      out.write("                                  <input type=\"date\" name=\"dob\" class=\"form-control\" required placeholder=\"Your Date of birtth Here\" />\n");
      out.write("                              </div>\n");
      out.write("                          </div>\n");
      out.write("                          <div class=\"col-md-12\">\n");
      out.write("                              <div class=\"mb-3\">\n");
      out.write("                                  <input type=\"text\" name=\"gender\" class=\"form-control\" required placeholder=\"Your Gender Here\" />\n");
      out.write("                              </div>\n");
      out.write("                          </div>\n");
      out.write("                          <div class=\"col-md-12\">\n");
      out.write("                              <div class=\"mb-3\">\n");
      out.write("                                  <input type=\"text\" name=\"phoneno\" class=\"form-control\" required placeholder=\"Your Phone No Here\" />\n");
      out.write("                              </div>\n");
      out.write("                          </div>\n");
      out.write("                          <div class=\"col-md-12\">\n");
      out.write("                              <div class=\"mb-3\">\n");
      out.write("                                  <input type=\"text\" name=\"address\" class=\"form-control\" required placeholder=\"Your Address Here\" />\n");
      out.write("                              </div>\n");
      out.write("                          </div>\n");
      out.write("                          <input class=\"btn btn-primary btn-lg btn-black mt-3\" type=\"submit\" value=\"submit\" />\n");
      out.write("                          </div>\n");
      out.write("                      </form>\n");
      out.write("                  </div>\n");
      out.write("              </div>\n");
      out.write("          </div>\n");
      out.write("      </section>\n");
      out.write("      <!--footer -->\n");
      out.write("      \n");
      out.write("      <footer class=\"bg-dark p-2 text-center\">\n");
      out.write("          <div class=\"container\">\n");
      out.write("              <p class=\"text-white\"> All Right Reserved @website Name</p>\n");
      out.write("          </div>\n");
      out.write("      </footer> \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("      <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\" ></script>\n");
      out.write("       <script>\n");
      out.write("          let subMenu=document.getElementById(\"subMenu\");\n");
      out.write("          \n");
      out.write("          function toggleMenu(){\n");
      out.write("              subMenu.classList.toggle(\"open-menu\");\n");
      out.write("          }\n");
      out.write("      </script>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
