package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuadrado c1=new Cuadrado();
		Cuadrado c2=new Cuadrado();
		Cuadrado c3=new Cuadrado();
		double areaC;
		double perimetroC;
		
		
		c1.lado=4;
		areaC=c1.calcularArea();
		perimetroC=c1.calcularPerimetro();
		System.out.println("** Cuadrado 1, lado: "+c1.lado);
		System.out.println("El area del cuadrado es: "+areaC);
		System.out.println("El perimetro del cuadrado es: "+perimetroC);
		
		c2.lado=3;
		areaC=c2.calcularArea();
		perimetroC=c2.calcularPerimetro();
		System.out.println("** Cuadrado 2, lado: "+c2.lado);
		System.out.println("El area del cuadrado es: "+areaC);
		System.out.println("El perimetro del cuadrado es: "+perimetroC);
		
		c3.lado=7;
		areaC=c3.calcularArea();
		perimetroC=c3.calcularPerimetro();
		System.out.println("** Cuadrado 3, lado: "+c3.lado);
		System.out.println("El area del cuadrado es: "+areaC);
		System.out.println("El perimetro del cuadrado es: "+perimetroC);		

	}

}
