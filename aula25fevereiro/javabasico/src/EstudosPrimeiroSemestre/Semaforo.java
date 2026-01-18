package EstudosPrimeiroSemestre;

import java.util.Scanner;

public class Semaforo {

	public static void main(String[] args) {
		// Tabela-verdade do operador AND
		System.out.println("Tabela-verdade do operador AND:");
		System.out.println("Sinal verde  |  Pedestres  |  Pode atravessar?");
		System.out.println("True         |  True       |   " + (true && !true));
		System.out.println("True         |  False      |   " + (true && !false));
		System.out.println("False        |  True       |   " + (false && !true));
		System.out.println("False        |  False      |   " + (false && !false));
		System.out.println();
		
		// Entrada do usuário
		Scanner sc = new Scanner (System.in);
		System.out.print("O sinal está verde? (true/false): ");
		boolean sinalVerde = sc.nextBoolean();
		System.out.print("Há pedestres atravessando? (true/false): ");
		boolean pedestres = sc.nextBoolean();
	
		// Processamneto
		
		boolean podeAtravessar = sinalVerde && !pedestres; //Condição de atravessar o semáforo
		
		//Saída 
		System.out.println("Pode atravessar o cruzamento? " + podeAtravessar);
		
		sc.close();
		
	}

}
