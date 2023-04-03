package com.numerosPrimos;

import java.util.Date;

public class usuario {

	// ------------------------
	// atributos
	// ------------------------
	private String nombre_usuario;
	private String contrasenia;
	private Date fecha_hora;

	// ------------------------
	// CONSTRUCTOR
	// ------------------------
	public usuario(String aNombre_usuario, String aCorreo, String aContrasenia, Date aFecha_hora) {
		this.nombre_usuario = aNombre_usuario;
		this.contrasenia = aContrasenia;
		this.fecha_hora = aFecha_hora;
	}

	// ------------------------
	// INTERFACE
	// ------------------------
	public String getNombre_usuario() {
		return nombre_usuario;
	}

	public String setNombre_usuario(String usuario) {
		return this.nombre_usuario = usuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public String setContrasenia(String contrasenia) {
		return this.contrasenia = contrasenia;
	}

	public Date getFecha_hora() {
		return fecha_hora;
	}

	public Date setFecha_hora(Date fecha_hora) {
		return this.fecha_hora = fecha_hora;
	}

}
