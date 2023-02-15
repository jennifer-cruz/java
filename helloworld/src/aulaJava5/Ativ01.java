package aulaJava5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ativ01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();

		String cor;

		for (int contador = 1; contador <= 5; contador++) {
			System.out.println("Digite a cor: ");
			cor = leia.nextLine();
			cores.add(cor);
		}

		System.out.println("Listar todas as cores: ");
		cores.forEach(System.out::println);

		Collections.sort(cores);

		System.out.println("Ordenar as cores: ");
		cores.forEach(System.out::println);

		leia.close();
	}
}
