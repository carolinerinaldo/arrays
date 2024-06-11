package arrays;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AtividadePraticaFila {

	public static void main(String[] args) {

		Queue<String> clientes = new LinkedList<String>();
		int opcao;
		String nome;
		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("*********************************************");
			System.out.println("-- 1. Adicionar cliente na fila --");
			System.out.println("-- 2. Listar todos os clientes --");
			System.out.println("-- 3. Retirar cliente da fila --");
			System.out.println("-- 0. Sair --");
			System.out.println("*********************************************");
			opcao = leia.nextInt();	
			leia.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome do cliente: ");
				nome = leia.nextLine();
				clientes.add(nome);
				System.out.println(clientes + "\nCliente " + nome + " adicionado na fila.");
				break;

			case 2:
				System.out.println("\nFila de clientes: ");
				clientes.peek();
				System.out.println(clientes);
				break;

			case 3:
				if (clientes.isEmpty()) {
					System.out.println("\nA fila está vazia!");
				}else {
					clientes.remove();
					System.out.println(clientes + "\nO cliente foi chamado!");
				}				
				break;

			case 0:
				System.out.println("\nFinalizado");
				break;

			default:
				System.out.println("Opção inválida.");
			}

		}while (opcao !=0);
		leia.close();
	}
}
