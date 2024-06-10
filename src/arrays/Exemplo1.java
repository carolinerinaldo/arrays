package arrays;

public class Exemplo1 {

	public static void main(String[] args) {
		String vetorString[] = {"Boxer", "Pastor alemão", "pinscher", "husky", "corgi"};
		
		for(int indice = 0; indice < 5; indice++) {
			System.out.println((indice + 1) + "º elemento: " + vetorString[indice]);
		}

	}

}
