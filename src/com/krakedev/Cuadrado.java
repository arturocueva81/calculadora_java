package com.krakedev;

public class Cuadrado {
	private int lado;
	
	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	public double calcularArea() {
		double areaCuadrado=lado*lado;
		return areaCuadrado;
	}
	
	public double calcularPerimetro() {
		double perimetroCuadrado=lado*4;
		return perimetroCuadrado;
	}

}
