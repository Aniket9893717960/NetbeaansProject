package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>registration Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.2/font/bootstrap-icons.min.css\">\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.19.0/font/bootstrap-icons.css\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("    <style>\n");
      out.write("body{\n");
      out.write("background-image: linear-gradient(rgba(0, 0, 0, 0.491), rgba(0, 0, 0, 0.416)), url(login-bg.jpg);\n");
      out.write("height: 100vh; }\n");
      out.write(".login-top{\n");
      out.write("width: 100vw;\n");
      out.write("height: 70px;\n");
      out.write("background-color: rgba(0, 0, 0, 0);\n");
      out.write("padding: 0px 20px;\n");
      out.write("display: flex;\n");
      out.write("align-items: center;\n");
      out.write("}\n");
      out.write("login-top img{\n");
      out.write("width: 150px; \n");
      out.write("}\n");
      out.write(".login-box{\n");
      out.write("width: 430px;\n");
      out.write("height: 670px;\n");
      out.write("background-color: rgba(0, 0, 0, 0.899);\n");
      out.write("border-radius: 5px;\n");
      out.write("padding: 50px;\n");
      out.write("}\n");
      out.write(".small-text{\n");
      out.write("font-size: 13px;\n");
      out.write("}\n");
      out.write(".form-control{\n");
      out.write("box-shadow: none !important;\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"login-top\">\n");
      out.write("\n");
      out.write("<img src=\"logo.svg\" alt=\"\">\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"d-flex justify-content-center align-items-center\" style=\"width: 100vw;\">\n");
      out.write("\n");
      out.write("<section class=\"login-box\">\n");
      out.write("\n");
      out.write("<h2 class=\"text-white\">Sign In</h2>\n");
      out.write("\n");
      out.write("<form class=\"mt-4\" action=\"registrationChecker\" methord=\"post\">\n");
      out.write("\n");
      out.write("<div class=\"mb-3 bg-white rounded px-2\" >\n");
      out.write("\n");
      out.write("<label for=\"exampleInputEmaill\" class=\"form-label small-text\">Email</label>\n");
      out.write("\n");
      out.write("<input type=\"email\" name=\"email_id\" class=\"form-control border-e p-e\" id=\"exampleInputEmaill\" aria-describedby=\"emailHelp\">\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"mb-3 bg-white rounded px-2\" >\n");
      out.write("\n");
      out.write("<label for=\"exampleInputEmaill\" class=\"form-label small-text\">Mobile Number</label>\n");
      out.write("\n");
      out.write("<input type=\"number\" name=\"phoneno\" class=\"form-control border-0 p-8\" id=\"exampleInputEmaill\" aria-describedby=\"emailHelp\">\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"mb-3 bg-white rounded px-2\">\n");
      out.write("\n");
      out.write("<label for=\"exampleInputPassword1\" class=\"form-label small-text\">Password</label>\n");
      out.write("\n");
      out.write("<input type=\"password\" name=\"password\" class=\"form-control border-0 p-0\" id=\"exampleInputPassword1\">\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"mb-3 bg-white rounded px-2\">\n");
      out.write("\n");
      out.write("<label for=\"exampleInputPassword1\" class=\"form-label small-text\">Confrom Password</label>\n");
      out.write("\n");
      out.write("<input type=\"password\" name=\"cp\" class=\"form-control border-8 p-8\" id=\"exampleInputPassword1\">\n");
      out.write("\n");
      out.write("</div> \n");
      out.write("   \n");
      out.write("\n");
      out.write("<input type=\"submit\" value=\"submit\" class=\"btn btn-danger mt-3\" style=\"width: 100%;\"/>\n");
      out.write("\n");
      out.write("<div class=\"mb-3 mt-3 form-check\">\n");
      out.write("\n");
      out.write("<input type=\"checkbox\" class=\"form-check-input\" id=\"exampleCheck1\">\n");
      out.write("<label class=\"form-check-label text-white small-text\" for=\"exampleCheck1\">Remember Me</label>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"mt-3 d-flex\">\n");
      out.write("\n");
      out.write("    <img width=\"20px\"  alt=\"\"><i class=\"bi bi-facebook\"></i></img>\n");
      out.write("\n");
      out.write("<p class=\"m-0 small-text text-white mx-2\">Login with Facebook</p>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"mt-3\">\n");
      out.write("\n");
      out.write("<p class=\"m-0 small-text text-white mt-2\"> <span style=\"color: rgba(212, 212, 212, 0.75);\">This page is protected by\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\" ></script>\n");
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
