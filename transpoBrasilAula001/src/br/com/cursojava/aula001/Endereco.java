package br.com.cursojava.aula001;

public class Endereco {
	public static String rua = "Rua 21 de março";
	public static int numero = 989;
	public static String bairro = "Carijos";
	public static String cidade ="Indaial";
	public static String estado ="SC";
	public static String pais = "Brasil";

	public static String Escreve(){
		
		return " Rua: "+rua +"\n Numero:"+numero+"\n Bairro:"+bairro+
				"\n Cidade:"+cidade+"\n Estado:"+estado+"\n Pais:"+pais;
	}
	
	public static void main(String[] args){
		
		System.out.print(Escreve());
	}
}
