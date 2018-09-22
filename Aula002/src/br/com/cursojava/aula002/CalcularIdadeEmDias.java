package br.com.cursojava.aula002;

import java.util.Scanner;

public class CalcularIdadeEmDias {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int idade = -1;

		while (idade < 0) {
			System.out.println("Por favor digita a sua idade: ");
			idade = Integer.parseInt(teclado.nextLine());
		}

		System.out.println("Sua idade em dia é: "+(idade *365));
		teclado.close();
	}
}
