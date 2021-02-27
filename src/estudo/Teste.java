package estudo;

import java.util.Scanner;

public class Teste {
   
	public static void main(String[] args) {
		  
		   Scanner ent = new Scanner(System.in);
		   String nome, mostrar; 
		   int idade;
		   mostrar = "";
		   
		    for(int i = 1; i <= 2; i++){
			   System.out.print("Digite seu nome: ");
			   nome = ent.next();
			   System.out.print("Digite sua idade de " + nome + ": ");
			   idade = ent.nextInt();
			   
			   mostrar += "\nNome: " + nome + 
					      "\nIdade: " + idade;  
			   
			
		}
		    System.out.println(mostrar);
		    
		
		 

	}

}
