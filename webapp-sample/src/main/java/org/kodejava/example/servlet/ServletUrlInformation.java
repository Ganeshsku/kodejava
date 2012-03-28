package org.kodejava.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletUrlInformation extends HttpServlet {
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {
        //
        // Getting servlet request URL
        //
        String url = request.getRequestURL().toString();

        //
        // Getting servlet request query string.
        //
        String queryString = request.getQueryString();

        //
        // Getting request information without the hostname.
        //
        String uri = request.getRequestURI();

        //
        // Below we extract information about the request object path
        // information.
        //
        String scheme = request.getScheme();
        String serverName = request.getServerName();
        int portNumber = request.getServerPort();
        String contextPath = request.getContextPath();
        String servletPath = request.getServletPath();
        String pathInfo = request.getPathInfo();
        String query = request.getQueryString();

        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.print("Url: " + url + "<br/>");
        pw.print("Uri: " + uri + "<br/>");
        pw.print("Scheme: " + scheme + "<br/>");
        pw.print("Server Name: " + serverName + "<br/>");
        pw.print("Port: " + portNumber + "<br/>");
        pw.print("Context Path: " + contextPath + "<br/>");
        pw.print("Servlet Path: " + servletPath + "<br/>");
        pw.print("Path Info: " + pathInfo + "<br/>");
        pw.print("Query: " + query);
    }
}