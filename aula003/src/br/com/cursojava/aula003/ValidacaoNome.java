package br.com.cursojava.aula003;

import java.util.Scanner;


public class ValidacaoNome {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Por favor digite o seu nome");
		String nome = teclado.nextLine();
		String validacao = nome.trim().length() < 3? "Nome inválido": "Bem vindo"+nome.trim();
		System.out.println(validacao);
		teclado.close();
	}

}
