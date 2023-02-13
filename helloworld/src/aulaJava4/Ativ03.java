package aulaJava4;

import java.util.Scanner;

public class Ativ03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int matriz[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int dp = 0, ds = 0;

		for (int indice = 0; indice < matriz.length; indice++) {
			System.out.println("Diagonal principal: " + matriz[indice][indice]);
			dp += matriz[indice][indice];
		}
		System.out.println("Soma dos elementos da Diagonal Principal " + dp);

		for (int indice = 0; indice < matriz.length; indice++) {
		//	System.out.println("Diagonal Secundária: " + matriz[indice][matriz.length - 1 - indice]);
			ds += matriz[indice][matriz.length - 1 - indice];
		}

		System.out.println("Soma dos elementos da Diagonal Secundária: " + ds);

		leia.close();

	}

}