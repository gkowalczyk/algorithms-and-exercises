package com.example.algorithmsandexercises;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@WebServlet("/example")
public class ExampleServlet extends HttpServlet {

    @Override
    public void init() {
        System.out.println("Servlet " + this.getServletName() + " has started");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("Servlet " + this.getServletName() + " has received a GET request");
        response.setContentType("text/html");
        response.getWriter().println("<h1>Hello World!</h1>");
    }

    public void addPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        response.setContentType("text/html");
        response.getWriter().println("<h1>Hello, " + name + "!</h1>");
    }

    @Override
    public void destroy() {
        // Kod czyszczenia
        System.out.println("Serwlet jest niszczony");
    }



}
