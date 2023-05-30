package application;

import java.util.Locale;
import java.util.Scanner;
import entidade.produto_classe;

public class VetorClasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Criando um Vetor onde os elementos serão do tipo Classe
		
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe quantos produtos vai cadastrar: ");
		int num = scan.nextInt();
		produto_classe[] vet = new produto_classe[num];
		
		// gravando os valores no vetor de classe
		
		// for (int i = 0; i < num; i++) {
		for (int i = 0; i < vet.length; i++) {
			System.out.print("Informe o produto: ");
			String name = scan.next();
			System.out.print("Informe o preço: ");
			double price = scan.nextDouble();
			
			vet[i] = new produto_classe(name, price);
			
		}
		
		
		// Exibe os valores do Vetor
		for (int j = 0;j < num; j++) {
			System.out.println("Produto: " + vet[j].getName());
			System.out.println("Preço: " + vet[j].getPrice());
		}
		
		
		scan.close();
	}

}
