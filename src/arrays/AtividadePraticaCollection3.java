package arrays;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AtividadePraticaCollection3{

	public static void main(String[] args) {
		Set<Int> setFrutas = new HashSet<Int>();

		setFrutas.add("Abacate");
		setFrutas.add("Banana");
		setFrutas.add("Jaboticaba");
		setFrutas.add("Kiwi");
		setFrutas.add("Maçã");
		setFrutas.add("Morango");
		setFrutas.add("Pêra");
		setFrutas.add("Jaboticaba");
		setFrutas.add("Kiwi");

		System.out.println("\nDados da Collection: " + setFrutas);

		System.out.println("\nExiste a fruta Kiwi? " + setFrutas.contains("Kiwi"));

		setFrutas.remove("Kiwi");
		System.out.println("\nKiwi foi removida!");

		System.out.println("\nExiste a fruta Kiwi na Collection? " + setFrutas.contains("Kiwi"));

		System.out.println("\n\nListar todos os Elementos com o Laço For..Each");

		for (String fruta : setFrutas) {
			if (fruta != null)
				System.out.println("O Hashcode do Elemento " + fruta + " é " + fruta.hashCode());
		}

		System.out.println("\n\nListar todos os Elementos com o Iterator");

		Iterator<String> isetFrutas = setFrutas.iterator();

		while (isetFrutas.hasNext()) {
			System.out.println(isetFrutas.next());
		}

		System.out.println("\nA Colection Set está vazia? " + setFrutas.isEmpty());

		setFrutas.clear();
		System.out.println("\nTodos os itens foram removidos da Collection Set!");

		System.out.println("\nA Colection Set está vazia? " + setFrutas.isEmpty());

	}

}

