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

}
