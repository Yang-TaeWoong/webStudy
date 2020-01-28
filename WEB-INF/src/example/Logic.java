      
package example;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Logic")
public class Logic extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    
    public Logic() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int diceValue=(int)(Math.random()*6) + 1;
        request.setAttribute("dice",diceValue);
        RequestDispatcher requestDispatch =request.getRequestDispatcher("/jspPart/forward.jsp");
        requestDispatch.forward(request,response);
    }
}