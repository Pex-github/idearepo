package com.pex.firstweb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sound.midi.Soundbank;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @Auther:PEX
 * @Date:2020/8/26-18:26
 * @Description: ${PACKAGE_NAME}
 * @version:1.8
 */
@WebServlet(name = "RequestServlet")
public class RequestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("采用post请求并跳转调用Get处理方法");
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("欢迎来到Get处理方法体");

        System.out.println("请求行信息提取方法");
        String method = request.getMethod();
        System.out.println(method);
        StringBuffer requestURL = request.getRequestURL();
        System.out.println(requestURL);
        String requestURI = request.getRequestURI();
        System.out.println(requestURI);
        String scheme = request.getScheme();
        System.out.println(scheme);

        System.out.println("请求头信息提取方法");
        String userAgent =  request.getHeader("User-Agent");
        System.out.println(userAgent);
        Enumeration<String> headerNames = request.getHeaderNames();
        while(headerNames.hasMoreElements()){
            String key = headerNames.nextElement();
            String value = request.getHeader(key);
            System.out.println(key +" : "+value);
        }

        System.out.println("请求体信息提取方法");
        String name = request.getParameter("name");
        String pwd = request.getParameter("pwd");
        String fav = request.getParameter("fav");
        System.out.println(name + ", "+pwd+", "+fav);

        Enumeration<String> parameterNames = request.getParameterNames();
        while(parameterNames.hasMoreElements()){
            System.out.println(parameterNames.nextElement());
        }

        String[] favorites = request.getParameterValues("fav");
        for (String str : favorites) {
            System.out.println(str);
        }

        System.out.println("其他常用方法");
        String remoteUser = request.getRemoteUser();
        String remoteHost = request.getRemoteHost();
        String remoteAddr = request.getRemoteAddr();
        int remotePort = request.getRemotePort();
        String localAddr = request.getLocalAddr();
        String localName = request.getLocalName();
        System.out.println("客户端：" + remoteUser + remoteHost + remoteAddr + remotePort + "\n"
         + "本地：" + localAddr + localName );
    }
}
