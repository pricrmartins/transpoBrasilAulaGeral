package br.com.cursojava.aula002;

import java.util.Scanner;

public class CalcularDesconto {
	// 03
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double valorProduto = -1;
		double valorPercentualDesconto = -1;
		while (valorProduto < 0) {
			System.out.println("Por favor digite o valor do produto:");
			valorProduto = Double.parseDouble(teclado.nextLine());
		}
		while (valorPercentualDesconto < 0 || valorPercentualDesconto > 100) {
			System.out.println("Por favor digite o valor percentual do desconto:");
			valorPercentualDesconto = Double.parseDouble(teclado.nextLine());
		}
		double desconto = (valorProduto *valorPercentualDesconto)/100;
		teclado.close();
		System.out.println("O valor do desconto é: "+desconto+ ", o valor do produto com desconto é: "+(valorProduto-desconto));

	}
}
