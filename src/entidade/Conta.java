package entidade;

public class Conta {
	
	private String nome;
	private int conta;
	private double saldo;
	
	
	public Conta(String nome, int conta, double depositoInicial) {
		this.nome = nome;
		this.conta = conta;
		Deposito(depositoInicial);
	}
	
	public Conta(String nome, int conta) {
		this.nome = nome;
		this.conta = conta;
	}
		
	public void Deposito(double valor) {
		saldo += valor;
	}
	
	public void Saque(double valor) {
		saldo -= valor + 5.0;
	}
	
	public double SaldoConta() {
		return saldo;
	}
	
	public String toString() {
		return "Nome Titular: " + nome
				+ " :: Nr Conta: " + conta				
				+ " :: Saldo: R$ " + String.format("%.2f", SaldoConta());
	}

	// <<<< GETTERS and SETTERS >>>>
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getConta() {
		return conta;
	}


	public Double getSaldo() {
		return saldo;
	}

}
