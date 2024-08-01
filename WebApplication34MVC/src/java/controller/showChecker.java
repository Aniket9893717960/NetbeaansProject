/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dtb.userDTP;
import dtb.userSTP;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.ShowAuthenticator;


/**
 *
 * @author INDIA
 */
public class showChecker extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.sendRedirect("login.html");
}
public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
         String id = request.getParameter("empid");
                  String firstname = request.getParameter("empname");
                  String  lastname = request.getParameter("emplastname");
                  String mailid = request.getParameter("mailid");
                  String address = request.getParameter("empaddress");
                  String address2 = request.getParameter("empaddress2");
                  String salary = request.getParameter("empsalary");
                  String city = request.getParameter("empcity");
                  String state = request.getParameter("empstate");
                  String dob = request.getParameter("empdob");
                  String zipcode = request.getParameter("empzipcode");
                  String phoneNo = request.getParameter("emphoneno");
                 userSTP user1 = new userSTP();
}
}

   