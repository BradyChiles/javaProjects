<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>User Submission Form</title>

</head>

<body>

	<h2>User Submission Form</h2>
	
	<form method = "post" action = "userSubmission">
	
		<fieldset>
			<legend>Personal Information</legend>
			
				<label for = "firstname">First Name</label>
				<input type = "text" id = "firstname" name = "firstname">
				
				<label for = "lastname">Last Name</label>
				<input type = "text" id = "lastname" name = "lastname">
				
				<label for = "address">Address</label>
				<input type = "text" id = "address" name = "address">
				
				<br>
				
				<label for = "city">City</label>
				<input type = "text" id = "city" name = "city">
				
				<label for = "state">State</label>
				<input type = "text" id = "state" name = "state">
				
				<label for = "zip">Zip Code</label>
				<input type = "text" id = "zip" name = "zip">
		</fieldset>
		
		<fieldset>
			<legend>Contact Information</legend>
			
				<label for = "email">Email</label>
				<input type = "text" id = "email" name = "email">
				
				<label for = "phone">Phone Number</label>
				<input type = "text" id = "phone" name = "phone">
		</fieldset>
		
		<fieldset>
			<legend>Cooking Information</legend>
			
				<p>What information about food and cooking are you interested in receiving?</p>
				
				<input type = "checkbox" name = "cooking" value = "newsletter" /> Monthly Newsletter
				<input type = "checkbox" name = "cooking" value = "classes" /> Classes
				<input type = "checkbox" name = "cooking" value = "recipes" /> Recipes
				<input type = "checkbox" name = "cooking" value = "private" /> Private Chefs 
		</fieldset>
		
		<fieldset>
			<legend>Comments</legend>
			
			<textarea rows="5" cols="30" name = "comments"></textarea>
		</fieldset>
		
		<input type = "submit" value = "Submit" />
		<input type = "reset" value = "Clear" />
	
	</form>
	
</body>

</html>