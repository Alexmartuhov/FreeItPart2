package servlets;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFourServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out=response.getWriter();
        Cookie[] cookies=request.getCookies();
        String brand=null;
        for (Cookie cookie:cookies){
            if(cookie.getName().equals("brand")){
                brand = cookie.getValue();
            }
        }
        out.println("<html><head><title>Four Servlet</title></head>");
        out.println("<body>Car brand: "+brand+ "</body>");
        out.println("</html");
    }
}
