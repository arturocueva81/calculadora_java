package com.krakedev;

public class VehiculoTest {

	public static void main(String[] args) {
		
		Vehiculo v=new Vehiculo();
		
		v.anio="2005";
		v.marca="Toyota";
		v.modelo="Corolla";
		
		System.out.println();
		System.out.println("Año: "+ v.anio);
		System.out.println("Marca: "+ v.marca);
		System.out.println("Modelo: "+ v.modelo);
		System.out.println();

	}

}
