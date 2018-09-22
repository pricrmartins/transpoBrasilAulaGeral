package br.com.cursojava.aula002;
import java.util.Scanner;
public class CalcularSaque {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Por favor, escolha uma das opções a baixo.");
		System.out.println("1 - Depositar");
		System.out.println("2 - Sacar");
		System.out.println("3 - Verificar Saldo");
		int opcao = Integer.parseInt(teclado.nextLine());
		if (opcao == 1) {
			System.out.println("Você Escolheu a opção Depositar");
		}
		if (opcao == 2) {
			System.out.println("Você Escolheu a opção Sacar");
		}
		if (opcao == 3) {
			System.out.println("Você Escolheu a opção Verificar Saldo");
		}
		teclado.close();
	}

}
