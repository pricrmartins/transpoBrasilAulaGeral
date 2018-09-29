package br.com.cursojava.aula003;

public class ExemploString {

	public static void main(String[] args) {

		String curso = new String("Curso Java TranspoBrasil Sábado");
		// qtdade caracteres
		System.out.printf("O texto %s possui %d caracteres\n", curso, curso.length());
		// - troca
		String semEspaco = curso.replace(" ", "");
		System.out.println(semEspaco);
		//
		System.out.println(curso.contains("TranspoBrasil"));
		System.out.println(curso.startsWith("Curso"));
		System.out.println(curso.endsWith("Domingo"));
		
		System.out.println(curso.indexOf("TranspoBrasil"));
		System.out.println(curso.indexOf("a"));
		System.out.println(curso.indexOf("a", 10));// indice 10 incluso
		System.out.println(curso.lastIndexOf("a"));
		
		System.out.println(curso.toUpperCase());
		System.out.println(curso.toLowerCase());
		
		System.out.println(curso.substring(11,17)); // indice 11 incluso, indice 17 não incluso
	
		System.out.println(curso.charAt(10));
		System.out.println(curso.charAt(11));
		System.out.println(curso.charAt(12));
		System.out.println(curso.charAt(13));
		
		String user1 ="João";
		String user2 ="João";
		String user3 =new String("João");
		System.out.println(user1 == user2); //os endereços são diferentes, mas aponta para mesmo endereço de memoria no HEAP, por conta disso dá true, por causa do pull de strings para otimização no endereço de memoria
		System.out.println(user1 == user3);
		System.out.println(user1.equals(user2));
		System.out.println(user1.equals(user3));
		System.out.println(user1.equalsIgnoreCase("JOÃO"));
		
		String text ="   olá   mundo   ";
		String registro ="contato;contato@teste.com;33221100";
		System.out.printf(">%s< , length = %d\n", text, text.length());
		System.out.printf(">%s< , length = %d\n", text.trim(), text.trim().length());
		
		String[] valores = registro.split(";");
		System.out.println(valores[0]);
		System.out.println(valores[1]);
		System.out.println(valores[2]);
		System.out.println("");
		
	}
	

}
