package com.yeahbutstill.javawebservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/todolist")
public class TodoListServlet extends HttpServlet {

    private final List<String> todos = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("TodoList: " + todos);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String todo = req.getParameter("todo");
        if (todo != null) {
            todos.add(todo);
            resp.getWriter().println("Add Todo : " + todos);
        } else {
            resp.getWriter().println("Todo paramater must exists");
        }
    }

}
