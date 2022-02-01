package Loops;

import java.util.Scanner;

public class Par_Impar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int qtdNumero;
		int nro,pares = 0, impar = 0;
		
	System.out.println("Quantidade de números: ");
	qtdNumero = scan.nextInt();
	
	int i = 0;
	
	do {
		System.out.println("Número: ");
		nro = scan.nextInt();
		
		if(nro % 2 == 0)pares++;
		else impar++;
		
		i++;
	}while(i < qtdNumero);
	
	System.out.println("Quantidade par: "+pares);
	System.out.println("Quantidade impar: "+impar);
	
	}
}
