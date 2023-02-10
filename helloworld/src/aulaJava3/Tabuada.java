package aulaJava3;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero;

		do {
			System.out.println("Digite a Tabuada que você deseja calcular: ");
			numero = leia.nextInt();

		} while (numero < 1 || numero > 10);
		for (int contador = 1; contador <= 10; contador++) {

			System.out.println("\n" + numero + " x " + contador + " = " + (numero * contador));
		}

		leia.close();
	}

}
