package Loops;

import java.util.Scanner;

public class Maior_Media {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int nro;
		int  i = 0,maior = 0,soma = 0;
		
		do {
		
		System.out.println("Numero: ");
		nro = scan.nextInt();
		
		soma = soma + nro;
		
		if(nro > maior) maior = nro;
		
		i++;
		
		}while(i < 5);

		System.out.println("Maior: " + maior);
		System.out.println("Media: " +soma/5);
	}

}
