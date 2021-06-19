package com.java;

public class LimiteVelocidad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int velocidad = 80;
		int limiteVelocidad = 100;
		
		
		boolean highway = false;
		
		if(highway){
			System.out.println("Estamos conduciendo en un highway");
			
			limiteVelocidad = 120;
			
			if(velocidad > limiteVelocidad) {
				System.out.println("MULTA");
				}else {
					System.out.println("El coche va a la velocidad adecuada");
				}
			
		}
	
		
		//Switch Case
		
		int temperatura = 87;
		
		switch (temperatura) {
		case 5:
			System.out.println("Muy frío");
			break;
		case 10: 
			System.out.println("Frío");
			break;
		case 20:
			System.out.println("Templado");
			break;
			default:
				System.out.println("No contamos con la temperatura insertada");
		
		}
	
	}
	

}
