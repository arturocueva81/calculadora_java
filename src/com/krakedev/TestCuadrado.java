package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuadrado c1=new Cuadrado();
		Cuadrado c2=new Cuadrado();
		Cuadrado c3=new Cuadrado();
		double areaC;
		double perimetroC;
		
		
		c1.setLado(4);
		areaC=c1.calcularArea();
		perimetroC=c1.calcularPerimetro();
		System.out.println("** Cuadrado 1, lado: "+c1.getLado());
		System.out.println("El area del cuadrado es: "+areaC);
		System.out.println("El perimetro del cuadrado es: "+perimetroC);
		
		c2.setLado(3);
		areaC=c2.calcularArea();
		perimetroC=c2.calcularPerimetro();
		System.out.println("** Cuadrado 2, lado: "+c2.getLado());
		System.out.println("El area del cuadrado es: "+areaC);
		System.out.println("El perimetro del cuadrado es: "+perimetroC);
		
		c3.setLado(7);
		areaC=c3.calcularArea();
		perimetroC=c3.calcularPerimetro();
		System.out.println("** Cuadrado 3, lado: "+c3.getLado());
		System.out.println("El area del cuadrado es: "+areaC);
		System.out.println("El perimetro del cuadrado es: "+perimetroC);		

	}

}
