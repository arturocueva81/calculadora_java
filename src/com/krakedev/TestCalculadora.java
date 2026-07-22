package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		
		Calculadora c1= new Calculadora();
		int num1, num2;
		double num3, num4;
		num1=2;
		num2=7;
		num3=10;
		num4=5;
		
		System.out.println("Suma: "+c1.sumar(num1, num2));
		System.out.println("Resta:"+c1.restar(num1, num2));
		
		//Taller Calculadora
		//Funcion Multiplicar doubles, reciben los parametros de tipo double: num3 y num 4
		System.out.println("El producto entre "+num3+" y "+num4+" es: "+c1.multiplicar(num3, num4));

	}

}
