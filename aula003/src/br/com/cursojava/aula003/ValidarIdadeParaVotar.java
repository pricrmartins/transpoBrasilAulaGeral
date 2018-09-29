package br.com.cursojava.aula003;

import java.util.Scanner;

public class ValidarIdadeParaVotar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Por favor digite a sua idade");
		int idade = Integer.parseInt(teclado.nextLine());
		
		String resultado = idade >= 16 ? "pode votar" : "não pode votar";
		
		System.out.printf("Você %s.", resultado);
		
		teclado.close();
	}

}
