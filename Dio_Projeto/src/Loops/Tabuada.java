package Loops;

import java.util.Scanner;

public class Tabuada {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Tabuada: ");
		int nro = scan.nextInt();
		
		System.out.println("Tabuada de "+ nro);
		
		for(int i = 1;i <= 10 ;i++) {
			System.out.println(nro + " X " + i + " = " + (nro*i));
			
		}
		
		
	}
}
