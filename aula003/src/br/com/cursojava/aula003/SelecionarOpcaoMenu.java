package br.com.cursojava.aula003;

import java.util.Scanner;

public class SelecionarOpcaoMenu {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Por favor digita uma opção");
        System.out.println("1 - Cadastrar Produto \n2 - Listar Produtos"
        		+ "\n3 - Pesquisar porodutos \n4 - Remove produto"
        		+ "\n5 - Sair");
        int opcao = Integer.parseInt(teclado.nextLine());
        switch (opcao) {
		case 1:
			System.out.println("Você escolheu a opção Cadastrar Produto");
			break;
		case 2:
			System.out.println("Você escolheu a opção Listar Produtos");
			
			break;
		case 3:
			System.out.println("Você escolheu a opção Pesquisar produtos");
			
			break;
		case 4:
			System.out.println("Você escolheu a opção Remover produto");
			
			break;
		case 5:
			System.out.println("Obrigado por usar nossos terminais de atendimento");
			
			break;

		default:
			System.out.println("Opção inválida.");
			break;
		}
		teclado.close();
	}

}
