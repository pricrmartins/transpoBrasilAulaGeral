package br.com.cursojava.aula004;

import java.util.Scanner;

public class PalavraPiramide {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Por favor digite uma palavra");
		String palavra = teclado.nextLine();
		String resultado= new String();
		for (int i = 0; i < palavra.length(); i++) {
			resultado += palavra.charAt(i);
			System.out.println(resultado);
		}
		teclado.close();
	}

}
