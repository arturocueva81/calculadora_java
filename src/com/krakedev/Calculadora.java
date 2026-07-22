package com.krakedev;

public class Calculadora {
	
	public int sumar (int a, int b) {
		int resultado=a+b;
		return resultado;
	}
	
	public int restar (int a, int b) {
		int resultado=a-b;
		return resultado;
	}
	
	public double multiplicar (double a, double b) {
		double resultado=a*b;
		return resultado;
	}
	
	public double dividir(double a, double b) {
		if(b==0) {
			System.out.println("No se puede dividir entre cero");
		}
		
		double resultado=(double)a/b;
		return resultado;
	}
	
	public double promediar(double a, double b, double c) {
		
		double promedio=(a+b+c)/3;
		return promedio;
	}
	
	public void mostrarResultado() {
		String mensaje= "Ahorita no joven, Salí al almuerzo. Regreso en 15 minutos";
		System.out.println(mensaje);
	}

}
