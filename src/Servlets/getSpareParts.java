package Servlets;

import DAO.SparePartsDaoImpl;
import entities.SpareParts;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by prajapas on 7/24/2017.
 */
@WebServlet(name = "getSpareParts")
public class getSpareParts extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SparePartsDaoImpl sp = new SparePartsDaoImpl();
        response.setContentType("text/html");
        List<SpareParts> ar =  sp.getAllSpareParts();
        System.out.print("here");
        PrintWriter pw = response.getWriter();
        pw.print("<link rel='stylesheet prefetch' href='http://netdna.bootstrapcdn.com/bootstrap/3.0.2/css/bootstrap.min.css'>");
        pw.print("<nav class='navbar navbar-inverse'> <div class='container-fluid'> <div class='navbar-header'>"+
                "<a class='navbar-brand' href=''#'>DMS</a> </div>"+
                "<ul class='nav navbar-nav'>"+
                "<li class='active'><a href='#'>Home</a></li>"+
                "<li><a href='#'>Add Operator</a></li>"+
                "<li><a href='#'>View Operators</a></li>"+
                "<li><a href='getSpareParts'>View Vehicles</a></li>"+
                "<li><a href='AddSparePart.html'>Add Sparepart</a></li>"+
                "<li><a href='getSpareParts'>View Spareparts</a></li>"+
                "</ul>"+
                "</div>"+
                "</nav>");
        pw.print("<table class = 'table table-striped'>");
        pw.print("<thead>");
        pw.print("<tr>");
        pw.print("<th>#</th>");
        pw.print("<th>ID</th>");
        pw.print("<th>Name</th>");
        pw.print("<th>Vehicle Model</th>");
        pw.print("<th>Price</th>");
        pw.print("<th>Tax</th>");
        pw.print("<th>Units</th>");
        pw.print("</thead>");
        pw.print("<tbody>");
        int i = 0;
        for(SpareParts part : ar){
            pw.print("</tr>");
            pw.print("<td>"+(++i)+"</td> ");
            pw.print("<td>"+part.getSparepart_ID()+"</td>");
            pw.print("<td>"+part.getSparepartName()+"</td>");
            pw.print("<td>"+part.getVehicle_model()+"</td>");
            pw.print("<td>"+part.getPrice()+"</td>");
            pw.print("<td>"+part.getTax()+"</td>");
            pw.print("<td>"+part.getNumbers()+"</td>");
            pw.print("</tr>");
        }
        System.out.println(i);
        pw.print("</tbody>");
        pw.print("</table>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SparePartsDaoImpl sp = new SparePartsDaoImpl();
        response.setContentType("text/html");
        List<SpareParts> ar =  sp.getAllSpareParts();

        PrintWriter pw = response.getWriter();
        pw.print("<link rel='stylesheet prefetch' href='http://netdna.bootstrapcdn.com/bootstrap/3.0.2/css/bootstrap.min.css'>");
        pw.print("<nav class='navbar navbar-inverse'> <div class='container-fluid'> <div class='navbar-header'>"+
           "<a class='navbar-brand' href=''#'>DMS</a> </div>"+
        "<ul class='nav navbar-nav'>"+
            "<li class='active'><a href='#'>Home</a></li>"+
            "<li><a href='#'>Add Operator</a></li>"+
            "<li><a href='#'>View Operators</a></li>"+
            "<li><a href='getSpareParts'>View Vehicles</a></li>"+
            "<li><a href='AddSparePart.html'>Add Sparepart</a></li>"+
            "<li><a href='getSpareParts'>View Spareparts</a></li>"+
        "</ul>"+
        "</div>"+
        "</nav>");
        pw.print("<table class = 'table table-striped'>");
        pw.print("<thead>");
        pw.print("<tr>");
        pw.print("<th>#</th>");
        pw.print("<th>ID</th>");
        pw.print("<th>Name</th>");
        pw.print("<th>Vehicle Model</th>");
        pw.print("<th>Price</th>");
        pw.print("<th>Tax</th>");
        pw.print("<th>Units</th>");
        pw.print("</thead>");
        pw.print("<tbody>");
        int i = 0;
        for(SpareParts part : ar){
            pw.print("</tr>");
            pw.print("<td>"+(++i)+"</td>");
            pw.print("<td>"+part.getSparepart_ID()+"</td>");
            pw.print("<td>"+part.getSparepartName()+"</td>");
            pw.print("<td>"+part.getVehicle_model()+"</td>");
            pw.print("<td>"+part.getPrice()+"</td>");
            pw.print("<td>"+part.getTax()+"</td>");
            pw.print("<td>"+part.getNumbers()+"</td>");
            pw.print("</tr>");
        }
        System.out.println(i);
        pw.print("</tbody>");
        pw.print("</table>");
    }
}
