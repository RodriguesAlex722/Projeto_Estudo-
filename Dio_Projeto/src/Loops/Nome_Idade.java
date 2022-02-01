package Loops;

import java.util.Scanner;

public class Nome_Idade {
  public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  
	  String nome;
	  int idade;
	  
	 
	 do {
		  System.out.println("Nome: ");
		  nome =  scan.next();
		  
		  System.out.println("Idade: ");
		  idade = scan.nextInt();
		  
	  }while(idade != 0);
	  System.out.println("Finalizado procedimento");
  }

}