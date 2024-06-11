package arrays;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class AtividadePraticaPilha {

	public static void main(String[] args) {

		Stack<String> pilha = new Stack<String>();
		int opcao;
		String livro;
		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("*********************************************");
			System.out.println("-- 1. Adicionar novo livro na pilha --");
			System.out.println("-- 2. Listar todos os livros da pilha --");
			System.out.println("-- 3. Retirar um livro da pilha --");
			System.out.println("-- 0. Sair --");
			System.out.println("*********************************************");
			opcao = leia.nextInt();	
			leia.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("\nDigite o nome do livro que quer adicionar à pilha: ");
				livro = leia.nextLine();
				pilha.push(livro);
				System.out.println(pilha + "\n");
				System.out.println("\nLivro adicionado!");
				break;
			
			case 2:
				System.out.println("\nElementos da Pilha: " + pilha);
				break;
				
			case 3:
				if (!pilha.isEmpty()) {
					System.out.println("\nRetirar elemento da pilha: " + pilha.pop());
					System.out.println(pilha + "\n");
					System.out.println("\nLivro retirado da pilha!");
				}else {
					System.out.println("\nA pilha está vazia.");
				}
				break;
				
			case 0:
				System.out.println("Programa finalizado");
				break;
				
			default:
				System.out.println("Opção inválida.");
			}
			
		}while(opcao != 0);
		leia.close();
	
	}
}
