## 기본 양식

##### html

* * *
```html
<!DOCTYPE html>
<html lang= "ko">
<head>
<meta charset="utf-8">
<title>제목</title>
</head>
<body>

내용

</body>
</html>

```

##### java Servlet

``` java
package example;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrontServlet
 */       

public class BackServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BackServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    // protected void init(ServletConfig config) throws ServletException {
        
    // }
    
    /**
     * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
     */
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    // public void destory(){
        
    // }
}
```
* * *

##### web.xml 

* * *



* * *
