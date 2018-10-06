package br.com.cursojava.aula004;

import java.util.Scanner;

public class ExerciciosVetor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Questao16(teclado);
		teclado.close();
	}

	private static void Questao9(Scanner teclado) {
		double notas[] = new double[5];
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Por favor digite uma nota");
			notas[i] = Double.parseDouble(teclado.nextLine());

			if (i == 4) {
				for (int j = 0; j < notas.length; j++) {
					System.out.print(notas[j] + " ");
				}
			}
		}

	}

	private static void Questao10(Scanner teclado) {
		String nomes[] = new String[5];
		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Por favor digite uma nome");
			nomes[i] = teclado.nextLine();

			if (i == 4) {
				for (int j = nomes.length; j > 0; j--) {
					System.out.print(nomes[j] + " ");
				}
			}
		}
	}

	private static void Questao11(Scanner teclado) {
		double notas[] = new double[10];
		double menorNota = 99;
		double maiorNota = 0;
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Por favor digite uma nota");
			notas[i] = Double.parseDouble(teclado.nextLine());

			if (i == 9) {
				for (int j = 0; j < notas.length; j++) {
					menorNota = Math.min(menorNota, notas[j]);
					maiorNota = Math.max(maiorNota, notas[j]);
				}
			}
		}
	}

	private static void Questao12(Scanner teclado) {
		double notas[] = new double[10];
		double media = 0;
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Por favor digite uma nota");
			notas[i] = Double.parseDouble(teclado.nextLine());
			media += notas[i];

			if (i == 9) {
				media /= 9;
				for (int j = 0; j < notas.length; j++) {
					if (notas[j] >= media) {
						System.out.print(notas[j] + " ");
					}
				}

			}
		}
	}

	private static void Questao13(Scanner teclado) {
		String nomes[] = new String[10];
		String nomeMaiorCarac = "";
		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Por favor digite uma nome");
			nomes[i] = teclado.nextLine();

			nomeMaiorCarac = nomeMaiorCarac.length() < nomes[i].length() ? nomes[i] : nomeMaiorCarac;

		}
		System.out.println("A palavra com mais caracteres é "+ nomeMaiorCarac);
	}
	
	private static void Questao14(Scanner teclado) {
		double notas[] = new double[10];
		double media = 0;
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Por favor digite uma nota");
			notas[i] = Double.parseDouble(teclado.nextLine());
			media += notas[i];

			if (i == 9) {
				media /= 9;
				for (int j = 0; j < notas.length; j++) {
					if (notas[j] <= media) {
						System.out.print(notas[j] + " ");
					}
				}

			}
		}
	}
	private static void Questao15(Scanner teclado) {
		double produtos[] = new double[10];
		double media = 0;
		for (int i = 0; i < produtos.length; i++) {
			System.out.println("Por favor digite um valor do produto");
			produtos[i] = Double.parseDouble(teclado.nextLine());
		}
		for (int i = 0; i < produtos.length; i++) {
			System.out.printf("O produto com valor %.2f com desconto de 10% é %.2", produtos[i], produtos[i]- (produtos[i]*10)/100);
		}
	}
	
	private static void Questao16(Scanner teclado) {
		double notas[] = new double[10];
		String nomes[] = new String[10];
		double media = 0;
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Por favor digite uma nota");
			notas[i] = Double.parseDouble(teclado.nextLine());
			System.out.println("Por favor digite uma nome");
			nomes[i] = teclado.nextLine();
			media += notas[i];
		}
		media /= 9;
		for (int j = 0; j < notas.length; j++) {
			if (notas[j] >= media) {
				System.out.print("Nome: "+nomes[j]+", nota "+notas[j] + " ");
			}
		}
	}
}
