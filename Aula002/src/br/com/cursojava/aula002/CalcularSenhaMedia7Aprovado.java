package br.com.cursojava.aula002;

import java.util.Scanner;

public class CalcularSenhaMedia7Aprovado {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		double nota1 =0;
		double nota2=0;
		double nota3 =0;
		double media =0;
		System.out.println("Olá, por favor insira a primeira nota:");
		
		nota1 = Double.parseDouble(teclado.nextLine());
		
		System.out.println("Olá, por favor insira a segunda nota:");
		
		nota2 = Double.parseDouble(teclado.nextLine());
		
		System.out.println("Olá, por favor insira a terceira nota:");
		
		nota3 = Double.parseDouble(teclado.nextLine());

		media = (nota1+nota2+nota3)/3;
		
		if (media >= 7) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
		
		teclado.close();
	}
}
