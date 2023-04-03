package com.numerosPrimos;

import jakarta.servlet.ServletException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.Date;

/**
 * Servlet implementation class InicioSesion
 */
public class InicioSesion extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InicioSesion() {
        super();
        // TODO Auto-generated constructor stub
    }
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	
		
		//obtenemos variables de formulario	
		String usuarioLocal = request.getParameter("usuario");
		System.out.println("Usuario del formulario " + usuarioLocal);
		String contraseniaLocal= request.getParameter("contrasenia");
		Date fechaIngreso = new Date();
		
		usuario objUsuario = new usuario(usuarioLocal,contraseniaLocal,fechaIngreso);
		if((usuarioLocal != null) && (contraseniaLocal != null) ) {
			//Captura usuario y clave en ámbito de sesion
			HttpSession sesion = request.getSession();
			String usuarioSesion = objUsuario.setNombre_usuario(usuarioLocal);
			System.out.println("Usuario del usuarioSesion " + usuarioSesion);
			String contrasenia = objUsuario.setContrasenia(contraseniaLocal);
					
			sesion.setAttribute("usuario", usuarioSesion);
			sesion.setAttribute("contrasenia", contrasenia);
			
			getServletContext().getRequestDispatcher("/principalOperacion.jsp").forward(request, response);
		}else {
			request.setAttribute("usuarioValido", "invalido");
		}
		

		  
	}

}
