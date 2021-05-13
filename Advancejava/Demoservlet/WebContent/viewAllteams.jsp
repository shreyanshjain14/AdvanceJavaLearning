lines (36 sloc)  688 Bytes
  
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
teamdao pd=new teamdao();
List<team> li=pd.getAllTeam();
%>
<table>
<tr>
<th>Team ID</th>
<th>Team Name</th>
<th>Owner Name</th>
<th>Coach Name</th>
</tr>
<%
for(team p:li)
{
	%>
	<tr>
	<td><%=p.getTeam_id()  %></td>
	<td><%=p.getTeam_name() %></td>
	<td><%=p.getOwnerName() %></td>
	<td><%=p.getCoachName() %></td>
	<td><a href="editteam.jsp?id=<%=p.getTeam_id()  %>">Update</a></td>
	</tr>
	<%} %>
</table>

</body>
</html>