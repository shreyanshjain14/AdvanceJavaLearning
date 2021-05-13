  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ page import ="java.util.*,com.ltts.model.*,com.ltts.dao.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int id=Integer.parseInt(request.getParameter("id"));
teamdao pd=new teamdao();
team p1=pd.getAllTeamById(id);
%>
<form action="./UpdateTeamServlet" method="post">
<input type="hidden" name="id" value= <%=p1.getTeam_id() %>> <br><br>
Team Name: <input type="text" value="<%=p1.getTeam_name() %>" name="tname"><br><br>
Owner Name: <input type="text" value="<%=p1.getOwnerName() %>" name="oname"><br><br>
Coach Name: <input type="text" value="<%=p1.getCoachName() %>" name="cname"><br><br>
<input type="submit" value="Update Team">

</form>
</body>
</html>