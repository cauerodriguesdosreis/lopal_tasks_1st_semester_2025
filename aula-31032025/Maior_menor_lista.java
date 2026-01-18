package aulas;

import java.util.Random;

public class Maior_menor_lista {

	public static void main(String[] args) {
		int numeros[] = new int[5];
		Random aleat = new Random();

		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = aleat.nextInt(100) + 1;

			if (numeros[i] > maior) {
				maior = numeros[i];
			}
			if (numeros[i] < menor) {
				menor = numeros[i];
			}

		}
		System.out.print("Lista de números gerados: ");
		for (int numero : numeros) {
			System.out.print(numero + " ");
		}
		System.out.println();
		System.out.println("Maior número da lista: " + maior);
		System.out.println("Menor número da lista: " + menor);

	}

}
