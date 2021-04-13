<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="webjars/bootstrap/4.6.0/css/bootstrap.min.css" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Kayit</title>
<style>
body {
  background-color: #CCC;
}
footer {
	position: absolute;
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
		      	<a class="nav-link" href="listeleme">Liste</a>
		    	</li>
		  	</ul>
	</div>	
  </nav>
</header>

  		<div class="container">
		 	<form class="form" action="registration" modelAttribute="person" method="post">
			    <div>
				    <h2>Registration</h2>
					<p>Bosluklari doldurarak kayit olabilirsiniz.</p>
			    </div>
				 		
						    		<div class="form-group">
								    	<label for="isim"><b>Isim:</b></label>						    		
								    	<input type="text" class="form-control" placeholder="Isim" name="isim" id="isim" required>
						    		 </div>
						    	
						    		<div class="form-group">
								    	<label for="soyisim"><b>Soyisim:</b></label>								   
								    	<input type="text" class="form-control" placeholder="Soyisim" name="soyisim" id="soyisim" required>
						    		</div>
								  
								    <div class="form-group">
								    	<label for="kangrubu"><b>Kangrubu:</b></label>								   
								    	<input type="text" class="form-control" placeholder="Kangrubu" name="kangrubu" id="kangrubu" required>
								    </div> 
									
									<div class="form-group">
								    	<label for="telefon"><b>Telefon:</b></label>								    
								    	<input type="text" class="form-control" placeholder="Telefon" name="telefon" id="telefon" required>
									</div>   
									
									<div class="form-group">
								    	<label for="adres"><b>Adres:</b></label>								   
								    	<input type="text" class="form-control" placeholder="Adres" name="adres" id="adres" required>
									</div>
								  
					    				<button type="submit" class="btn btn-success">Register</button>
								
			 		
			</form>
  		</div>
 <footer>
	<p>All rights reserved.</p>

	<p>Click to read the terms of use..</p>
</footer>
 
	
	<script src="webjars/jquery/3.2.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/4.6.0/js/bootstrap.min.js"></script>
	
</body>
</html>