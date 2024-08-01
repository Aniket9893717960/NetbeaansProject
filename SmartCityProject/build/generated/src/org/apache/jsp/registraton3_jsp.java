package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registraton3_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("  <title>Registration Page</title>\n");
      out.write("  <!-- Bootstrap CSS -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("  <!-- Font Awesome CSS -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css\">\n");
      out.write("  <!-- Custom CSS -->\n");
      out.write("  <style>\n");
      out.write("    body {\n");
      out.write("      background: linear-gradient(to right, #f4e04d, #f2a154);\n");
      out.write("      color: #333;\n");
      out.write("      height: 100vh;\n");
      out.write("      margin: 0;\n");
      out.write("      display: flex;\n");
      out.write("      justify-content: center;\n");
      out.write("      align-items: center;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .registration-container {\n");
      out.write("      background: rgba(255, 255, 255, 0.9);\n");
      out.write("      padding: 30px;\n");
      out.write("      border-radius: 10px;\n");
      out.write("      box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);\n");
      out.write("      max-width: 700px;\n");
      out.write("      width: 100%;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .registration-container h2 {\n");
      out.write("      text-align: center;\n");
      out.write("      margin-bottom: 30px;\n");
      out.write("      color: #f2a154;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .form-group {\n");
      out.write("      margin-bottom: 20px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    input[type=\"text\"],\n");
      out.write("    input[type=\"email\"],\n");
      out.write("    input[type=\"tel\"],\n");
      out.write("    input[type=\"password\"] {\n");
      out.write("      width: calc(50% - 10px);\n");
      out.write("      padding: 10px;\n");
      out.write("      border-radius: 5px;\n");
      out.write("      border: none;\n");
      out.write("      background: rgba(255, 255, 255, 0.1);\n");
      out.write("      color: #333;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    input[type=\"text\"]:focus,\n");
      out.write("    input[type=\"email\"]:focus,\n");
      out.write("    input[type=\"tel\"]:focus,\n");
      out.write("    input[type=\"password\"]:focus {\n");
      out.write("      outline: none;\n");
      out.write("      background: rgba(255, 255, 255, 0.2);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    button[type=\"submit\"] {\n");
      out.write("      width: 100%;\n");
      out.write("      padding: 10px;\n");
      out.write("      border-radius: 5px;\n");
      out.write("      border: none;\n");
      out.write("      background: #f2a154;\n");
      out.write("      color: #fff;\n");
      out.write("      cursor: pointer;\n");
      out.write("      transition: background 0.3s ease;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    button[type=\"submit\"]:hover {\n");
      out.write("      background: #f4e04d;\n");
      out.write("    }\n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("  <div class=\"registration-container\">\n");
      out.write("    <h2>Registration</h2>\n");
      out.write("    <form id=\"registrationForm\">\n");
      out.write("      <div class=\"form-row\">\n");
      out.write("        <div class=\"col\">\n");
      out.write("          <input type=\"text\" id=\"firstName\" placeholder=\"First Name\" required>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col\">\n");
      out.write("          <input type=\"text\" id=\"lastName\" placeholder=\"Last Name\" required>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <input type=\"text\" id=\"username\" placeholder=\"Username\" required>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <input type=\"email\" id=\"email\" placeholder=\"Email\" required>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <input type=\"tel\" id=\"phoneNumber\" placeholder=\"Phone Number\" required>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <input type=\"text\" id=\"address\" placeholder=\"Address\" required>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <input type=\"password\" id=\"password\" placeholder=\"Password\" required>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <input type=\"password\" id=\"confirmPassword\" placeholder=\"Confirm Password\" required>\n");
      out.write("      </div>\n");
      out.write("      <button type=\"submit\">Register</button>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <!-- Bootstrap JS and jQuery -->\n");
      out.write("  <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js\"></script>\n");
      out.write("  <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("  <!-- Font Awesome JS -->\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/js/all.min.js\"></script>\n");
      out.write("\n");
      out.write("  <!-- Custom JavaScript -->\n");
      out.write("  <script>\n");
      out.write("    document.getElementById('registrationForm').addEventListener('submit', function(event) {\n");
      out.write("      event.preventDefault(); // Prevent the form from submitting\n");
      out.write("\n");
      out.write("      // Get form values\n");
      out.write("      var firstName = document.getElementById('firstName').value;\n");
      out.write("      var lastName = document.getElementById('lastName').value;\n");
      out.write("      var username = document.getElementById('username').value;\n");
      out.write("      var email = document.getElementById('email').value;\n");
      out.write("      var phoneNumber = document.getElementById('phoneNumber').value;\n");
      out.write("      var address = document.getElementById('address').value;\n");
      out.write("      var password = document.getElementById('password').value;\n");
      out.write("      var confirmPassword = document.getElementById('confirmPassword').value;\n");
      out.write("\n");
      out.write("      // Perform registration logic here (for demonstration purpose)\n");
      out.write("      // In a real application, you would send this data to a server\n");
      out.write("      alert('Registration successful!');\n");
      out.write("      console.log('First Name: ' + firstName);\n");
      out.write("      console.log('Last Name: ' + lastName);\n");
      out.write("      console.log('Username: ' + username);\n");
      out.write("      console.log('Email: ' + email);\n");
      out.write("      console.log('Phone Number: ' + phoneNumber);\n");
      out.write("      console.log('Address: ' + address);\n");
      out.write("      console.log('Password: ' + password);\n");
      out.write("      console.log('Confirm Password: ' + confirmPassword);\n");
      out.write("    });\n");
      out.write("  </script>\n");
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
