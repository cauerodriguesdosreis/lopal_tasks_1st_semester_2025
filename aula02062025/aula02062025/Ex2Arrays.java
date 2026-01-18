package aula02062025;

import java.util.Scanner;

public class Ex2Arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int[] vetor = new int [5];
		int soma = 0;
		
		System.out.println("Olá!");
		System.out.println("Digite os valores de cada posição do vetor: ");
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Elemento [" + (i+1) + "]: ");
			vetor[i] = sc.nextInt();
			soma += vetor[i];

		}
		
		System.out.println("|");
		System.out.println("Soma de todos os elementos do vetor: " + soma);
		
		
		
		
		sc.close();

	}

}
