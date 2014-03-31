package com.mycompany.app;

public class Division {
	public int exe(int a, int b) {
		int resultat = 0;
		
		try {
			resultat = a / b;
			}
		catch(ArithmeticException e) {
			resultat = 10;
		}
		return resultat;
	}
}
