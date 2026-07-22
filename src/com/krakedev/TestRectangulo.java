package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo();
		r1.base=5;
		r1.altura=4;
		int resultadoArea=r1.calcularArea();
		System.out.println("Resultado: "+resultadoArea);
		
		Rectangulo r2 = new Rectangulo();
		r2.base=8;
		r2.altura=2;
		int resultadoArea2=r2.calcularArea();
		System.out.println("Resultado: "+resultadoArea2);
		
		r1.base =4;
		r1.altura=2;
		int resultadoPerimetro=r1.calcularPerimetro();
		System.out.println("El perimetro del rectangulo es: "+resultadoPerimetro);

	}

}
