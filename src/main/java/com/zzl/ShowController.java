package com.zzl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



/**
 * Created by Administrator on 2016/12/15.
 */
@WebServlet("/dc")
public class ShowController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
        doGet(request,response);
    }
    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        request.setCharacterEncoding("UTF-8");

        double[] bb=percent(request.getParameter("zzl"),request.getParameter("yy"),request.getParameter("cf"));
        System.out.println(bb);
        request.setAttribute("l1",bb[0]);
        request.setAttribute("l2",bb[1]);
        request.setAttribute("l3",bb[2]);

        request.getRequestDispatcher("page/yonglishow.jsp").forward(request,response);
    }
    public double[] percent (String l1,String l2,String l3){

        double str1=Double.parseDouble(l1);
        double str2=Double.parseDouble(l2);
        double str3=Double.parseDouble(l3);
        double t1=(str1/(str1+str2+str3))*100;
        double t2=(str2/(str1+str2+str3))*100;
        double t3=(str3/(str1+str2+str3))*100;
        double[] bb= new double[] {t1,t2,t3};

        return bb;
    }

}
