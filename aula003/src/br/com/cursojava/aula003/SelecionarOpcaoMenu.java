package br.com.cursojava.aula003;

import java.util.Scanner;

public class SelecionarOpcaoMenu {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Por favor digita uma op��o");
        System.out.println("1 - Cadastrar Produto \n2 - Listar Produtos"
        		+ "\n3 - Pesquisar porodutos \n4 - Remove produto"
        		+ "\n5 - Sair");
        int opcao = Integer.parseInt(teclado.nextLine());
        switch (opcao) {
		case 1:
			System.out.println("Voc� escolheu a op��o Cadastrar Produto");
			break;
		case 2:
			System.out.println("Voc� escolheu a op��o Listar Produtos");
			
			break;
		case 3:
			System.out.println("Voc� escolheu a op��o Pesquisar produtos");
			
			break;
		case 4:
			System.out.println("Voc� escolheu a op��o Remover produto");
			
			break;
		case 5:
			System.out.println("Obrigado por usar nossos terminais de atendimento");
			
			break;

		default:
			System.out.println("Op��o inv�lida.");
			break;
		}
		teclado.close();
	}

}
