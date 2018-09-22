package br.com.cursojava.aula002;

import java.util.Scanner;

public class CalcularIMC {
	public static void main(String[] args){
		//04
		Scanner teclado = new Scanner(System.in);
		
		double altura = 0;
		double peso = 0;
		
		while(altura <= 0)
		{
			System.out.println("Por favor digite sua altura:");
			altura = Double.parseDouble(teclado.nextLine());
		}
		while (peso <= 0) {
			System.out.println("Por favor digite o seu peso:");
			peso = Double.parseDouble(teclado.nextLine());
		}
		
		System.out.println("O seu IMC é "+(peso/(altura*altura)));
		
		teclado.close();
	}
}
