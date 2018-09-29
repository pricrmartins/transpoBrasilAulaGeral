package br.com.cursojava.aula003;

import java.util.Scanner;

public class NomeQuantidadeCaracter {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Por favor digite o seu nome");
		String nome = teclado.nextLine();
		
		System.out.printf("O nome %s tem %d caracteres", nome, nome.length());
		teclado.close();
	}

}
