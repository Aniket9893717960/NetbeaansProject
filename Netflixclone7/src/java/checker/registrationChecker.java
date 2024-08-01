/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checker;
import Authenticator.registrationAuthentictor;
import DTO.userRegistration;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class registrationChecker extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.sendRedirect("index.jsp");
}
public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
    System.out.println("In do post methord of Add image servlet.");
        String mailid = request.getParameter("email_id");
        Cookie email_id = new Cookie("email_id",mailid);
        response.addCookie(email_id);
        String phoneNo=request.getParameter("phoneno");
        String password = request.getParameter("password");
        String cp = request.getParameter("cp");
       
         userRegistration user2 = new userRegistration();
         
         user2.setMailid(mailid);
         user2.setPhoneNo(phoneNo);
         user2.setPassword(password);
         user2.setCp(cp);
         
         registrationAuthentictor rauthenticator = new registrationAuthentictor();
         boolean registration = rauthenticator.isRegistration(user2);
         System.out.println(registration);
    if(registration){
        HttpSession session=request.getSession(true);
        session.setAttribute("email_id",mailid);
        response.sendRedirect("Login Page.jsp");
    }
    else
    {
        response.sendRedirect("index.jsp");
    }
       }  
}
