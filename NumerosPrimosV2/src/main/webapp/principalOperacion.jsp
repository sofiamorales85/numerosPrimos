<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Numeros primos de un número</title>
<!--Bootsrap 5 CDN-->
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
<!--Fontawesome CDN-->
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css">
<!-- Estilos personalizados -->
<link rel="stylesheet" type="text/css" href="css/estilos.css">
</head>
<body>
	<div class ="container">
		<div class ="d-flex justify-content-center h-100">
			<div class ="card" >
				<div class ="card-header">
					<h3 class = "d-flex justify-content-center">Evaluar número</h3>
					<form action="servletSuma" method ="post">
						<div class="card-header">
							<label style = "color: white;" for="numero">Ingrese el número a evaluar:</label>
							<div class="input-group form-group">	
							<input type="text" class="form-control" id="numero" name="numero" placeholder="Número a evaluar > 1">
							</div>
						</div>
						<div class="form-group">
							<button class="btn float-right login_btn" type="submit">Enviar</button>
						</div>
					</form>					
					<p style="text-align: center; color: white;">
					<%
					String sumaprimos = "";
					sumaprimos = String.valueOf(request.getAttribute("resultado"));
					if (sumaprimos.equals("invalido")){
						out.print("El número ingresado es inválido, intente de nuevo.");	
					}else{
						out.print("La suma de los números primos menores al número ingresado es: "+ sumaprimos);
					}
					%>
					</p>
				</div>
			</div>
		</div>
	</div>
</body>
</html>