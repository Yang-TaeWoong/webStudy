<%@ page contentType = "text/html;charset=utf-8" %>
<html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>
        title will be here.    
    </title>    
        
    </head>
    <body>
        <%	
            StringBuffer url = request.getRequestURL(); 
            out.print("url : "+url.toString());
            out.print("<br>");
        %>        
    </body>
    
</html>
<!-- request, out, 등은 내장 객체 -->
<!-- 변수를 jsp 선언문에서 선언하면 서블릿에서는 service 메소드 밖에 선언하는 것. 그러나 내장 객체는 service 메소드 안에 선언되어 있다.-->