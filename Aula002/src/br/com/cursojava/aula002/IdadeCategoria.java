package br.com.cursojava.aula002;

import java.util.Scanner;

public class IdadeCategoria {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Por favor digite a sua idade");
		int idade = Integer.parseInt(teclado.nextLine());

		if (idade >= 18) {
			System.out.println("Categoria adulto");
		} else if (idade >= 14) {
			System.out.println("Categoria Juvenil");
		} else if (idade >= 12) {
			System.out.println("Categoria Infanto Juvenil");
		} else if (idade >= 9) {
			System.out.println("Categoria Infantil");
		} else {
			System.out.println("Categoria Mirim");
		}
		
		teclado.close();
	}

}
