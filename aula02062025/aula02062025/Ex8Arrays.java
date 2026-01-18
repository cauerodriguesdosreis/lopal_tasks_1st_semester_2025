package aula02062025;

public class Ex8Arrays {

	public static void main(String[] args) {
		int[] vetor = {12, 34, 67, 55, 43, 12, 90, 110, 123, 10};
		int[] vetorPar = new int[vetor.length]; // mesmo tamanho, no máximo todos podem ser pares
		int[] vetorImpar = new int [vetor.length];
		int indicePar = 0;
		int indiceImpar = 0;

		for (int i = 0; i < vetor.length; i++) {
		    if (vetor[i] % 2 == 0) {
		        vetorPar[indicePar] = vetor[i];
		        indicePar++;
		    }
		    
		    else if (vetor[i] % 2 != 0) {
				vetorImpar[indiceImpar] = vetor[i];
				indiceImpar++;
			}
		}
		
		System.out.print("Vetor completo: ");
		for (int i = 0; i < vetorImpar.length; i++) {
			System.out.print(vetor[i] + " ");
		}

		// Exibir pares
		System.out.print("\n\nValores pares: ");
		for (int i = 0; i < indicePar; i++) {
		    System.out.print(vetorPar[i] + " ");
		}
		
		System.out.print("\n\nValores ímpares: ");
		for (int i = 0; i < indiceImpar; i++) {
		    System.out.print(vetorImpar[i] + " ");
		}

}
}
