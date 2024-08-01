/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dtb.userOTP;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import model.LoginAuthenticator;

/**
 *
 * @author INDIA
 */
public class LoginChecker extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.sendRedirect("login.html");
}
public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
    String mailid = request.getParameter("mailid");
         String password = request.getParameter("password");
         
         userOTP user = new userOTP();
         
         user.setMailid(mailid);
         user.setPassword(password);
         
         LoginAuthenticator authenticator = new LoginAuthenticator();
         boolean login = authenticator.isLogin(user);
    if(login){
        HttpSession session=request.getSession(true);
        session.setAttribute("mailid",mailid);
        response.sendRedirect("showjsp2.jsp");
    }
    else
    {
        response.sendRedirect("login.html");
    }
}
}
