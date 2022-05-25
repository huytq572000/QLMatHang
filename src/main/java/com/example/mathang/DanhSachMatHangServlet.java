package com.example.mathang;

import dao.MatHangDAO;
import model.MatHang;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "trangchu", value = "/trangchu")
public class DanhSachMatHangServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        MatHangDAO mh = new MatHangDAO();
        List<MatHang> list = mh.getall();
        request.setAttribute("data", list);
        RequestDispatcher dispatcher = request.getRequestDispatcher("trangchu.jsp");
        dispatcher.forward(request, response);
    }
}
