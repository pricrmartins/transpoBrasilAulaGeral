package br.com.cursojava.aula004;

import java.util.Scanner;

public class MenuArquivo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String opcao = new String();
		do {
			System.out.println("Por favor selecione uma opção");
			System.out.println("A - Abrir arquivo");
			System.out.println("B - Procurar arquivo");
			System.out.println("C - Download arquivo");
			System.out.println("D - Upload de arquivo");
			System.out.println("S - Sair");
			
			opcao= teclado.nextLine();
			// boa prática "S".equals(opcao)
		} while (!opcao.equals("S"));
		teclado.close();
	}

}
