package aulaJava3;

import java.util.Scanner;

public class Ativ01 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int n1, n2;

		System.out.println("Digite o primeiro número do intervalo: ");
		n1 = leia.nextInt();

		System.out.println("Digite o número último do intervalo: ");
		n2 = leia.nextInt();

		if (n1 > n2) {
			System.out.println("Intervalo inválido! ");
		}

		else {
			System.out.println("No intervalor entre " + n1 + " e " + n2);
		}

		for (int contar = n1; contar <= n2; contar ++) {
			if (contar % 3 == 0 & contar % 5 == 0) {
				System.out.println(contar + " é multiplo de 3 e 5");
			}
		}
		leia.close();
	}
}
