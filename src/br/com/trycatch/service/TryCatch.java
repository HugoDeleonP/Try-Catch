package br.com.trycatch.service;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.trycatch.view.Viewer;

public class TryCatch {
	
	Viewer view;
	
	public TryCatch() {
		view = new Viewer();
	}
    
	public void gerenciarMenu(int escolha) {
		
		switch(escolha) {
		
		case 1 -> {
			int numero = 0;
			boolean entradaValida = false;
			
			while(entradaValida == false) {
				String texto = view.inputNumeroString("");
				
				try {
					numero = Integer.parseInt(texto);
					entradaValida = true;
				} catch(NumberFormatException e) {
					System.out.println("Valor inválido! Digite novamente.");
				}
			}
			
			System.out.println("Número final: " + numero);
		}
		
		case 2 ->{
			boolean entradaValida = false;
			
			do {
				String texto1 = view.inputNumeroString("primeiro");
				String texto2 = view.inputNumeroString("segundo");
				
				
				try {
					int numero1 = Integer.parseInt(texto1);
					int numero2 = Integer.parseInt(texto2);
					
					int soma = numero1 + numero2;
					System.out.println("A soma é: " + soma);
					entradaValida = true;
				} catch(NumberFormatException e) {
					System.out.println("Digite um valor válido!");
				}
				
			} while(entradaValida == false);
		}
		
		case 3 ->{
			boolean entradaValida = false;
			
			do {
				String nome = view.inputNome();
				String precoString = view.inputPreco();
				System.out.println("Preço: " + precoString);
				
				try {
					double precoDouble = Double.parseDouble(precoString);
					
					entradaValida = true;
				} catch(NumberFormatException e){
					System.out.println("Digite um valor válido!");
				}
				
			} while(entradaValida == false);
		}
		
		case 4 ->{
			
		}
		
		case 5 ->{
			String texto = view.inputNumeroString("");
			
			try {
				int numero = Integer.parseInt(texto);
				System.out.println("Você digitou o número: " + numero);
			} catch(NumberFormatException e){
				System.out.println("Erro: Você não digitou um número válido.");
			}
		}
		
		
		
		}
		
	}
}
