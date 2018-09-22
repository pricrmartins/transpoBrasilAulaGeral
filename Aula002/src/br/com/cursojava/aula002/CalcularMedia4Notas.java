package br.com.cursojava.aula002;

import java.util.Scanner;

public class CalcularMedia4Notas {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;
		double nota4 = 0;
		double media = 0;
		System.out.println("Olá, por favor insira a primeira nota:");

		nota1 = Double.parseDouble(teclado.nextLine());

		System.out.println("Olá, por favor insira a segunda nota:");

		nota2 = Double.parseDouble(teclado.nextLine());

		System.out.println("Olá, por favor insira a terceira nota:");

		nota3 = Double.parseDouble(teclado.nextLine());

		System.out.println("Olá, por favor insira a quarta nota:");

		nota4 = Double.parseDouble(teclado.nextLine());

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media >= 9) {
			System.out.println("Conceito A");
		} else if (media >= 8) {
			System.out.println("Conceito B");
		} else if (media >= 6) {
			System.out.println("Conceito C");
		} else if (media >= 5) {
			System.out.println("Conceito D");
		} else {
			System.out.println("Insuficiente");
		}

		teclado.close();
	}
}
