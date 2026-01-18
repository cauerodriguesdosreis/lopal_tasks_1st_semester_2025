package aulas;

import java.util.Random;

public class Soma_num_vetor {
	public static void main(String[] args) {
		int[] numeros = new int[10];
		Random aleat = new Random();

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = aleat.nextInt(100) + 1;
		}

		System.out.print("Números gerados: ");
		for (int numero : numeros) {
			System.out.print(numero + " ");
		}
		System.out.println();

		int soma = 0;
		for (int numero : numeros) {
			soma += numero;
		}

		System.out.println("Soma total: " + soma);
	}
}