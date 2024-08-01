/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dtb.userUTP;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.UpdateAuthenticator;

/**
 *
 * @author INDIA
 */
public class UpdateChecker extends HttpServlet {

public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.sendRedirect("login.html");
}
public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
         String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String mailid = request.getParameter("email");
        String address= request.getParameter("address");
        String address2 = request.getParameter("address1");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String dob = request.getParameter("dob");
        String zipcode = request.getParameter("zipcode");
        String phoneNo=request.getParameter("phoneno");
        
         
         userUTP user1 = new userUTP();
         
         user1.setFirstname(firstname);
         user1.setLastname(lastname);
         user1.setMailid(mailid);
         user1.setAddress(address);
         user1.setAddress2(address2);
         user1.setCity(city);
         user1.setState(state);
         user1.setDob(dob);
         user1.setZipcode(zipcode);
         user1.setPhoneNo(phoneNo);
         
         UpdateAuthenticator uauthenticator = new UpdateAuthenticator();
         boolean update = uauthenticator.isUpdate(user1);
         
    if(update){
        HttpSession session=request.getSession(true);
        session.setAttribute("mailid",mailid);
        response.sendRedirect("login.html");
    }
    else
    {
        response.sendRedirect("login.html");
    }
}
}
