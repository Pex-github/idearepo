package com.pex.control;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Auther:PEX
 * @Date:2020/8/27-0:23
 * @Description: com.pex.control
 * @version:1.8
 */
public class PageServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("接收到客户端的请求，返回响应的登录页面");

        String str = (String) req.getAttribute("str")==null?"":(String) req.getAttribute("str");
        System.out.println(str);

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.write("<html>");
        out.write("<head>");
        out.write("</head>");
        out.write("<body>");
        out.write("<font color='red' size='20px' >"+str+"</font>");
        out.write("<form action='login' method='get'>");
        out.write("name：<input type='text' name='name' value=''>");
        out.write("pwd ：<input type='text' name='pwd' value=''>");
        out.write("<input type='submit' value='Login'>");
        out.write("</from>");
        out.write("</body>");
        out.write("</html>");
    }
}
