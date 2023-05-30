package application;

import java.util.Locale;
import java.util.Scanner;
import entidade.Conta;

public class Cad_Bancario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conta novaConta;
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		PrintHeader();
		
		System.out.print("Entre com o nome do titular: ");
		String nomeTitular = scan.next();
		
		System.out.print("Entre com o Nr. da Conta: ");
		int nrConta = scan.nextInt();
		
		System.out.print("Deseja efetuar depósito inicial (y/n) ? ");
		char resposta = scan.next().charAt(0);
		
		if (resposta == 'y') {
			System.out.print("Entre com o valor do depósito: ");
			double valorDeposito = scan.nextDouble();
						
			novaConta = new Conta(nomeTitular, nrConta, valorDeposito);
			
			PrintDetail();
			System.out.println(novaConta);
		} else {			
			novaConta = new Conta(nomeTitular, nrConta);
			PrintDetail();
			System.out.println(novaConta);
		}
				

		System.out.println("");
		
		System.out.print("Informe o valor para depósito: ");
		double deposito = scan.nextDouble();
		novaConta.Deposito(deposito);
		System.out.println(novaConta);
		
		scan.close();
	}
	
	
	static void PrintHeader() {
		System.out.println("------------------------------");
		System.out.println("      Cadastro Bancário       ");
		System.out.println("------------------------------");
	}
	
	static void PrintDetail() {
		System.out.println("------------------------------");
		System.out.println("       Dados Bancários        ");
		System.out.println("------------------------------");
	}

}
