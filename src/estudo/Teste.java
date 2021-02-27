package estudo;

import java.util.Scanner;

public class Teste {
   
	
	
	String nome;
	int idade;
	
	public void mostrar(){
		System.out.println("Nome: " + nome + 
				           "\nIdade: " + idade);
		
	}

	public static void main(String[] args) {
		  
		 Teste t = new Teste();
		 
		 t.nome = "Marcos";
		 t.idade = 12;
		 t.mostrar();
		   
			
		}
		    
		    
		
		 

	 

}
