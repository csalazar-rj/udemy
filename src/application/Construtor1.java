package application;

import java.util.Locale;
import java.util.Scanner;
import entidade.Item;

public class Construtor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com o Item: ");
		String nomeItem = scan.next();
		
		System.out.print("Entre com o Preço do Item: ");
		Double precoItem = scan.nextDouble();
		
		System.out.print("Entre com a Quantidade em Estoque: ");
		int qtdEstoque = scan.nextInt();
		
		Item novoItem = new Item(nomeItem, qtdEstoque, precoItem);
		System.out.println("");
		System.out.println(novoItem);
		
		System.out.println("");
		System.out.print("Informe a quantidade a ser adicionanda no Estoque: ");
		int addQtd = scan.nextInt();
		novoItem.addItem(addQtd);
		
		System.out.println(novoItem);
		
		
	}

}
