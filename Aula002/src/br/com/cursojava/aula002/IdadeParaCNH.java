package br.com.cursojava.aula002;

import java.util.Scanner;

public class IdadeParaCNH {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		int idade = 0;
		System.out.println("Por favor digite a sua idade");
		idade = Integer.parseInt(teclado.nextLine());
		
		if (idade >= 18) {
			System.out.println("Idade suficiente para emitir CNH");
		}else{
			System.out.println("Idade insuficiente");
		}
				
		teclado.close();
	}
}
