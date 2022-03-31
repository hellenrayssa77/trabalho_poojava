package com.program;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
public static void main(String[] args) {
	
	Locale.setDefault( Locale.US );
	
	// CALCULAR A ÁREA DO CIRCULO
	
	System.out.print( " informe o valor do raio : " );
	try (Scanner scan = new Scanner (  System.in )) {
		double raio = scan.nextFloat();
		double area = Math.PI * raio * raio;
		
		System.out.print( " a área do circulo é : " );
		System.out.print( String.format( " %.4f " , area ) );
	}
}
}

