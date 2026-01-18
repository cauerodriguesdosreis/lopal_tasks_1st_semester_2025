package aula02062025;

public class Ex4Arrays {

	public static void main(String[] args) {
		int[] vetor = {12, 43, 12, 645, 89, 14, 78, 65, 33, 99, 98, 144, 655, 432, 10};
		int pares = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				pares++;
			}
		}
		
		System.out.println("Total de números pares: " + pares);
		System.out.println("|");
		System.out.println("Vetor completo: ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}

	}

}
