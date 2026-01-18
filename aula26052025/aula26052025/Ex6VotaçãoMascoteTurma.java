package aula26052025;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex6VotaçãoMascoteTurma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lista de candidatos
        String[] candidatos = {"Leão", "Tigre", "Raposa", "Coruja"};
        Map<String, Integer> votos = new HashMap<>();

        // Inicializa os votos com 0
        for (String candidato : candidatos) {
            votos.put(candidato.toLowerCase(), 0);
        }

        int totalVotos = 0;

        System.out.println("=== Sistema de Votação para Mascote da Turma ===");
        System.out.println("Candidatos: ");
        for (String candidato : candidatos) {
            System.out.println("- " + candidato);
        }
        System.out.println("Digite o nome do candidato para votar ou 'fim' para encerrar:");

        // Loop de votação
        while (true) {
            System.out.print("Seu voto: ");
            String entrada = scanner.nextLine().trim().toLowerCase();

            if (entrada.equals("fim")) {
                break;
            }

            if (votos.containsKey(entrada)) {
                votos.put(entrada, votos.get(entrada) + 1);
                totalVotos++;
            } else {
                System.out.println("Candidato inválido. Tente novamente.");
            }
        }

        // Exibe resultados
        System.out.println("\n=== Resultado da Votação ===");
        if (totalVotos == 0) {
            System.out.println("Nenhum voto registrado.");
        } else {
            for (String candidato : candidatos) {
                int votoCandidato = votos.get(candidato.toLowerCase());
                double percentual = (votoCandidato * 100.0) / totalVotos;
                System.out.printf("%s: %d votos (%.2f%%)%n", candidato, votoCandidato, percentual);
            }
            System.out.println("Total de votos: " + totalVotos);
        }

        scanner.close();
    }
}
