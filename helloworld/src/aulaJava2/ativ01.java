package aulaJava2;

import java.util.Scanner;

public class ativ01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int nA, nB, nC, somaAB;

		System.out.println("Digite o número A:");
		nA = leia.nextInt();

		System.out.println("Digite o número B:");
		nB = leia.nextInt();

		System.out.println("Digite o número C:");
		nC = leia.nextInt();

		somaAB = nA + nB;

		if (somaAB > nC) {
			System.out.println(nA + "+" + nB + "=" + somaAB + ">" + nC);
			System.out.println("A soma de A + B é maior que C");
		}

		else if (somaAB < nC) {
			System.out.println(nA + "-" + nB + "=" + somaAB + "<" + nC);
			System.out.println("A soma de A + B é menor que C");
		}

		else {
			System.out.println(nA + "+" + nB + "=" + somaAB + "=" + nC);
			System.out.println("A soma de A + B é igual a C");
		}

		leia.close();
	}
}
