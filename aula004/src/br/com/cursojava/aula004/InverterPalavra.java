package br.com.cursojava.aula004;

import java.util.Scanner;

public class InverterPalavra {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Por favor digite uma palavra");
		String palavra = teclado.nextLine();
		String[] letras = palavra.split("");
		String palavraInvertida = new String();
		int i = letras.length - 1;
		do {
			palavraInvertida += letras[i];
			// ou utilizar o palavra.charAt(i)
			i--;
		} while (i >= 0);

		System.out.println("Palavra invertida é " + palavraInvertida);
		teclado.close();
	}

}
