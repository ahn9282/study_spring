package study.springboot.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


public class HelloServlet extends  HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws  IOException {
        System.out.println("HelloServlet.service");
        response.getWriter().println("hello servlet");
    }
}
