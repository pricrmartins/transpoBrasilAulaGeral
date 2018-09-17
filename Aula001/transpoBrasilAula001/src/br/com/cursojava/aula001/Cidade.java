package br.com.cursojava.aula001;

public class Cidade {
	public static String NomeCidadeNascimento ="Minha cidade de nascimento é Cuiabá";
	
	public static String Escreve()
	{
		return NomeCidadeNascimento;
	}
	public static void main(String[] args){
		System.out.println(Escreve());
	}
}
