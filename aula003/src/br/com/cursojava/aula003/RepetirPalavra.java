package br.com.cursojava.aula003;

import java.util.Scanner;

public class RepetirPalavra {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Por favor digite um nome");
		String nome = teclado.nextLine();
		int contador = 0;
		String resultado = "";
		while (contador < nome.length()) {
			resultado += nome + " ";
			System.out.println(resultado);
			contador++;
		}
		teclado.close();
	}

}
