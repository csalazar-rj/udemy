package application;

import java.util.Locale;
import java.util.Scanner;
import entidade.Pessoas;

public class VetorClasse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// criar vetor basado em classe para guardar (Nome, Idade e Altura)
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
						
		System.out.print("Quantos registros serão salvos ? ");
		int qtd = scan.nextInt();
		Pessoas[] pessoa = new Pessoas[qtd];
		
		for (int i = 0;i < qtd;i++) {
			System.out.println(""); 
			System.out.print("Nome: ");
			String nome = scan.next();
			
			System.out.print("Idade: ");
			int idade = scan.nextInt();
			
			System.out.print("Altura: ");
			double altura = scan.nextDouble();
			
			pessoa[i] = new Pessoas(nome, idade, altura);
					
		}
		System.out.println("");
		System.out.println(" << Listando Itens da Classe >> ");
		
		for (int v = 0; v < qtd; v++) {
			System.out.println("");
			
			System.out.println("Nome: " + pessoa[v].getNome());
			System.out.println("Idade: " + pessoa[v].getIdade());
			System.out.println("Altura: " + pessoa[v].getAltura());
			
		}
		
		
		scan.close();
	}

}
