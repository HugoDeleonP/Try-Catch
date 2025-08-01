package br.com.trycatch.main;
import java.util.Scanner;

import br.com.trycatch.view.Viewer;
import br.com.trycatch.service.TryCatch;

public class Main {
    public static void main(String[] args) {

    	Viewer view = new Viewer();
    	TryCatch logica = new TryCatch();
    	
    	int escolha = -1;
    	
        do {
        	escolha = view.mainMenu();
        	logica.gerenciarMenu(escolha);
        	
        } while(escolha != 0);
        
    }
}