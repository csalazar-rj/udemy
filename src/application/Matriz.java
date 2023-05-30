package application;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Criar uma Matriz bidimensional 3x3
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Qual será o tamanho da Matriz ? ");
		int size = scan.nextInt();
		
		int[][] mat = new int[size][size];
		
		for (int c = 0; c < size; c++) {
			for (int l = 0; l < size; l++) {
				System.out.print("Informe valor da linha " + l + " coluna " + c + ": ");
				int val = scan.nextInt();
				mat[c][l] = val;
			}
		}
		System.out.println("");
		System.out.println("Imprimindo a Matriz");
		// exibir a matriz
		for (int l = 0; l < size; l++) {
			System.out.println("");
			for (int c = 0; c < size; c++) {
				System.out.printf("%6d", mat[c][l]);		
			}
		}
		
		// Imprime Diagonal principal
		System.out.println("");
		System.out.println("Diagonal Principal");
		for (int x = 0; x < size; x++) {
			System.out.print(mat[x][x] + " ");
		}
		
		
		scan.close();
	}

}
