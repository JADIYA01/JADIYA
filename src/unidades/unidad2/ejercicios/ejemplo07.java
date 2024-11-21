package unidades.unidad2.ejercicios;

import java.util.Scanner;

public class ejemplo07 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
		  	 boolean  esMayorDeEdad  = true;
	         boolean  trabaja = false;  
	   
	        System.out.println("¿tu hermano/a es mayor de edad? " );
	        int esMayorDeEdad1 = scanner.nextInt();
	     
	        if (esMayorDeEdad) {
	            System.out.println("La persona puede trabajar ");
	        } else {
	            System.out.println("La persona  no puede trabajar.<19 años");
	        }
	        if (trabaja) {
	           	
	        	System.out.println("es mayor de edad" );
	        	
	        }  else {
	            System.out.println(" no es mayor de edad.");
	        }
	        
	   
	        
	        scanner.close();
	}

}
