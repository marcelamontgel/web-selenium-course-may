package com.ejercicioclase;

public class Multiplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double z = multiplicacionNumeros (3,8);
		imprimirMultiplicacion(z);
		
	}

	public static double multiplicacionNumeros(int x, int y) {
		return (x*y);
		
	}
	
	public static void imprimirMultiplicacion (double z) {
		System.out.println("Resultado: " + (z));
	}
}
