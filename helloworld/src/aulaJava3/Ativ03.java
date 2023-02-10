package aulaJava3;

import java.util.Scanner;

public class Ativ03 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int idade = 0, menor21 = 0, maior50 = 0;

		System.out.println("Digite uma idade: ");
		idade = leia.nextInt();

		while (idade > 0) {
			if (idade < 21) {
				menor21++;
			} else if (idade > 50) {
				maior50++;
			}
			System.out.print("Digite uma idade: ");
			idade = leia.nextInt();
		}

		System.out.println("Número de pessoas com menores de 21 anos: " + menor21);
		System.out.println("Número de pessoas com maiores de 50 anos: " + maior50);
		leia.close();
	}
}
