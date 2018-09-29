package br.com.cursojava.ProvaPriscilla;

import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Por favor digite sua idade.");
		int idade = Integer.parseInt(teclado.nextLine());
		if (idade >= 0) {
			if (idade < 13) {
				System.out.println("Criança");
			} else if (idade < 18) {
				System.out.println("adolescente");

			} else if (idade < 25) {
				System.out.println("Jovem");

			} else if (idade < 60) {
				System.out.println("Adulto");

			} else{
				System.out.println("Idoso");

			}
		}

		teclado.close();
	}

}
