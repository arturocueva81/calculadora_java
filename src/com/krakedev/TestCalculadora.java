package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		
		Calculadora c1= new Calculadora();
		int num1, num2;
		double num3, num4, dividendo, divisor,valor1, valor2, valor3;
		num1=2;
		num2=7;
		num3=10;
		num4=5;
		dividendo=10;
		divisor=2;
		valor1=10;
		valor2=8;
		valor3=9;
		
		System.out.println("Suma: "+c1.sumar(num1, num2));
		System.out.println("Resta:"+c1.restar(num1, num2));
		
		//Taller Calculadora
		//Funcion Multiplicar doubles, reciben los parametros de tipo double: num3 y num 4
		System.out.println("El producto entre "+num3+" y "+num4+" es: "+c1.multiplicar(num3, num4));
		
		//Funcion Dividir doubles, reciben los parametros de tipo double: dividendo y divisor
		System.out.println("La división entre "+dividendo+" y "+divisor+" es: "+c1.dividir(dividendo, divisor));
		
		//Funcion Promediar doubles, reciben los parametros de tipo double: valor1, valor2 y valor3
		System.out.println("El  promedio de: "+valor1+", "+valor2+", y : "+valor3+", es: "+c1.promediar(valor1, valor2, valor3));
		
		//Funcion mostrarResultado  no recibe ningun parametros, solo imprime el mensaje en pantalla
		System.out.println("MENSAJE: ");
		c1.mostrarResultado();
	}

}
