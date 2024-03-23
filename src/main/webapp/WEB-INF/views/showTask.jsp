<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>

<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>

	<div
		class=" text-center bold mt-4 w-50 h-20 container shadow-lg p-3 mb-5 bg-body rounded">

		<h1 class="text-center mt-4 text-primary">Todo List</h1>

		<form class="form-inline" action="addData" method="post">
			<div class="form-group mx-sm-3 mb-2" required>
				<label for="inputPassword2" class="sr-only">Enter your Task</label>
				<input type="text" class="form-control mt-3" id="inputPassword2"
					placeholder="Task ...." name="text" required>
			</div>
			<button type="submit" class="btn btn-primary mb-2">Add</button>
		</form>

	</div>
	
	
	<button class="btn btn-primary"> <a href="viewAllData" class="p-2 text-white" style="text-decoration:none;">view Task</a></button>
	




	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>
</body>
</html>