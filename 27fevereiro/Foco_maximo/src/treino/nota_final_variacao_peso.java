package treino;

import java.util.Scanner;

public class nota_final_variacao_peso {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double nota_aluno;

		System.out.println("Olá!");
		System.out.print("Digite o valor da nota final: ");
		nota_aluno = sc.nextFloat();

		System.out.print("Digite o nome do curso do aluno (ciência, letras ou outro): ");
		sc.nextLine();
		String curso = sc.nextLine().toLowerCase();

		if (curso.equals("ciência")) {
			nota_aluno *= 1.5;
		} else if (curso.equals("letras")) {
			nota_aluno *= 1.2;
		}

		String classificacao;

		if (nota_aluno >= 9) {
			classificacao = "A";
		} else if (nota_aluno >= 7) {
			classificacao = "B";
		} else if (nota_aluno >= 5) {
			classificacao = "C";
		} else if (nota_aluno >= 3) {
			classificacao = "D";
		} else {
			classificacao = "F";
		}
		System.out.println("A classificação do aluno é: " + classificacao);
		sc.close();

	}

}
