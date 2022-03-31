package com.program;

import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault( Locale.US );
		
		// EQUAÇÃO DE BHASKARA 
		
		double a = 3;
		double b = -15;
		double c = 12;
		double delta , x1 , x2;
		
		delta = Math.pow( b , 2.0 ) - 4*a*c;
		x1 = ( - b + Math.sqrt( delta )) / ( 2.0 * a );
		x2 = ( - b - Math.sqrt( delta )) / ( 2.0 * a );
		
		System.out.println( " o valor de delta é : " + delta );
		System.out.println( " o valor de x1 é : " + x1 );
		System.out.println( " o valor de x2 é : " + x2 );
	
	}
}
