package application;

import java.util.Locale;
import java.util.Scanner;
import entidade.Estudante;

public class VetorEstudantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Iniciar um vetor de 10 posições simbolizando quartos
		// Ler de 1 a 10 estudantes e aloca-los nos quartos vazios
		// Imprimir os dados dos quartos ocupados
		
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
				
		
		// lendo estudantes
		System.out.print("Quantos estudantes irão alugar ? ");
		int qtd = scan.nextInt();
		
		Estudante[] aluno = new Estudante[10];
		
		for (int i = 0; i < qtd; i++) {
			scan.nextLine();
			System.out.print("Informe o Nome: ");
			String nome = scan.nextLine();
			
			System.out.print("Informe o e-mail: ");
			String email = scan.next();
			System.out.print("Escolha um quarto [0 - 9]: ");
			int quarto = scan.nextInt();
			
			if (aluno[quarto] == null) {
				aluno[quarto] = new Estudante(nome, email);
			} 
			
		}
		
		System.out.println("");
		System.out.println("Alugueis:" );
		for (int j = 0;j < aluno.length; j++) {
			
			if (aluno[j] != null) {
//				System.out.println("Aluguel #" + aluguel);
//				System.out.println("Nome: " + aluno[j].getNome());
//				System.out.println("Email: " + aluno[j].getEmail());
//				System.out.println("Quarto: " + j);
//				aluguel++;
								
				System.out.println(j + ": " + aluno[j]);				
			}
				
		}
		

		
		scan.close();
	}

}
