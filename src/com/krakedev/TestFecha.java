package com.krakedev;

public class TestFecha {

	public static void main(String[] args) {
		Fecha f1=new Fecha();
                
                f1.setDia(1);
                f1.setMes(4);
                f1.setAnio(2026);
                
		
                System.out.println("Dia: "+f1.getDia()+", mes: "+f1.getMes()+", año: "+f1.getAnio());
	}

}
