package Servlets;

import DAO.OperatorDaoImpl;
import DAO.OrderDaoImpl;
import entities.Operator;
import entities.Orders;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by prajapas on 7/25/2017.
 */
@WebServlet(name = "AddOperator")
public class AddOperator extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        OperatorDaoImpl operatorDao =new  OperatorDaoImpl();
        HttpSession ssn = request.getSession();
        String username = (String) ssn.getAttribute("username");
        String vm = request.getParameter("uid");
        String spi = request.getParameter("pwd");
        Operator op = new Operator(vm, spi, true);
        operatorDao.addOpertor(op);
        response.sendRedirect("pages/ViewOperator.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
