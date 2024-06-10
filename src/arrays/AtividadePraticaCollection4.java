package arrays;

import java.util.*;

public class AtividadePraticaCollection4 {

	public static void main(String[] args) {
		
		Set<Integer> valores = new HashSet<Integer>();
		int numero;
		Scanner leia = new Scanner(System.in);
		
		for(int i = 1; i <11; i++) {
			valores.add(i);
			
		}
		
		System.out.println("Digite o número que deseja encontrar: ");
		numero = leia.nextInt();
		
		if(valores.contains(numero)) {
			System.out.println("O número " + numero + "foi encontrado");
			
		}else {
			System.out.println("O número " + numero + " não foi encontrado");
		}
		leia.close();
	}

}
