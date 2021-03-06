package estudo;

import java.util.Scanner;

public class Teste {
   
//Novos códigos	
public static void main(String[] args) {
	
	//Variáveis
	Scanner ent = new Scanner(System.in);
	int i;
	String nome, mostrar;
	i = 1;
	mostrar = "";
	
	
		 while(i <= 2){
			System.out.print("Digite o " + i + " nome: ");
			nome = ent.next();
			mostrar += nome + ", ";
			i++;
		 }
		 System.out.println("Nomes: " + mostrar);
		   
			
		}
		    
		    
		
		 

	 

}
