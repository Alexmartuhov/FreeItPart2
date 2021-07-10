package servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFirstServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        PrintWriter out=response.getWriter();
        out.println("<html><head><title>First Servlet</title></head>");
        out.println("<body>First Servlet out</body>");
        out.println("</html");
    }
}
