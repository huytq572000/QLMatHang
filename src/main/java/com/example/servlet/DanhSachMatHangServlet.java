package com.example.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "trangchu", value = "/trangchu")
public class DanhSachMatHangServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        MatHangDAO mh = new MatHangDAO();
//        List<MatHang> list = mh.getall();
//        request.setAttribute("data", list);
//        RequestDispatcher dispatcher = request.getRequestDispatcher("trangchu.jsp");
//        dispatcher.forward(request, response);
        response.sendRedirect("trangchu.jsp");
    }
}
