<%@ page contentType = "text/html;charset=utf-8" %>

<HTML>
    <head>
        <meta http-equiv= "contentType" content="text/html"; charset="UTF-8">
    <title>
        insert title here    
    </title>    
        
    </head>
    <body>
<%
    System.out.print("jspService()");
//     얘는 콘솔에 찍는 내용
    // out.print("jspService()");
        //얘는 페이지 상에 찍는다.
%>  
    <% for(int i=1;i<=4;i++){
    %>
        <h<%=i %>>
            안녕하세요</h>
    <%
        }
    %>
<!--     이런식으로 코드 부분은 처리 가능 -->
        

    </body>
</HTML>
