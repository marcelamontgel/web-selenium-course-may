package com.java;

public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Detector de velocidad

		int velocidad = 100; //Km/H
		int velocidadLimite = 80;
		
//		if(velocidad >= velocidadLimite) {
//			System.out.println("Exceso de velocidad");
//		}else {
//			System.out.println("Velocidad permitida");
//		}
		
		// if anidados
		
		boolean carretera = true;
		
		if (carretera) {
			System.out.println("Esto es una carretera");
			
			velocidadLimite = 110;
			
			if (velocidad > velocidadLimite) {
				System.out.println("Exceso de velocidad");
			}else {
				System.out.println("Velocidad permitida");
			}
			
		} else if (velocidad > velocidadLimite) {
			System.out.println("Padimento. Exceso de velocidad");
		}else {
			System.out.println("Padimento. Velocidad permitida");
		}
		
		//switch case
		
		int temperatura = 17;
		
		switch (temperatura) {
		
		case 5:
			System.out.println("Muy Frío");
			break;
		case 10:
			System.out.println("Frío");
			break;
		case 15:
		case 16:
		case 17:
		case 18:
		case 19:
			System.out.println("Tibio");
			break;
		case 20:
			System.out.println("Calor");
			break;
		case 25:
			System.out.println("Muy Caliente");
			break;
			default: // si no usa los valores de los casos se va por el default
				System.out.println("No es posible relacionar valor temperatura");
		
		}
	}

}
