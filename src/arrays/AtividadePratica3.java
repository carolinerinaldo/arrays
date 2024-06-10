package arrays;

import java.util.Scanner;

public class AtividadePratica3 {

	public static void main(String[] args) {

		int[][] matriz = new int[3][3];
		int soma1 = 0, soma2 = 0;
		String principal = "", secundaria = "";
		Scanner leia = new Scanner(System.in);	

		for (int indiceI = 0; indiceI < matriz.length; indiceI++) {

			for (int indiceJ = 0; indiceJ < matriz.length; indiceJ++) {
 
				System.out.println("Digite o numero da posição: (" + indiceI + "," + indiceJ + "): ");
				matriz[indiceI][indiceJ] = leia.nextInt();
			}
		}

		for (int indiceI = 0; indiceI < matriz.length; indiceI++) {

			principal += matriz[indiceI][indiceI] + " ";
			soma1 += matriz[indiceI][indiceI];
		}

		for (int indiceI = 0; indiceI < matriz.length; indiceI++) {

			secundaria += matriz[indiceI][matriz.length - 1 - indiceI] + " ";
			soma2 += matriz[indiceI][matriz.length - 1 - indiceI];
		}

		System.out.println("Elementos da diagonal principal:\n");
		System.out.println(principal);

		System.out.println("\n\nElementos da diagonal secundária:\n");
		System.out.println(secundaria);

		System.out.println("\n\nSoma de todos elementos da diagonal principal:\n");
		System.out.println(soma1);

		System.out.println("\n\nSoma de todos elementos da diagonal secundária:\n");
		System.out.println(soma2);

		leia.close();
	}

}