package br.com.cursojava.aula002;

import java.util.Scanner;

public class ExemploConversaoDados {
	
	public static void main(String[] args){
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe sua idade");
		
		String textoIdade = teclado.nextLine();
		int idade = Integer.parseInt(textoIdade);
		System.out.println("Sua idade daqui 20 anos ser� ...");
		System.out.println(idade+20);
		
		teclado.close();
		
	}
	
}
