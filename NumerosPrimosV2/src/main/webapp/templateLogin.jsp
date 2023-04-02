<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inicio de Sesión</title>
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
					<h3 class = "d-flex justify-content-center">Iniciar Sesión</h3>
				</div>
				<div class="card-body">
				<form action="InicioSesion" method="post">
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-user"></i></span>
						</div>
						<input type="text" class="form-control" id="usuario" name="usuario" placeholder="usuario">
					</div>
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-key"></i></span>
						</div>
						<input type="password" class="form-control" id = "contrasenia" name="contrasenia" placeholder="Contraseña">
					</div>
					<div class="form-group">
						<input type="submit" value="Ingresar" class="btn float-right login_btn">
					</div>
				</form>
				<p class = "p" >
					<%
					String usuarioVacio = "";
					usuarioVacio = String.valueOf(request.getAttribute("usuarioValido"));
					if (usuarioVacio.equals("invalido")){
						out.print("Usuario o Clave no valido, intente de nuevo.");	
					}
					%>
				</p>
			</div>
			</div>
		</div>
	</div>		
</body>
</html>