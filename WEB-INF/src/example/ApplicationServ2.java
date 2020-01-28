package example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrontServlet
 */       

@WebServlet("/ApplicationServ2")
public class ApplicationServ2 extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ApplicationServ2() {
        super();
        // TODO Auto-generated constructor stub
    }

    // protected void init(ServletConfig config) throws ServletException {
        
    // }
    
    /**
     * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        ServletContext application = getServletContext();
        try{
            int value = (int)application.getAttribute("value");
            value++;
            application.setAttribute("value",value);
            out.println("<h1>value : "+value+"</h1>");
        }
        catch(NullPointerException e){
            out.println("value 값이 설정되지 않아 조회가 어렵습니다");       
        }
    }
    // public void destory(){
        
    // }
}