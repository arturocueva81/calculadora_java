package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo();
		r1.setBase(5);
		r1.setAltura(4);;
		int resultadoArea=r1.calcularArea();
		System.out.println("Resultado: "+resultadoArea);
		
		Rectangulo r2 = new Rectangulo();
		r2.setBase(5);
		r2.setAltura(2);;
		int resultadoArea2=r2.calcularArea();
		System.out.println("Resultado: "+resultadoArea2);
		
		r1.setBase(4);
		r1.setAltura(6);
		int resultadoPerimetro=r1.calcularPerimetro();
		System.out.println("El perimetro del rectangulo es: "+resultadoPerimetro);

	}

}
