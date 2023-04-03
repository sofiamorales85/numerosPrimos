package com.numerosPrimos;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class servletSuma
 */
public class servletSuma extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int intentos = 0;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public servletSuma() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		HttpSession sesion = request.getSession();
		
		usuario usuarioSesion = (usuario) sesion.getAttribute("usuario");
		System.out.println("Usuario sesion SUMA: " + usuarioSesion);
		
		int sumaPrimos = 0;
		int numeroPrimo =0;
		// leer la el número del formulario principalOperacion
		int numeroIngresado = Integer.parseInt(request.getParameter("numero"));
		// Llamar al metodo para evaluar el producto y que sume los primos menores a el.
		System.out.println(intentos + " candidad de intentos");
		while (true) {
			// entrada de numero
			if (numeroIngresado > 1) {

				for (int i = 2; i <= numeroIngresado; i++) {
					int creciente = 2;
					boolean esPrimo = true;
					System.out.println("Ingresa al IF");

					while (esPrimo && creciente < i) {

						if (i % creciente == 0) {
							esPrimo = false;
						} else {
							creciente++;
						}
					}
					if (esPrimo) {
						System.out.println(i + " es un número primo.");
						numeroPrimo = i;
						sumaPrimos = sumaPrimos + i;
					}
				}
				request.setAttribute("resultado", sumaPrimos);
				/*request.getRequestDispatcher("/principalOperacion.jsp").forward(request, response);*/
				System.out.println("La suma de los números primos menores a " + numeroIngresado + " es: " + sumaPrimos);

				FileWriter archivo = new FileWriter("C:\\Users\\ejeymoz\\Downloads\\numerosPrimos.txt", true);
				PrintWriter pw = new PrintWriter(archivo);
				pw.println("Intento #: " + intentos + " suma de los primos: " + sumaPrimos + " del numero ingresado: "
						+ numeroIngresado + "usuario ingresado: " + usuarioSesion);
				pw.close();
				intentos += 1;

			} else {
				request.setAttribute("resultado", "invalido");
				/*request.getRequestDispatcher("/principalOperacion.jsp").forward(request, response);*/
				System.out.println("El número es inválido " + numeroIngresado + " intentelo de nuevo");
			}
			{
				break;
			}

		}
	}

}
