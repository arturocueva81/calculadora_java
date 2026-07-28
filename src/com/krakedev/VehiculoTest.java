package com.krakedev;

public class VehiculoTest {

	public static void main(String[] args) {
		
		Vehiculo v1=new Vehiculo("Toyota", "Corolla", "2023", 25000.0);
		
		System.out.println("Marca: " + v1.getMarca());
        System.out.println("Modelo: " + v1.getModelo());
        System.out.println("Año: " + v1.getAnio());
        System.out.println("Valor: $" + v1.getValor());
		
        Vehiculo v2 = new Vehiculo("Chevrolet", "Spark", "2022", 15000.0);
        System.out.println("\nMarca: " + v2.getMarca());
        System.out.println("Modelo: " + v2.getModelo());
        System.out.println("Año: " + v2.getAnio());
        System.out.println("Valor: $" + v2.getValor());

	}

}
