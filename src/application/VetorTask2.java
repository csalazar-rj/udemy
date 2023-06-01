package application;

import java.util.Locale;
import java.util.Scanner;

public class VetorTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// este projeto foi adicionado ao github
		
		// le numeros inteiros e guarda no vetor
		// ao final exibe o maior deles e a sua posição no vetor
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Qauntos numeros serão lidos ?");
		int num = scan.nextInt();
		
		int[] vet = new int[num];
		
		for (int i = 0; i < vet.length; i++) {
			System.out.print("Numero: ");
			int numLido = scan.nextInt();
			vet[i] = numLido;
		}
		
		// Exibindo o maior numero e a sua posição no vetor
		int numAux = vet[0];
		int maior = 0;
		int posicao = 0;
		for (int j = 1; j < vet.length; j++) {
			if (numAux > vet[j]) {
				maior = numAux;
			} else {
				maior = vet[j];
				numAux = maior;
			}
		}
		
		System.out.println("O maior numero foi: " + maior);
		for (int s = 0; s < vet.length; s++) {
			if (vet[s] == maior) {
				System.out.println("Posição no vetor: " + s);	
			}			
		}			
	}
}