package br.com.cursojava.aula004;

import java.util.Scanner;

public class FatorialNumero1a20 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero =0;
		do {
			System.out.println("Por favor digite um número entre 1 e 20");
			numero = Integer.parseInt(teclado.nextLine());
			if (numero > 20 || numero < 1) {
				System.out.println("Valor inválido");
				continue;
			}
		} while (numero > 20 || numero < 1);
		
		int resultado=1;
		for (int i = numero; i > 0; i--) {
			resultado *= i;
		}
		System.out.println("O fatorial é "+ resultado);
		teclado.close();
	}

}
