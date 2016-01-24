<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
 
<html>
<body>
<font color="#100175"> <h2>Hello World!</h2> </font>
 
I am feeling: ${ mood.feeling }. <br/><br/>

<a href="/one/moodreason?currentMood=${ mood.feeling }">Click here to know why I feel so</a>

</body>
</html>