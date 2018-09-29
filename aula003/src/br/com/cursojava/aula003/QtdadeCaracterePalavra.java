package br.com.cursojava.aula003;

import java.util.Scanner;

public class QtdadeCaracterePalavra {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nome =new String("a");
		while(!nome.equals("")){
			System.out.println("Por favor digite um nome");
			nome  = teclado.nextLine();
			System.out.println("A quantidade de caracteres é "+nome.length());
		}
		
		teclado.close();
	}

}
