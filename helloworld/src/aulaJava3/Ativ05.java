package aulaJava3;

import java.util.Scanner;

public class Ativ05 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero = 0, somaPositivos = 0;

		do {
			System.out.println("Digite um número inteiro: ");
			numero = leia.nextInt();

			if (numero > 0) {
				somaPositivos += numero;
			}

		} while (numero != 0);
		System.out.println("A soma dos números positivos é: " + somaPositivos);

		leia.close();
	}
}
