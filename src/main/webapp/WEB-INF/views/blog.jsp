<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	html, body {
		margin : 0;
		padding : 0;
	}
	
	nav {
		width: 250px;
		position: fixed;
		height : 100vh;
		border: 1px solid red;
	}
	
	section {
		width: calc(100% - 250px);
		border: 1px solid blue;
		position: relative;
		left: 250px;
	}
	
	section article {
		border: 1px solid black;
		height: 500px;
	}
	
	footer {
		border: 1px solid green;
		height: 20vh;
		width: calc(100% - 250px);
		position: relative;
		left: 250px;
	}
	
	@media screen and (max-widht: 1000px) {
		nav {
			width: 100%;
			height: 10vh;
		}
		
		section {
			left: 0;
			width: 100%;
			top: 10vh;
		}
	}
</style>
</head>
<body>
	<nav>nav</nav>
	<section>
		<article></article>
		<article></article>
		<article></article>
	</section>
	<footer>footer</footer>
</body>
</html>