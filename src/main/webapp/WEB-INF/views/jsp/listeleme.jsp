<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@page import="com.pack.model.Person"%>
   
    
 <%ArrayList<Person> kisiler = (ArrayList<Person>)request.getAttribute("arraylist"); %>
 
<!DOCTYPE html>
<html>
<head>
<link href="webjars/bootstrap/4.6.0/css/bootstrap.min.css" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Listeler</title>
<style>
body {
  background-color: #CCC;

}
footer {
	position: fixed;
	width: 100%;
	color: black;
	height: 10vh;
	bottom: 0;
	background-color: #999;
}
</style>
</head>
<body>
<header>
  <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	<div class="container">
	  	<a class="navbar-brand" href="anasayfa.jsp">Kayit Sistemi</a>
		  	<ul class="nav nav-tabs justify-content-center">
		    	<li class="nav-item">
		      	<a class="nav-link" href="register">Kayit</a>
		    	</li>
		    	<li class="nav-item">
		      	<a class="nav-link" href="#">Liste</a>
		    	</li>
		
		  	</ul>
	  
	</div>	
  </nav>
</header>
	<div class="container">
		<h2>Kayitli Kisiler</h2>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>Isim</th>
					<th>Soyisim</th>
					<th>Kangrubu</th>
					<th>Telefon</th>
					<th>Adres</th>
				
				</tr>
			</thead>
			<tbody>
		<% for(int i = 0; i < kisiler.size(); i++) { %>
			<tr> 
				<% Person person = kisiler.get(i); %>
				<td>
					 <small>
						<%= person.getIsim() %>
					</small>
				</td>
				<td>
					<small>
						<%= person.getSoyisim() %>
					</small>
				</td>
				<td>
					<small>
						<%= person.getKangrubu()%>
					</small>
				</td>
				<td>
					<small>
						<%= person.getTelefon()%>
					</small>
				</td>
				<td>
					<small>
						<%= person.getAdres()%>
					</small>
				</td>
				
			</tr>		
		<% } %>
			</tbody>
		</table>
      
	</div>
<footer>
	<p>All rights reserved.</p>

	<p>Click to read the terms of use..</p>
</footer>
	
	<script src="webjars/jquery/3.2.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/4.6.0/js/bootstrap.min.js"></script>
	
</body>
</html>