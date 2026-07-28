package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		
		Calculadora c1= new Calculadora(10,2);
		System.out.println("Suma: "+c1.sumar());
		System.out.println("Resta:"+c1.restar());
		System.out.println("Multiplicacion: "+c1.multiplicar());
		System.out.println("Division entre: "+c1.dividir());
		
		Calculadora c2= new Calculadora(7,8,9);
		System.out.println("Promedio: "+c1.promediar());
		
		Calculadora c3 = new Calculadora("Ahorita no joven, Sali al almuerzo. Regreso en 15 minutos");
		System.out.println("MENSAJE: ");
		c3.mostrarResultado();
		
		Calculadora test = new Calculadora(200,14);
		System.out.println("El descuento es:"+test.descuento());
		
	}

}
