package com.krakedev;

public class Calculadora {
	
	private double num1, num2, num3;
	private String mensaje;
	
	//Constructores
	public Calculadora(double num1, double num2) {
		this.num1=num1;
		this.num2=num2;
	}
	
	public Calculadora(String mensaje) {
		this.mensaje=mensaje;
	}
	
	public Calculadora(double num1, double num2, double num3) {
		this.num1=num1;
		this.num2=num2;
		this.num3=num3;
	}
	
	//FUNCIONES DE OPERACIONES MATEMATICAS
	public double sumar () {
		return num1+num2;
	}
	
	public double restar () {
		return num1-num2;
	}
	
	public double multiplicar () {
		return num1*num2;
	}
	
	public double dividir() {
		if(num2==0) {
			System.out.println("No se puede dividir entre cero");
			return 0;
		}
		return num1/num2;
	}
	
	//Funciones de Promedio, MostrarResultado, Descuento
	public double promediar() {
		return (num1+num2+num3)/3;
	}
	
	public void mostrarResultado() {
		System.out.println(mensaje);
	}
	
	public double descuento() {
		return num1-(num1*(num2/100)); 
	}
}
