package com.krakedev;

public class VehiculoTest {

	public static void main(String[] args) {
		
		Vehiculo v=new Vehiculo();
		
		v.setAnio("2005");
		v.setMarca("Toyota");
		v.setModelo("Corolla");
		
		System.out.println();
		System.out.println("Año: "+ v.getAnio());
		System.out.println("Marca: "+ v.getMarca());
		System.out.println("Modelo: "+ v.getModelo());

	}

}
