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
PlayerDao pd=new PlayerDao();
List<Player> li=pd.getAllPlayers();
%>
<table>
<tr>
<th>Player Number</th>
<th>Player Name</th>
<th>Country</th>
<th></th>
</tr>
<%
for(Player p:li){
%>
<tr>
<td><%=p.getPid() %></td>
<td><%=p.getName() %></td>
<td><%=p.getCountry() %></td>
<td><a href="editplayer.jsp?id=<%=p.getPid()%>">Update</a></td>
</tr>
<%} %>
</table>

</body>
</html> 