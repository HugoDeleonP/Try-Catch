package br.com.trycatch.view;

import java.util.Scanner;

public class Viewer {
	Scanner input;
	public Viewer(){
		 input = new Scanner(System.in);
	}
	
	public int mainMenu() {
		System.out.println("-===================Try-Catch===================-");
	    System.out.println("| 1- Exercício 1                                |");
	    System.out.println("| 2- Exercício 2                                |");
	    System.out.println("| 3- Exercício 3                                |");
	    System.out.println("| 4- Exercício 4                                |");
	    System.out.println("| 5- Exemplo: Entrada de número                 |");
	    System.out.println("|                                               |");
	    System.out.println("| 0- Sair                                       |");
	    System.out.println("-===============================================-");

	    int escolha = input.nextInt();
	    input.nextLine();
	    
	    return escolha;
	}
	
	public String inputNumeroString(String numeroOrdinal) {
		System.out.println("Digite o " + numeroOrdinal +" número: ");
		String texto = input.nextLine();
		
		return texto;
	}
	
	public int inputNumeroInt(String numeroOrdinal) {
		System.out.println("Digite o " + numeroOrdinal +" número: ");
		int numero = input.nextInt();
		input.nextLine();
		
		return numero;
	}
	
	public String inputNome() {
		System.out.println("Digite o nome do produto");
		String nome = input.nextLine();
		
		return nome;
	}
	
	public String inputPreco() {
		System.out.println("Digite o preço do produto: ");
		String precoString = input.nextLine();
		
		return precoString;
	}

}
