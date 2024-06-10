	package arrays;

	import java.util.Scanner;

	public class AtividadePratica2 {

		public static void main(String[] args) {
			
			int vetorInteiros[] = new int[10];
			float soma = 0.0f, media = 0.0f;
			String impar = "", par = "";
			Scanner leia = new Scanner(System.in);
			
			for(int indice = 0; indice < vetorInteiros.length; indice++) {
				System.out.println("Digite o " + (indice + 1) + "º número: ");
				vetorInteiros[indice] = leia.nextInt();
			}
			
			for (int indice = 1; indice < vetorInteiros.length; indice +=2) {
				impar += vetorInteiros[indice] + " ";
			}
			
			for (int indice = 0; indice < vetorInteiros.length; indice++) {
				if (vetorInteiros[indice] % 2 == 0)
					par += vetorInteiros[indice] + " ";
				
				soma += vetorInteiros[indice];
			}
			
			System.out.println("Elementos ímpares\n");
			System.out.println(impar);

			System.out.println("\nElementos pares\n");
			System.out.println(par);

			System.out.println("\nSoma de todos os elementos: \n");
			System.out.println(soma);

			media = soma / vetorInteiros.length;
			System.out.println("\n\nA Média dos elementos do vetor é: \n");
			System.out.printf("%.2f", media);
			
			leia.close();
		}

	}