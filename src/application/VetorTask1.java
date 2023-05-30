package application;

import java.util.Locale;
import java.util.Scanner;

public class VetorTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantos numeros: ");
		int qtd = scan.nextInt();
		
		int[] vet = new int[qtd];
		
		for (int i = 0; i < vet.length; i++ ) {
			System.out.print("Entre com um número: ");
			vet[i] = scan.nextInt();
		}
		
		scan.nextLine();
		System.out.println("Imprimindo os valores negativos: ");
		for (int j = 0; j < vet.length; j++) {
			if (vet[j] < 0) {
				System.out.println(vet[j]);
			}
		}
		
		scan.close();
	}

}
