package treino;

import java.util.ArrayList;
import java.util.Scanner;

public class Calc_media_notas {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Double> notas = new ArrayList<>(); // Usamos ArrayList para armazenar as notas
		int opcao;

		// Loop do menu, que continuará até o usuário escolher a opção 3 (Sair)
		do {
			// Exibindo o menu
			System.out.println("Olá! Seja bem-vindo ao menu da calculadora de média de notas escolares!");
			System.out.println("Escolha uma opção:");
			System.out.println("");
			System.out.println("1. Inserir notas");
			System.out.println("2. Calcular média");
			System.out.println("3. Sair");
			System.out.print("Digite sua opção: ");
			opcao = scanner.nextInt(); // Lê a opção do usuário

			// Processamento da opção escolhida
			switch (opcao) {
			case 1:
				// Inserir notas
				boolean continuarInserindo = true;
				boolean primeiraNotaAdicionada = false; // Flag para verificar se a primeira nota foi adicionada

				while (continuarInserindo) {
					// Pedir a primeira nota
					System.out.print("Digite a primeira nota (0 a 10): ");
					double nota = scanner.nextDouble();

					// Verifica se a primeira nota é válida (0 a 10)
					if (nota < 0 || nota > 10) {
						System.out.println("Nota inválida! A nota deve ser entre 0 e 10.");
					} else {
						// Se a primeira nota for válida, adiciona à lista e sai do loop
						notas.add(nota);
						primeiraNotaAdicionada = true;
						System.out.println("Primeira nota inserida com sucesso!");

					}
					break;
				}

				// Agora, permitir inserção das demais notas
				while (continuarInserindo) {
					System.out.print("Digite outra nota (ou um número negativo para parar): ");
					double nota = scanner.nextDouble();

					if (nota < 0) {
						continuarInserindo = false; // Para de inserir notas
					} else {
						if (nota > 10) {
							System.out.println("Nota inválida! A nota não pode ser maior que 10.");
						} else {
							notas.add(nota); // Adiciona a nota válida à lista
						}
					}
				}
				break;

			case 2:
				// Calcular média
				if (notas.isEmpty()) {
					System.out.println("Nenhuma nota inserida. Não é possível calcular a média.");
				} else {
					double soma = 0;
					for (double n : notas) {
						soma += n; // Soma todas as notas
					}
					double media = soma / notas.size(); // Calcula a média
					System.out.println("A média das notas é: " + media);
				}
				break;

			case 3:
				// Sair
				System.out.println("Saindo...");
				break;

			default:
				// Caso o usuário digite uma opção inválida
				System.out.println("Opção inválida. Tente novamente.");
			}
		} while (opcao != 3); // O loop continua até a opção 3 ser escolhida

		scanner.close();
	}
}
