package ExerciciosFoco;

import java.util.Random;
import java.util.Scanner;

public class Ex4PedraPapelTesouraLagartoSpock {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Random random = new Random();
		
		String[] opcoes = {"Pedra", "Papel", "Tesoura", "Lagarto", "Spock"};
		
		System.out.println("Olá!");
		System.out.println("Escolha a sua opção: ");
		
		for (int i = 0; i < opcoes.length; i++) {
			System.out.println((i+1) + " - " + opcoes[i]);
		}
		
		System.out.print("Sua opção: ");
		
		
		int jogador = sc.nextInt();
		
		 if (jogador < 0 || jogador > 4) {
	            System.out.println("Escolha inválida!");
	            return;
	        }
		 
		 int computador = random.nextInt(5);
		 
		  System.out.println("Você escolheu: " + opcoes[jogador]);
	      System.out.println("Computador escolheu: " + opcoes[computador]);
		 
	      if (jogador == computador) {
	            System.out.println("Empate!");
	        } else if (
	            (jogador == 2 && (computador == 1 || computador == 3)) ||
	            (jogador == 1 && (computador == 0 || computador == 4)) || 
	            (jogador == 0 && (computador == 2 || computador == 3)) || 
	            (jogador == 3 && (computador == 4 || computador == 1)) || 
	            (jogador == 4 && (computador == 2 || computador == 0))    
	        ) {
	            System.out.println("Você venceu!");
	        } else {
	            System.out.println("Você perdeu!");
	        }
		
		
		
		
		sc.close();

	}

}
