package entidade;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		// a linha abaixo foi comentada porque o Construtor foi declardo 
		// na classe Produto. Desta maneira torna-se obrigatório
		// o preenchimento dos atributos. Esta linha será movida para baixo
		//Produto produto = new Produto();
		
		
		imprimiLogo();
		
		System.out.print("Entre com o produto: ");
		// a linha abaixo foi comentada e substituida porque o construtor foi declarado
		// deste modo (produto.nome) ainda não existe
		//produto.nome = scan.next();
		String nome = scan.next();		
		
		System.out.print("Entre com o preço: ");
		//produto.preco = scan.nextDouble();
		Double preco = scan.nextDouble();
		
		System.out.print("Entre com a quantidade no estoque: ");
		//produto.quantidade = scan.nextInt();
		int quantidade = scan.nextInt();
		
		Produto produto = new Produto(nome, preco, quantidade);				
		System.out.println(produto);
		
		adicionaItemLogo();
		
		System.out.print("Itens a adicionar: ");
		int qtdItemNovo = scan.nextInt();
		produto.adicionaItem(qtdItemNovo);
		produto.setPreco(740.00);
		System.out.println(produto);
		
		removeItemLogo();
		System.out.print("Itens a remover: ");
		int qtdItemDel = scan.nextInt();
		produto.removeItem(qtdItemDel);
		System.out.println(produto);
	
	}
	
	
	
	static void imprimiLogo() {
		System.out.println("---------------------------");
		System.out.println("    Controle de Estoque    ");
		System.out.println("---------------------------");
	}

	static void adicionaItemLogo() {
		System.out.println("");
		System.out.println("---------------------------");
		System.out.println("     Adicionando Item      ");
		System.out.println("---------------------------");
	}

	static void removeItemLogo() {
		System.out.println("");
		System.out.println("---------------------------");
		System.out.println("      Removendo Item       ");
		System.out.println("---------------------------");
	}
	
}
