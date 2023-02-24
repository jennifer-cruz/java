package aulaJava8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {

	static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {

		int dividendo = 0;
		int divisor = 0;
		boolean loop = true;

		do {

			try {
				System.out.println("Digite o Dividendo: ");
				dividendo = ler.nextInt();

				System.out.println("Digite o Divisor: ");
				divisor = ler.nextInt();

				divide(dividendo, divisor);

			} catch (InputMismatchException e) {
				System.err.println("Exceção: " + e);
				ler.nextLine();
				System.out.println("Digite somente números!");
			} catch (ArithmeticException e) {
				System.err.println("Exceção: " + e);
				ler.nextLine();
				System.out.println("Digite um número diferente de zero!");

			}
			//finally {
				//System.out.println("Sempre serei executado!");
				// comentário: usar finally somente quando for necessário
		//	}

		} while (loop);

	}

	public static void divide(int dividendo, int divisor) {
		System.out.println("Divisão = " + (dividendo / divisor));
		
		if ((dividendo / divisor) > 5)
			throw new ArithmeticException("A divisão é maior do que 5!");
	}

}
