package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entidade.Funcionario;

public class Listas2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ler quantos registros serão lidos
		// em seguida ler (id, nome e salario). Não pode haver ID repetido
		// pergunte qual funcionario receberá aumento e de quanto será
		// Efetuar o aumento de X por cento do salário
		// Se o Id não existir, exibir mensagem que não existe e perguntar novamente
		// Ao final mostrar a listagem atualizada
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		// Criar uma lista com base na classe Funcionario do tipo Array
		List<Funcionario> list = new ArrayList<>();
		
		
		System.out.print("Quantos empregados serão adicionados ? ");
		Integer num = scan.nextInt();
		
		for (int i = 0; i < num; i++) {
			System.out.println("");
			// lendo o primeiro registro
			System.out.print("ID: ");
			Integer id = scan.nextInt();
			
			while (hasId(list, id)) {
				System.out.println("ID already taken! Try again: ");
				id = scan.nextInt();
			}
			
			scan.nextLine();
			
			System.out.print("Nome: ");
			String nome = scan.nextLine();
			System.out.print("Salário: ");
			Double salario = scan.nextDouble();
			
			// instancia um objeto do tipo Classe Funcionario e atribui os valores lidos
			Funcionario func = new Funcionario(id, nome, salario);
			list.add(func);
															
		} // end for
		
		// Identifica qual ID receberá aumento de salario
		System.out.println("");
		System.out.println("-------------------------------");
		System.out.println("Efetuando Aumento Salarial");

		System.out.print("Qual ID receberá aumento ? ");
		Integer idFunc = scan.nextInt();
		Funcionario empFunc = list.stream().filter(x -> x.getId() == idFunc).findFirst().orElse(null);
		
		if (empFunc == null) {
			System.out.println("Este Funcionário não existe!");			
		} else {
			// efetua aumento de salário
			System.out.print("De quanto será o aumento (%) de " + empFunc.getNome() + " ? ");
			Double percentagem = scan.nextDouble();
			empFunc.aumentaSalario(percentagem);
			
		}
		
		
		// End Program 
		System.out.println("");
		System.out.println("--------------------------------");
		System.out.println("Lista de Empregados");
		System.out.println("--------------------------------");
		for (Funcionario obj : list) {
			System.out.println(obj);
		}
		
		
		scan.close();
		
	} // end main
	
	// Pesquisa se id já existe e sua posição
//	public static Integer position(List<Funcionario> list, int id) {
//		// Varre a lista inteira e procura pelo id (id) informado como parametro
//		for(int l = 0; l < list.size(); l++) {
//			if (list.get(l).getId() == id) {
//				return l;
//			}
//		}
//		// id não existe
//		return null;
//	}
	
	public static boolean hasId(List<Funcionario> list, int id) {
		Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
