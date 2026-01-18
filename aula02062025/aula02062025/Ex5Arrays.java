package aula02062025;

public class Ex5Arrays {

	public static void main(String[] args) {
		int[] vetor = {12, 67, 34, 89, 11, 77};
		
		
		System.out.println("Vetor: ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
		
		System.out.println("\nVetor ao contrário:");
		for (int i = vetor.length - 1; i > 0; i--) {
			System.out.print(vetor[i] + " ");
		}

	}

}
