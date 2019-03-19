package curso;

import java.util.Scanner;

public class Vetor01 {

	//vetores com o mesmo valores
	public static void main(String[] args) {
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<vetorA.length;i++) {
			
			System.out.println("entre com valor da posiçao: " +i);
			 vetorA[i] = scan.nextInt();
			 
			 vetorB[i] = vetorA[i];
			
			}
		
		System.out.print("vetor A: ");
			for(int i=0; i<vetorA.length;i++) {
				System.out.print(vetorA[i]+" ");
				
				
			}
			System.out.println();
			
			System.out.print("vetor B: ");
			for(int i=0; i<vetorB.length;i++) {
				System.out.print(vetorB[i]+ " ");
					
			}
			System.out.println();
	}

}

