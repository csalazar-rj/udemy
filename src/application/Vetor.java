package application;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("Quantas alturas serão lidas ? ");
		int qtd = scan.nextInt();

		double[] altura = new double[qtd];
		
		System.out.println("");
		for (int i = 0; i < qtd; i++) {
			System.out.print("Entre com a altura: ");
			altura[i] = scan.nextDouble();
		}
		
		System.out.println("");
		System.out.println("Imprimindo as Alturas");
		for (int j = 0; j < qtd; j++) {
			System.out.println("Altura: " + altura[j]);
		}
		
		System.out.println("Exibindo a média das Alturas");
		double media = 0.0;
		
		for (int j = 0; j < qtd; j++) {
			media += altura[j];
		}
		
		System.out.println("A média é: " + (media / qtd));
		
		scan.close();
	}

}
