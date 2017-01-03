package com.zzl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2016/12/30.
 */
@WebServlet("/add")
public class AddController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
        doGet(request,response);
    }
    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        request.setCharacterEncoding("UTF-8");
        DateFormat dateFormat = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
        String currentTime = dateFormat.format(new Date());
        request.setAttribute("currentTime",currentTime);
        request.getRequestDispatcher("page/add.jsp").forward(request,response);
    }

}
