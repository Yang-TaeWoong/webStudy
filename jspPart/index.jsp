<!-- contentType 내가 응답을 보낼껀데 텍스트로 보낼꺼고 그 텍스트는 html형태라는 의미 -->
<!-- pageEncoding 부분은 jsp파일 자체가 utf - 8 로 되어있음을 알려주는 부분 -->
<!-- 이런 설정들은 jsp를 실행하는 was에서 확인 -->
<%@ page language="java" contentType = "text/html; charset=utf-8" pageEncoding= "UTF-8" %>
<%@ page import="example.*" %> 

<%
    int total = 0;
    for(int i=1;i<=10;i++){
        total+=i;
    }
%>
<!-- 요부분이 자바코드를 넣어주는 부분임! scriptlet 부분 -->

<html>
<body>
    1부터 10까지의 합은 ? <%= total %>  <!--  total 있는 부분을 표현식이라고 한다   out.print() == 표현식 시작 표현 -->
</body>	
</html>

<!-- 파일이 그냥 바로 실행되는 것이 아니라 tomcat이 jsp파일을 서블릿으로 바꿔준다 -->