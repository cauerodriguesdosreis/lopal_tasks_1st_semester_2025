package aula02062025;

public class Ex9Arrays {

	public static void main(String[] args) {
		int[] vetor = {8, 7, 10, 2, 5, 9};
		double media = 0;
		double soma = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
			media = soma / vetor.length;
		}
		
		System.out.print("A média do aluno é: " + media);

	}

}
