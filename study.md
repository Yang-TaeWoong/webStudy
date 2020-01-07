
##### edwith강의를 수강하면서 배운 지식들

* * *  

##### git part
* * *
- git add

- git commit

- git push

- git과 연동을 다른 폴더와 하고 싶다면 .git폴더 자체를 다른 곳으로 이동시킨다.

###### error

    

* * *
##### html part
* * *
* * *

##### javaScript part
* * *

* * *

##### jsp part  
* * *
- 모든 jsp는 서블릿으로 바뀌어서 동작한다  

- print문 
    - system.out.print는 콘솔에서 찍힘.

    - out.print는 페이지상에서 찍힘.


- lifecycle
    - jsp
        - _jsInit(), _jspservice(),_jspdestroy라는 이름을 갖는다.
    - servlet 
        - init, service, destroy 라는 이름을 갖는다.

- 기호

    - 선언문 : 
        - 전역 변수의 선언을 할 때  <%! %>

    - 스크립트릿
        - 프로그램 코드 기술에 사용 <% %>

    - 표현식 
        - 화면에 출력할 내용 기술에 사용. <%= %>

- 스크립트릿을 작성할때 html부분에 프로그래밍을 하고싶다면, <% %> 여기 <% %>, 여기에 html코드를 넣으면 된다.

- jsp는 주석이 세가지 종류 사용이 가능한데, jsp, java, html 주석을 사용할 수 있다.

    - jsp 주석 : <%-- --%>
        - jsp 주석은    
    - html 주석:  <-- -->
        - 
    - java 주석 : //, /* */ 
        - jsp에서 java로는 바뀌지만 자바를 실행시킬때 주석이므로 실행이 안된다. 
    - 내장객체
        - jsp가 생성될때 미리 존재하는 객체들.
        각각의 역할이 정해져 있음.
* * *
    
###### markDown part
* * *
- 리스트 생성
    - "-"를 사용. 
    - 하위 목록을 만들때는 들여쓰기를 한다.
    
* * *

###### network
- redirect
    - 302코드
    - location header value = redirect destination url
    - 응답객체와 수신 객체 두개가 만들어진다.
- forward
    - client가 리퀘스트를 주면 그걸 하나의 servlet에서 처리하는 게 아니라  
    다른 servlet으로 넘기고 받은 서블릿이 처리해서 client로 돌아감. 이 과정을 forward 라고 한다.
    - forward와 redirect의 차이점
        - url이 변하지 않는다.
        - forward의 경우 request, response 객체가 한번 만들어진다.(요청이 한번임) 
        - redirect의 경우 요청이 여러번 왔다갔다함. 따라서 request, request객체가 여러번 생성된다.
   
###### servlet

* * *

- <servlet-mapping>
    - <servlet-name>
        - url 패턴이 일치하면 이 이름을 가지는 servlet 으로 이동한다.
    - <url-pattern>
        - url 패턴을 등록한다.
        - 여기서 찾지 못하면 페이지에 404 오류를 띄운다.
        
- <servlet>
    - <description>
        - 설명 
    - <display-name>
        - url pattern이 일치하는게 들어오면 servlet-name이 같은 서블릿을 찾아서 <servlet-class> '패키지이름.파일명'을 실행시킨다.
 
    
* * *