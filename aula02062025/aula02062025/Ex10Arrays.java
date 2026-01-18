package aula02062025;

public class Ex10Arrays {

	public static void main(String[] args) {
		int[] vetor = { 1, 2, 3, 4, 5 };

		System.out.print("Vetor original: ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}

		 // Rotação para a direita
        int ultimo = vetor[vetor.length - 1];
        for (int i = vetor.length - 1; i > 0; i--) {
            vetor[i] = vetor[i - 1];
        }
        vetor[0] = ultimo;

        System.out.print("\nVetor rotacionado: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

	}

}
