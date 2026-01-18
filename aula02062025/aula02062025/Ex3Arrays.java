package aula02062025;

public class Ex3Arrays {

	public static void main(String[] args) {
		int[] vetor = {4, 2, 9, 12, 17, 1, 87, 55};
		int maior = vetor [0];
		int menor = vetor [0];

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
			}
			
			if (vetor[i] < menor) {
				menor = vetor[i];
			}
		}
		
		System.out.println("Maior número do vetor: " + maior);
		System.out.println("Menor número do vetor: " + menor);
		System.out.println("|");
		System.out.println("Vetor completo:");
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}

	}

}
