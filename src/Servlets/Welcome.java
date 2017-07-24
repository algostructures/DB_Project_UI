package Servlets;

import DAO.AdminDaoImpl;
import DAO.OperatorDaoImpl;
import Utilities.JDBCHelper;
import entities.Admin;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by prajapas on 7/24/2017.
 */
@WebServlet(name = "Welcome")
public class Welcome extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        String n=request.getParameter("username");
        String p=request.getParameter("password");
        response.setContentType("text/html");
        out.print("<LINK REL='StyleSheet' HREF='styles.css'>");
        System.out.println("here");
        int who = login(n, p);
        if (who != 0){
            HttpSession session = request.getSession();
            session.setAttribute("username", n);
            session.setAttribute("password", p);
            session.setAttribute("user", who);
            if(who == 1){
                RequestDispatcher rd=request.getRequestDispatcher("/admin.html");
                rd.forward(request, response);
            }
            else{
                RequestDispatcher rd=request.getRequestDispatcher("/operator.html");
                rd.forward(request, response);
            }

        }
        else {
            out.print("<div id = center_1>Sorry UserName or Password Error!</div>");
            RequestDispatcher rd=request.getRequestDispatcher("/index.html");
            request.setAttribute("def", "this_parameter_added_by_servlet");
            rd.include(request, response);
        }
    }

    private static int login(String username, String password) {
        AdminDaoImpl admin = new AdminDaoImpl();
        OperatorDaoImpl operator = new OperatorDaoImpl();
        if(admin.validate(new Admin(username, password))) {
            return 1;
        }
        else if(operator.validate(username, password)){
            return 2;
        }
        else {
            return 0;
        }
    }

}
