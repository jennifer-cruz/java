package aulaJava2;

import java.util.Scanner;

public class ativ02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int numero;

		System.out.println("Digite o número:");
		numero = leia.nextInt();

		if (numero % 2 == 0 && numero >= 0) {
			System.out.println("O número " + numero + " é par e positivo! ");
		}

		else if (numero % 2 == 0 && numero < 0){
			System.out.println("O número " + numero + " é par e negativo! ");
		}
		
		else if (numero % 2 == 0 != numero > 0){
			System.out.println("O número " + numero + " é ímpar e positivo! ");
		}
		
		else {
			System.out.println("O número " + numero + " é ímpar e negativo! ");
		}

		leia.close();
	}
}
