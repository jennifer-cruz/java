package aulaJava2;

import java.util.Scanner;

public class ativ04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String animal01, animal02, animal03;

		System.out.println("Digite o 1° animal");
		leia.skip("\\R?");
		animal01 = leia.nextLine();

		System.out.println("Digite o 2° animal");
		leia.skip("\\R?");
		animal02 = leia.nextLine();

		System.out.println("Digite o 3° animal");
		leia.skip("\\R?");
		animal03 = leia.nextLine();

		if (animal01.equals("vertebrado")) {
			if (animal02.equals("ave")) {
				if (animal03.equals("carnivoro"))
					System.out.println("aguia");
				else
					System.out.println("Pomba");
			} else {
				if (animal03.equals("onivoro"))
					System.out.println("homem");
				else
					System.out.println("vaca");
			}
		} else {
			if (animal02.equals("inseto")) {
				if (animal03.equals("carnivoro"))
					System.out.print("aguia");
				else
					System.out.println("pomba");
			} else {
				if (animal03.equals("onivoro"))
					System.out.println("homem");
				else
					System.out.println("vaca");
			}
		}
		leia.close();
	}

}
