package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_0020Page_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Netflix Login Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"login.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav>\n");
      out.write("            <a href=\"#\"><img src=\"assets/images/logo.svg\" alg=\"logo\"></a>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"form-wrapper\">\n");
      out.write("            <h2>Sign in</h2>\n");
      out.write("            <form action=\"loginChecker\" method=\"post\">\n");
      out.write("            <div class=\"form-control\">\n");
      out.write("            <input type=\"text\" name=\"email_id\" />\n");
      out.write("            <label>Email or phone number</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-control\">\n");
      out.write("            <input type=\"password\" class=\"form-control\" name=\"password\" />\n");
      out.write("            <label>Passoword</label>\n");
      out.write("            </div>\n");
      out.write("            <input value=\"Login\" type=\"submit\" class=\"submit\" style=\"width: 100%;padding: 16px 0;font-size: 1rem;background: #e50914;color: #fff;font-weight: 500;border-radius: 4px;border: none;outline: none;margin: 25px 0 10px;cursor: pointer;transition: 0.1s ease;\" />\n");
      out.write("             </form>   \n");
      out.write("                <div class=\"form-help\">\n");
      out.write("                <div class=\"remember-me\">\n");
      out.write("                    <input type=\"checkbox\" id=\"remember-me\">\n");
      out.write("                    <label for=\"\">Remember me</label>\n");
      out.write("                </div>\n");
      out.write("                <a href=\"#\">Need Help?</a>\n");
      out.write("            </div>\n");
      out.write("            <p>New to Netflix? <a href=\"registration.jsp\">sign up Now</a></p>\n");
      out.write("            <small>This page is protected by reCAPTChA to ensure you're not a bot.\n");
      out.write("            <a hred='#'>learn more.</a>\n");
      out.write("            </small>\n");
      out.write("        </div>\n");
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
