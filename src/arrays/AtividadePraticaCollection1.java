package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AtividadePraticaCollection1 {

	public static void main(String[] args) {
		
		ArrayList<String> cores = new ArrayList<String>();
		Scanner leia = new Scanner(System.in);
		
		for(int i = 0;i < 5; i++) {
			System.out.println("Digite uma cor: ");
			leia.skip("\\R?");
			String cor = leia.nextLine();	
			cores.add(cor);
			}


		System.out.println("\nLista de todas as cores: " + cores);
		for (String cor : cores) {
			System.out.println(cor);
		}
		
		Collections.sort(cores);
		
		System.out.println("\nA lista de todas as cores ordenadas é: ");
		for (String cor : cores) {
			System.out.println(cor);
		}
		
	}

}
