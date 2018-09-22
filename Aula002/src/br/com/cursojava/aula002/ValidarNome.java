package br.com.cursojava.aula002;

import java.util.Scanner;

public class ValidarNome {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o seu nome:");
		String nome = teclado.nextLine();
		if (nome.length() < 3) {
			System.out.println("O nome informado é inválido");
		}

		teclado.close();
	}

}
