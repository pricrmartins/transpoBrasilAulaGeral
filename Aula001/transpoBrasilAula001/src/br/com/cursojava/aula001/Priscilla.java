package br.com.cursojava.aula001;

public class Priscilla {
	
	public static String nome = "Meu nome é Priscilla.";
	public static int idade = 25;
	public static String time = "Eu não tenho time de futebol.";

	public static String Escreve(){
		
		return nome + "\n Idade" + idade + " anos.\n"  +time;
		
	}
	
	public static void main(String[] args){
		System.out.println(Escreve());
		
	}
}
