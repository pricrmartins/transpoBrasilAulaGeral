package br.com.cursojava.aula003;

import java.util.Scanner;

public class TesteFrasesString {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Por favor digite uma frase");
		String frase = teclado.nextLine();
		
		String fraseSemVogal = frase.replaceAll("[aeiouAEIOU]","");
		
		//(07)
		System.out.println("A frase sem vogais: "+fraseSemVogal);
		
		int indice = frase.trim().indexOf(" ");
		String primeiraPalavra = indice > 0 ?frase.trim().substring(0,indice): frase.trim() ;
		
		//(08)
		System.out.println("Primeira palavra da frase: "+primeiraPalavra);
		
		indice = frase.trim().lastIndexOf(" ");
		String ultimaPalavra = indice > 0 ? frase.trim().substring(indice, frase.trim().length()) : frase.trim();
		
		//(09)
		System.out.println("Ultima palavra da frase: "+ultimaPalavra);
		
		//(10)
		String resultado = frase.trim().toLowerCase().contains("l")? "Possui a letra l ou L" : "Não possui a letra l ou L";
		System.out.println(resultado);
		
		//11
		System.out.println("Frase em caixa alta: "+ frase.toUpperCase());
		System.out.println("Frase em caixa baixa: "+ frase.toLowerCase());
		
		//12
		indice = frase.trim().length();
		String inicio = indice > 0 ? frase.trim().substring(0, indice/2).toLowerCase(): "";
		String finalFrase = indice > 0 ? frase.trim().substring(frase.trim().length()/2, frase.trim().length()).toUpperCase(): "";
		
		System.out.println(inicio+finalFrase);
		teclado.close();
	}

}
