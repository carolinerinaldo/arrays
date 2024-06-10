package arrays;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionList2 {

	public static void main(String[] args) {
		
		ArrayList<Double> notas = new ArrayList<Double>();
		
		Double y = Double.valueOf(9);
		
		notas.add(y);
		notas.add(7.0);
		notas.add(5.0);
		notas.add(4.0);
		notas.add(10.0);
		notas.add(4.0);

		System.out.println("\nNotas cadastradas - Laço For...Each");

		for(Double nota : notas) {
			System.out.println(nota);
		}
		
		System.out.println("\nNotas cadastradas - Interface Iterator");

		Iterator<Double> iNotas = notas.iterator();
		
		while(iNotas.hasNext()) {
			System.out.println(iNotas.next());
		}
	}

}
