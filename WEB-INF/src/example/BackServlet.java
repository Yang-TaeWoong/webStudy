package example;

import java.io.*;
import static java.lang.System.out;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrontServlet
 */       

@WebServlet("/BackServlet")
public class BackServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    public BackServlet() {
        super();
    }
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");       
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>form</title></head>");
        out.println("<body>");
        
        int dice = (Integer)request.getAttribute("dice");
        
        for(int i=0;i<dice;i++){
            out.println("<br>hello");
        }
        out.println("</body>");
        out.println("</html>");
    }
}