package servlets;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/second")
public class MySecondServlet extends HttpServlet {

    @Override
    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out=response.getWriter();
        System.out.println(request.getMethod());
        String model=request.getParameter("model");
        out.println("<html><head><title>Second Servlet</title></head>");
        out.println("<body>Second Servlet out");
        out.println("Car model: "+ model+"</body>");
        out.println("</html");
    }
}
