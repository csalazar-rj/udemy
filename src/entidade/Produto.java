package entidade;

public class Produto {
	private String nome;
	private Double preco;
	private int quantidade;
	
	// Declarando o construtor
	public Produto(String nome, Double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Double getPreco() {
		return preco;
	}
	
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public String exibeEstoque() {
		Double valorTotal = this.preco * this.quantidade;
		
		return "Produto: " + this.nome + ", Preço: " 
				+ this.preco + ", Quantidade: " + this.quantidade + ", Valor Total: " + valorTotal ;
	}
	
	public void adicionaItem(int quant) {
		this.quantidade += quant;		
	}
	
	public void removeItem(int quant) {
		this.quantidade -= quant;
	}
	
	public Double valorTotal() {
		return quantidade * preco;
	}
	
	public String toString() {
		return "Produto: " + nome
				+ " :: Preço: " + String.format("%.2f", preco)
				+ " :: Quantidade: " + quantidade
				+ " :: Valor Total: " + String.format("%.2f", valorTotal());
	}
	
}
