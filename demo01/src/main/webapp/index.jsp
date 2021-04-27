<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sueldo de un Trabajador</title>
</head>
<body>
	<form action="index.jsp" method="post">
		<p>Ingrese Nombre:</p>
		<input type="text" name="nombre"></input>
		<p>Ingrese Sueldo:</p>
		<input type="text" name="salario"></input>
		<p>Ingrese Horas Extra:</p>
		<input type="text" name="extra"></input><br>
		<p>Ingrese Pago por Horas Extra:</p>
		<input type="text" name="payment"></input><br>
		<input type="submit" name="enviar" value="Calcular Sueldo"></input>
	</form>
</body>
</html>
<% 
	if(request.getParameter("enviar")!=null){
		String name = request.getParameter("nombre");
		int num1= Integer.parseInt(request.getParameter("salario"));
		int num2= Integer.parseInt(request.getParameter("extra"));
		int num3= Integer.parseInt(request.getParameter("payment"));
		int sueldoT=num1 + num2*num3;
		out.print("El Sueldo a percibir para "+ name + " es: " + sueldoT);
	}
%>