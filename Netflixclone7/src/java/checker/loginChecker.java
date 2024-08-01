/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checker;
import Authenticator.loginAuthenticator;
import DTO.userLogin;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "loginChecker", urlPatterns = {"/loginChecker"})
public class loginChecker extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.sendRedirect("adminMain.jsp");
}
public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
         String mailid = request.getParameter("email_id");
         Cookie email_id = new Cookie("email_id",mailid);
         response.addCookie(email_id);
         String password = request.getParameter("password");
         
         userLogin user = new userLogin();
         
         user.setMailid(mailid);
         user.setPassword(password);
         
         loginAuthenticator authenticator = new loginAuthenticator();
         boolean login = authenticator.isLogin(user);
    if(login){
        HttpSession session=request.getSession(true);
        session.setAttribute("email",mailid);
        response.sendRedirect("registration.jsp");
    }
    else
    {
        response.sendRedirect("login Page.jsp");
    }
}
}
