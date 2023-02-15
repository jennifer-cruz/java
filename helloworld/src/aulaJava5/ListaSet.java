package aulaJava5;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class ListaSet {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		Set<Double> notas = new HashSet<Double>();

		notas.add(7.0);
		notas.add(6.0);
		notas.add(2.0);
		notas.add(5.0);
		notas.add(7.0);
		notas.add(20.0);

		System.out.println("Listando todas as nota: ");
		notas.forEach(System.out::println);
		System.out.println("Removendo uma nota: ");
		notas.remove(20.0);
		notas.forEach(System.out::println);

		System.out.println("A nota 7 existe: " + notas.contains(7.0));

		for (var nota : notas)
			System.out.println(nota.hashCode());

		leia.close();

	}

}
