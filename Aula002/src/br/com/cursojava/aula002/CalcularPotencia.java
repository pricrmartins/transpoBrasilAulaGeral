package br.com.cursojava.aula002;

import java.util.Scanner;

public class CalcularPotencia {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Por favor digite um n�mero");
		double potencia = Math.pow(Double.parseDouble(teclado.nextLine()) , 2);
		
		System.out.println("A pot�ncia do n�mero �: "+potencia);
		
		teclado.close();
	}
}
