package entidade;

public class Item {
	
	private String nome_Item;
	private int quantidade_Estoque;
	private double preco_Item;
	
	
	public Item(String nome_Item, int quantidade_Estoque, double preco_Item) {
		this.nome_Item = nome_Item;
		this.quantidade_Estoque = quantidade_Estoque;
		this.preco_Item = preco_Item;
	}
	
	public String getNome() {
		return nome_Item;
	}
	
	public void setNome(String nome) {
		this.nome_Item = nome;
	}
	
	
	public void addItem(int qtd) {
		this.quantidade_Estoque += qtd;
	}
	
	public void removeItem(int qtd) {
		this.quantidade_Estoque -= qtd;
	}
	
	public double valorTotalEstoque() {
		return preco_Item * quantidade_Estoque;
	}
	
	public String toString() {
		return "Item: " + nome_Item
				+ " :: Preço: " + String.format("%.2f", preco_Item)
				+ " :: Quantidade: " + quantidade_Estoque
				+ " :: Valor Total: R$ " + String.format("%.2f", valorTotalEstoque());
	}
	
}
