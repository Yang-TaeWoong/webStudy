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

@WebServlet("/ApplicationServ1")
public class ApplicationServ1 extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ApplicationServ1() {
        super();
        // TODO Auto-generated constructor stub
    }

    // protected void init(ServletConfig config) throws ServletException {
        
    // }
    
    /**
     * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
     */
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        
           ServletContext application = getServletContext(); // 전체 웹 에플리케이션 ServletContext라는 객체를 얻어낼수 있다. 실제 웹 에플리케이션 영역.
        int value = 1;
        application.setAttribute("value",value);
        out.println("<h1>value : "+value+"</h1>");
//      
    }
    // public void destory(){
        
    // }
}