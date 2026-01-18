package aula26052025;

import java.util.Scanner;

public class Ex5ValidadorSenhasIncomuns {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma senha para validar: ");
        String senha = sc.nextLine();

        if (validarSenha(senha)) {
            System.out.println("Senha válida!");
        } else {
            System.out.println("Senha inválida!");
        }

        sc.close();
    }

    public static boolean validarSenha(String senha) {
        boolean temMaiuscula = false;
        boolean temPrimo = false;
        boolean temEspecial = false;
        boolean vogalDuplicada = false;

        String especiais = "!@#$%^&*()-_=+{}[]|:;'<>,.?/~`";
        String vogais = "aeiouAEIOU";

        for (int i = 0; i < senha.length(); i++) {
            char c = senha.charAt(i);

            // Verifica letra maiúscula
            if (Character.isUpperCase(c)) {
                temMaiuscula = true;
            }

            // Verifica número primo
            if (Character.isDigit(c)) {
                int num = Character.getNumericValue(c);
                if (num == 2 || num == 3 || num == 5 || num == 7) {
                    temPrimo = true;
                }
            }

            // Verifica caractere especial
            if (especiais.indexOf(c) != -1) {
                temEspecial = true;
            }

            // Verifica vogais duplicadas seguidas
            if (i > 0) {
                char anterior = senha.charAt(i - 1);
                if (vogais.indexOf(c) != -1 && c == anterior) {
                    vogalDuplicada = true;
                }
            }
        }

        return temMaiuscula && temPrimo && temEspecial && !vogalDuplicada;
        
    }
}