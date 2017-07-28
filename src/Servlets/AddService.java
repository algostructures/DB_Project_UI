package Servlets;

import Hibernate.HQLManageService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

/**
 * Created by prajapas on 7/27/2017.
 */
@WebServlet(name = "AddService")
public class AddService extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String vm = (String)request.getAttribute("vm");
        String owner = (String)request.getParameter("owner");
        int odm = Integer.parseInt((String)request.getParameter("odm"));
        HQLManageService hq = new HQLManageService();
        hq.addServiceVehicle(vm, owner, odm);
        response.sendRedirect("pages/ViewService.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
