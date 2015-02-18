<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Calculatrice</title>
</head>
<body>
	<p>Calculatrice:</p>

	<form action="calculatriceUrl" method="get">
		<input type="text" name="nombre1" /> <SELECT name="operation">
			<OPTION>+
			<OPTION>-
			<OPTION>*
			<OPTION>/
		</SELECT> <input type="text" name="nombre2" /> <input type="submit"
			value="soumettre" />
	</form>







	<%
		String nomOp = (String) request.getAttribute("nomOperation");
		if (nomOp != null)
			if (nomOp.equals("div0")) {
	%>
	<br /> Division par 0 impossible
	<%
		} else {
	%>
	<br /> ${ nomOperation!=null ? "Le résultat de ":""}${ nomOperation!=null ? nomOperation:"" }
	${ nomOperation!=null ? "est":"" } ${ resultat!= null ? resultat:"" }
	<%
		}
	%>


</body>
</html>