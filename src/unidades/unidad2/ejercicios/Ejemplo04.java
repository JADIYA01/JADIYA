package unidades.unidad2.ejercicios;

import java.util.Scanner;

public class Ejemplo04 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

		  System.out.print("¿Cuántos hermanos tienes? ");
	  
	        int cantidadHermanos = scanner.nextInt();
	        
	      
	        System.out.println("Tienes " + cantidadHermanos + " hermano(s).");
	        
	        System.out.println("¿cual es tu nota final del módulo? ");
	        int Notafinal= scanner.nextInt();
	        
	        System.out.println("Tienes " + Notafinal +" de nota final");
	        
	        System.out.println ("¿En que provincia vives?");
	
	        String provincia= scanner.next();
	        System.out.println("Vivo en " + provincia );
	
	        System.out.println("¿en qué pueblo vives? ");
	        String  pueblo= scanner.next();
	        System.out.println("Vivo en " + pueblo );
	        
	        System.out.print("¿Cuantos pasajeros hay en un bus? ");
	        int cantidadPasajeros= scanner.nextInt();
	        System.out.println("Hay " + cantidadPasajeros + " pasajeros en un bus ");
	        
	        System.out.println("¿Con cuantos puntos gana un jugador de baloncesto  ? ");
	        int numPuntos = scanner.nextInt();
	        System.out.println("Un jugador gana " + numPuntos + " puntos en baloncesto ");
	        
	        System.out.println("¿Cuanto vale este artículo ? ");
	        double precio$  = scanner.nextDouble();
	        System.out.println("este artículo vale " + precio$ +"€");
	        
	        System.out.println("¿en qué año subió el hombre a la luna ? ");
	        int año = scanner.nextInt();
	        System.out.println("el hombre subió a la luna en " + año );
	        
	        
	        System.out.println("¿cuantas patas tiene un gato ? ");
	        int cantidadPatas = scanner.nextInt();
	        System.out.println("el gato tiene " + cantidadPatas + " patas");
	        
	        System.out.println("¿Cuanto vale este coche ? ");
	        double precio  = scanner.nextDouble();
	        System.out.println("este coche cuesta " + precio + "€");
	        
	        
	        
	        
	  
	        
	        scanner.close();

	}

}
