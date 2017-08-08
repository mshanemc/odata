package com.herokuapp.odata;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public final class Index extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>oData Demo Sources</title>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<h1>oData Demo Sources</h1>");
        writer.println("<ul>");
        writer.println("<li><a href='/dreamhouse'>DreamHouse</a></li>");
        writer.println("<li><a href='/huzzah'>Huzzah</a></li>");
        writer.println("<li><a href='/ibm'>IBM</a></li>");
        writer.println("<li><a href='/sap'>SAP</a></li>");
        writer.println("<li><a href='/workday'>Workday</a></li>");
        writer.println("<li><a href='/hero'>Hero</a></li>");
        writer.println("</ul>");
        writer.println("</body>");
        writer.println("</html>");

    }

}
