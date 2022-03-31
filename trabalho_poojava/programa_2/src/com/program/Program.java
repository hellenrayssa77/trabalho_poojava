package com.program;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args)  {
		
		Locale.setDefault( Locale.US );
		
		// ÁREA DAS FIGURAS GEOMÉTRICAS
		
		    @SuppressWarnings("resource")
			Scanner input = new Scanner( System.in ); 
		    	
			double a, b , c , pi;
			double triangulo , circulo , trapezio , quadrado , retangulo;
			
			pi = 3.14159;
			a = input.nextDouble();
			b = input.nextDouble();
			c = input.nextDouble();
			
			triangulo = a * c / 2;
			circulo = pi * c * c;
			trapezio = ( a + b ) * c / 2;
			quadrado = b * b;
			retangulo = a * b;
			
		System.out.println( " a área do triângulo é : " + String.format( " %.3f ", triangulo));
		
		System.out.println( " a área do circulo é : " + String.format( " %.3f ", circulo));
		
		System.out.println( " a área do trapézio é : " + String.format( " %.3f ", trapezio));
		
		System.out.println( " a área do quadrado é : " + String.format( " %.3f ", quadrado));
		
		System.out.println( " a área do retângulo é : " + String.format( " %.3f ", retangulo));
	}
}
