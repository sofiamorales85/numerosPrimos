package com.numerosPrimos;

import java.util.Date;

public class NumerosPrimos {

	// ------------------------
	// MEMBER VARIABLES
	// ------------------------
	// Usuario Attributes
	private int num_ingresado;
	private int resultado;
	private boolean esPrimo;
	private int sumaPrimos;
	private int intentos;
	private int contadorN;

	// ------------------------
	// CONSTRUCTOR
	// ------------------------

	public NumerosPrimos(int aNum_ingresado, int aResultado, boolean aEsPrimo, int aSumaPrimos, int aIntentos,
			int aContadorN) {
		num_ingresado = aNum_ingresado;
		resultado = aResultado;
		esPrimo = aEsPrimo;
		sumaPrimos = aSumaPrimos;
		intentos = aIntentos;
		contadorN = aContadorN;
	}

	// ------------------------
	// INTERFACE
	// ------------------------

	public int getNum_ingresado() {
		return num_ingresado;
	}

	public void setNum_ingresado(int num_ingresado) {
		this.num_ingresado = num_ingresado;
	}

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}

	public boolean isEsPrimo() {
		return esPrimo;
	}

	public void setEsPrimo(boolean esPrimo) {
		this.esPrimo = esPrimo;
	}

	public int getSumaPrimos() {
		return sumaPrimos;
	}

	public void setSumaPrimos(int sumaPrimos) {
		this.sumaPrimos = sumaPrimos;
	}

	public int getIntentos() {
		return intentos;
	}

	public void setIntentos(int intentos) {
		this.intentos = intentos;
	}

	public int getContadorN() {
		return contadorN;
	}

	public void setContadorN(int contadorN) {
		this.contadorN = contadorN;
	}

}
