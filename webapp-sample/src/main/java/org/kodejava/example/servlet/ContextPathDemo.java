package org.kodejava.example.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

public class ContextPathDemo extends HttpServlet {
    protected void doGet(HttpServletRequest req,
                         HttpServletResponse res)
            throws ServletException, IOException {

        //
        // HttpServletRequest.getContextPath() returns the portion
        // of the request URI that indicates the context of the
        // request.
        //
        String contextPath = req.getContextPath();

        PrintWriter pw = res.getWriter();
        pw.print("Context Path: " + contextPath);
    }
}
