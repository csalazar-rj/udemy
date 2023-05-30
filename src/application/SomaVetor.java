package application;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ler 2 vetores e exibir a soma de seus elementos no vetor 3
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantos valores terá cada vertor ?");
		int qtd = scan.nextInt();
		
		int[] vet1 = new int[qtd];
		int[] vet2 = new int[qtd];
		int[] vet3 = new int[qtd];
		
		for (int i = 0;i < vet1.length; i++) {
			System.out.print("Valor Vetor 1: ");
			int val1 = scan.nextInt();
			vet1[i] = val1;
			
			System.out.print("Valor Vetor 2: ");
			int val2 = scan.nextInt();
			vet2[i] = val2;
			
		}
		
		for (int j = 0;j < vet1.length; j++) {
			vet3[j] = vet1[j] + vet2[j];
		}
		
		for (int s = 0; s < vet3.length; s++) {
			System.out.println("Soma vet1 + vet2 = " + vet3[s]);
		}
		
	}

}
