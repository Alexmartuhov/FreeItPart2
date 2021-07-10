package servlets;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class MyThirdServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        Enumeration<String> params = request.getParameterNames();
        out.println("<html><head><title>Third Servlet</title></head>");
        while (params.hasMoreElements()) {
            String paramName = params.nextElement();
            out.println(paramName + "=");
            String param = request.getParameter(paramName);
            out.println(param + " ");
        }
        out.println("</body");
        out.println("</html");
        String brand=request.getParameter("brand");
        Cookie cookie = new Cookie("brand", brand);
        response.addCookie(cookie);
    }
}
