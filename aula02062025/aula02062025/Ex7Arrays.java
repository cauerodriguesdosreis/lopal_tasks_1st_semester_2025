package aula02062025;

public class Ex7Arrays {

	public static void main(String[] args) {
		
		System.out.println("Olá meu caro usuário!");
		System.out.println("Espero que esteja tudo bem, vamos começar!");
		
		int[] vetor1 = {144, 12, 55, 77, 10};
		int[] vetor2 = {32, 12, 54, 89, 10};
		

		System.out.println("Valores que estão na mesmas posições entre os dois vetores: ");
		for (int i = 0; i < vetor1.length; i++) {
			if (vetor1[i] == vetor2[i]) {
				System.out.println("Posição " + (i+1) + ": " + vetor1[i]);
		}

	}

	}
}