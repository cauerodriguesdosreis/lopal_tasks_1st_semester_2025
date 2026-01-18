package aula26052025;

import java.util.*;

class Heroi {
	String nome;
	int forca;
	int inteligencia;
	int velocidade;

	public Heroi(String nome, int forca, int inteligencia, int velocidade) {
		this.nome = nome;
		this.forca = forca;
		this.inteligencia = inteligencia;
		this.velocidade = velocidade;
	}

	public int calcularPoder() {
		// Fórmula personalizável
		return forca * 2 + inteligencia * 3 + velocidade;
	}

	@Override
	public String toString() {
		return nome + " - Poder Total: " + calcularPoder() + " (Força: " + forca + ", Inteligência: " + inteligencia
				+ ", Velocidade: " + velocidade + ")";
	}

}

public class RankingHerois {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		List<Heroi> herois = new ArrayList<>();

		// Exemplos de heróis
		herois.add(new Heroi("Superman (Ryanzão o mais lindo e forte)", 9, 7, 8));
		herois.add(new Heroi("Batman", 4, 10, 6));
		herois.add(new Heroi("Flash (Kenps Rapidinho)", 5, 6, 10));
		herois.add(new Heroi("Mulherzinha-Maravilha (Cauê)", 8, 7, 7));
		herois.add(new Heroi("Homem de Ferro", 5, 9, 6));

		// Ordenar por poder total (maior primeiro)
		herois.sort((h1, h2) -> Integer.compare(h2.calcularPoder(), h1.calcularPoder()));

		// Mostrar ranking
		System.out.println("=== Ranking de Super-Heróis ===\n");
		int posicao = 1;
		for (Heroi heroi : herois) {
			System.out.println(posicao + "º - " + heroi);

			posicao++;
		}
		sc.close();
	}
}