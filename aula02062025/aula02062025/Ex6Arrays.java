package aula02062025;

import java.util.Scanner;

public class Ex6Arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Olá meu caro usuário!");
		System.out.println("Espero que esteja tudo bem, vamos começar!");
		
		int[] vetor = {64, 12, 90, 5, 33, 50};
		
		System.out.println("Olá!");
		System.out.println("Vetor preenchido: ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
		System.out.print("\nDigite um número para que o mesmo multiplique cada posição do vetor: ");
		int num = sc.nextInt();
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = vetor[i] * num;
		}
		
		System.out.println("Novo vetor:");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}		
		
		sc.close();
	}

}
