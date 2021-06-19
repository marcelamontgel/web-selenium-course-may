package com.java;

public class Operadores {

	public static void main(String[] args) {

		// aritmeticos

		double x = 2;
		double y = 3;

		double z = x / y;

		System.out.println("Este es el valor de z: " + z);

		// unarios

		int a = 1;
		int b = 2;

		System.out.println(++b);
		System.out.println(b);
		System.out.println(++b);
		System.out.println(b);

		// operadores relacionales

		if (a >= b) {
			System.out.println("block code");
		}

		// operadores condicionales

		int var1 = 4;
		int var2 = 5;
		int var3 = 0;
		int var4 = 6;

		if (var1 == var2 || var3 == var4) {
			System.out.println("Bloc Code 2");
		}

	}

}
