package com.numerosPrimos;

import java.sql.Date;

public class usuario {

	// ------------------------
	// MEMBER VARIABLES
	// ------------------------
	// Usuario Attributes
	private String nombre_usuario;
	private String correo;
	private String contrasenia;
	private Date fecha_hora;

	// ------------------------
	// CONSTRUCTOR
	// ------------------------
	public usuario(String aNombre_usuario, String aCorreo, String aContrasenia, Date aFecha_hora) {
		nombre_usuario = aNombre_usuario;
		correo = aCorreo;
		contrasenia = aContrasenia;
		fecha_hora = aFecha_hora;
	}

	// ------------------------
	// INTERFACE
	// ------------------------
	public String getNombre_usuario() {
		return nombre_usuario;
	}

	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public Date getFecha_hora() {
		return fecha_hora;
	}

	public void setFecha_hora(Date fecha_hora) {
		this.fecha_hora = fecha_hora;
	}

}
