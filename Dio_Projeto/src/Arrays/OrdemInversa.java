package Arrays;

public class OrdemInversa {
	public static void main(String [] args) {
		
		int [] vetor = {0,-10,16,23,50,3};
		int i = 0;
		System.out.println("Vetor: ");
		
		while(i < vetor.length -1) {
			System.out.println(vetor[i] + " ");
			i++;
		}
		System.out.print("\nVetor\n");
		for(int j = (vetor.length - 1);j >= 0;j--) {
			System.out.println(vetor[j] + " ");
		}
		
	}
}
