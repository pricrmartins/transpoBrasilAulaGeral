package br.com.cursojava.aula002;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Por favor informe um n�mero");
		int numero = Integer.parseInt(teclado.nextLine());
		
		if (numero % 2 == 0) {
			System.out.println("O n�mero � par.");
		}else{
			System.out.println("O n�mero � impar.");
		}
		teclado.close();

	}

}
