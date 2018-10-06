package br.com.cursojava.aula004;

import java.util.Scanner;

public class IdadeUsuario {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int idade = 0;
		do {
			System.out.println("Por favor digite a sua idade");
			idade = Integer.parseInt(teclado.nextLine());
			if (idade < 0) {
				System.out.println("Valor inválido.");
			}
		} while (idade < 0);
		System.out.printf("Sua idade é %d anos.", idade);
		
		teclado.close();
	}

}
