package com.numerosPrimos;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

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
	
		String usuarioLocal = request.getParameter("usuario");
		String contraseniaLocal= request.getParameter("contrasenia");
		
		if((usuarioLocal != null) && (contraseniaLocal != null) ) {
			//Captura usuario y clave en ámbito de sesion
			HttpSession sesion = request.getSession();
			sesion.setAttribute("usuario", usuarioLocal);
			sesion.setAttribute("contrasenia", contraseniaLocal);
			getServletContext().getRequestDispatcher("/principalOperacion.jsp").forward(request, response);
		}else {
			request.setAttribute("usuarioValido", "invalido");
		}
		

		  
	}

}
