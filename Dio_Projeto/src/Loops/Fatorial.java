package Loops;

import java.util.Scanner;

public class Fatorial {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Fatorial: ");		
		int f = scan.nextInt();
		int multi = 1;
		
		System.out.print(f + "= !");
		for(int i = f;i >= 1;i--) {
			
			multi = multi * i;
			
		}
		
		System.out.println(multi);
	}

}
