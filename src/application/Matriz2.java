package application;

import java.util.Scanner;

public class Matriz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ler 2 valores ( l, c ) para definir tamanho da Matriz
		// Entrar com os valors da Matriz
		// ler um valor ( x ) que faz parte da matriz e informar:
		// Quem está a esquerda da posição de X ?
		// Quem está a direita da posição de X ?
		// Quem está acima da posição de X ?
		// Quem está abaixo da posição de X ?
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Definindo o tamanho da Matriz:");
		System.out.print("Quantas linhas ? ");
		int l = scan.nextInt();
		System.out.print("Quantas colunas ? ");
		int c = scan.nextInt();
		
		int[][] matriz = new int[l][c];
		System.out.println("");
		System.out.println("Carregando a Matriz");
		System.out.println("");
		
		for (int ln = 0; ln < l; ln++) {
			System.out.println("");
			for (int cl = 0; cl < c; cl++) {
				System.out.print("Entre com valor da Linha " + ln + " Coluna " + cl + " : ");
				int pos = scan.nextInt();
				matriz[ln][cl] = pos; 
			}
		}
		
		System.out.println("");
		System.out.println("-------------------------------");
		System.out.println("       Dados da Matriz");
		System.out.println("-------------------------------");
		
		for (int ln = 0; ln < l; ln++) {
			System.out.println("");
			for (int cl = 0; cl < c; cl++) {
				System.out.printf("%6d", matriz[ln][cl]);
			}
		}
		
		System.out.println("");
		System.out.println("--------------------------------------------------");
		System.out.println("  Procurando próximos a uma posição da Matriz");
		System.out.println("--------------------------------------------------");
		
		System.out.println("");
		System.out.print("Informe um valor da Matriz: ");
		int posSrc = scan.nextInt();
		System.out.println("");
		
		// procurando elementos próximos
		int ocorrencia = 1;
		for (int ln1 = 0;ln1 < l; ln1 ++) {
			for (int cl1 = 0; cl1 < c; cl1++) {
				if (matriz[ln1][cl1] == posSrc) {
					System.out.println("Ocorrencia " + ocorrencia);
					
					// verifica linha acima
					if (ln1 != 0) {
						System.out.println("Posição Acima: " + matriz[ln1 - 1][cl1]);
					}
					// verifica linha abaixo
					if (ln1 < l - 1) {
						System.out.println("Posição Abaixo: " + matriz[ln1 + 1][cl1]);
					}
					// verifica lado esquerdo
					if (cl1 > 0) {
						System.out.println("Posição a Esquerda: " + matriz[ln1][cl1 - 1]);
					}
					// verifica lado direito
					if (cl1 < c - 1) {
						System.out.println("Posição a Direita: " + matriz[ln1][cl1 + 1]);
					}					
					ocorrencia++;
					System.out.println("");
				}
			}
		}
		
		
		scan.close();
		
	}

}
