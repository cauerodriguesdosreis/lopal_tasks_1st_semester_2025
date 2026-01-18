package EstudosPrimeiroSemestre;

import java.util.Scanner;

public class Nota_escolar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		float nota_aluno;

		System.out.println("Olá!");
		System.out.println("Classificação de desempenho do aluno: ");
		System.out.println("Excelente");
		System.out.println("Bom");
		System.out.println("Regular");
		System.out.println("Reprovado");
        System.out.println("|");
		System.out.print("Digite a sua nota: ");
		nota_aluno = sc.nextFloat();
		
		if (nota_aluno >= 9) {
			System.out.println("Aluno excelente");
		} else if (nota_aluno >= 7 && nota_aluno < 9) {
			System.out.println("Aluno bom");
		} else if (nota_aluno >= 5 && nota_aluno < 7) {
			System.out.println("Aluno regular");
		} else if (nota_aluno<5) {
			System.out.println("ALuno reprovado");
		}

		sc.close();

	}

}
