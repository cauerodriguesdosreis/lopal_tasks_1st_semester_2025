package aula02062025;

import java.util.Scanner;

public class Ex1Arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int[] vetor = new int [5];
		
		System.out.println("Olá!");
		System.out.println("Digite os valores de cada posição do vetor:");
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Elemento [" + (i+1) + "]: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("|");
		System.out.println("Vetor preenchido: ");
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
		
		sc.close();

	}

}
 