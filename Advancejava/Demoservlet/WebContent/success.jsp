<%
    if ((session.getAttribute("userid") == null) || (session.getAttribute("userid") == "")) {
%>
You are not logged in<br/>
<a href="index.jsp">Please Login</a>
<%} else {
%>



<div class="container-fluid bg-2 text-center">
<center>Welcome <%=session.getAttribute("userid")%></center>
<br>
<br>
<a href="addplayer1.html">Add Player</a>
<br>
<br>
<a href="addteam1.html">Add Team</a>
<br>
<br>
<a href="addAuction1.html">Add Auction</a>
<br>
<br>
<a href="viewteams.jsp">View Player Teams</a>
<br>
<br>
<a href="viewplayers.jsp">View Players</a>
<br> 
<br>
<a href="viewAllteams.jsp">View AllTeams</a>
<br> 
<br>
<br>
<br>
<a href='logout.jsp'>Log out</a>
 </div>

<%
    }
%><%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>IPL 2020 </title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <style>
       

        p {
            font-size: 16px;
        }

        .margin {
            margin-bottom: 45px;
        }

        a:hover {
            color: #1abc9c !important;
        }
  }
    </style>
<meta charset="ISO-8859-1">
</head>
<body>

</body>
</html>