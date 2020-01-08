<% response.addHeader("Refresh","60"); %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style>
body{

font-size:55px;
text-align: right;
color:red;

font-family: 'Handlee', cursive;
    background:radial-gradient(circle,yellow,white,pink);
     background-size:400px 500px;
}
.cube{
    perspective:500px;
    perspective-origin:50% 300px;
}
.cube-face{
    margin:100px;
    top:10px;
    right:55px;
    width:100px;
    height:100px;
    position:relative;
    transform-style:preserve-3d;
    animation:up 5s  infinite linear;
    
    transition:width 10s linear;
    opacity:1;
   
}
div:hover{
    width:100px;
}
.cube-face div{
    width:100px;
    height:100px;
    text-align: center;
    

}
.cube-face-front{
text-align:center;
text-decoration:blink;	
    transform:translateX(25px);
    
}

.baloon{
margin:-50px;
    top:10px;
    right:70px;
    width:100px;
    height:100px
img{float:top ;}
position:absolute;
    transform-style:preserve-3d;
    animation:down 5s infinite  linear;
    transition:width 10s linear;
     opacity:0.7;
}
@keyframes up{
    from {
    
    transform:translate(0px,500px);
    -webkit-transform:translate(0px,-300px);
    
    }
    to {
    
    transform:translate(0px, 0px);
    -webkit-transform:translate(0px, 50px);
    
    }
}
@keyframes down{
    from {
    
    transform:translate(500px,500px);
    -webkit-transform:translate(0px,400px);
    
    }
    to {
    
    transform:translate(0px, 0px);
    -webkit-transform:translate(0px,-200px);
    
    }
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Oh!Birthday</title>
</head>
    <body>
        
            <div class="cube-face">
            
         <div class="cube-face-front">HAPPY <br> BIRTHDAY! <br>
               <c:forEach items="${message}" var="item">
    <tr>
      <td><c:out value="${item}"/></td>
    </tr>
  </c:forEach>
         
          </div>
        
            <div class="baloon"><img src="http://www.iconhot.com/icon/png/event-people/512/balloons-1.png"/></div> 
       
           
          
            
        </div>
    </body>

</body>
</html>