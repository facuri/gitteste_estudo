package estudo;

import java.util.Scanner;

public class Teste {
   
//Novos c�digos	
public static void main(String[] args) {
	
	//Vari�veis
	Scanner ent = new Scanner(System.in);
	int i;
	String nome, mostrar;
	i = 1;
	mostrar = "";
	
	      //Exemplo com While
		 while(i <= 2){
			System.out.print("Digite o " + i + " nome: ");
			nome = ent.next();
			mostrar += nome + ", ";
			i++;
		 }
		 System.out.println("Nomes: " + mostrar);
		   
			
		}
		    
		    
		
		 

	 

}
