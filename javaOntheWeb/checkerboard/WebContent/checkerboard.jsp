<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" type="text/css" href="styles.css">
<head>
<meta charset="ISO-8859-1">
<title>title of CheckBoard</title>


</head>

<body>

	<%
		String ht = request.getParameter("height");
	%>
	<%
		String wd = request.getParameter("width");
	%>

	<h1>
		Display by user size:<%=ht%>
		h x
		<%=wd%>w
	</h1>
	<%
		for (int height = 0; height < Integer.parseInt(request.getParameter("height")); height++) {
	%>
	<div>
		<%
			for (int width = 0; width < Integer.parseInt(request.getParameter("width")); width++) {
		%>

		<%
			if (width % 2 == 0 && height % 2 == 0 || width % 2 == 1 && height % 2 == 1) {
		%>
		<div class="red"></div>
		<%
			} else {
		%>
		<div class="blue"></div>


		<%
			}
		%>
		<%
			}
		%>
	</div>
	<%
		}
	%>

</body>



</html>