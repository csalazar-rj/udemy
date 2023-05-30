package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>();
		list.add("Carlos");
		list.add("Monica");
		list.add("Lizandra");
		list.add("Marcia");
		
		for (String obj: list) {
			System.out.println(obj);
		}
		
		list.add(2, "Serginho");
		
		System.out.println("");
		for (String obj: list) {
			System.out.println(obj);
		}
		
		System.out.println("");
		System.out.println("-----------------------------");
		System.out.println("Removendo por predicado");
		System.out.println("-----------------------------");
		
		// removendo um item da lista por predicado
		// list.removeIf(x -> x.charAt(0) == 'M');
		
		
		for (String obj: list) {
			System.out.println(obj);
		}
		
		System.out.println("");
		System.out.println("-------------------------------------");
		System.out.println("Procurando um elemento na lista");
		System.out.println("-------------------------------------");
		
		System.out.println("Index of Lizandra: " + list.indexOf("Lizandra"));
		
		
		System.out.println("");
		System.out.println("-----------------------------------------------");
		System.out.println("Gerando uma nova lista com a Inicial < M >");
		System.out.println("-----------------------------------------------");
		// Gerando uma nova lista com pessoas onde o nome começa com M
		List<String> newList = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
		
		for (String obj: newList) {
			System.out.println(obj);
		}
		
		
		System.out.println("");
		System.out.println("-----------------------------------------------");
		System.out.println("Procurando o promeiro nome que comece por < M >");
		System.out.println("-----------------------------------------------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);
		System.out.println(name);
	}

}
