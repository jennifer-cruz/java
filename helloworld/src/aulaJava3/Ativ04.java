package aulaJava3;

import java.util.Scanner;

public class Ativ04 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int idade, sexo, categoria, backend = 0, frontend = 0, mobile = 0, fullstack = 0;
		String continua = "s";

		while (continua.equals("S")) {
			System.out.println("Digite a idade: ");
			idade = leia.nextInt();

			System.out.println("Digite o sexo: ");
			sexo = leia.nextInt();

			System.out.println("Digite a categoria: ");
			categoria = leia.nextInt();

			if (categoria == 1)
				backend++;

			if (categoria == 2 && sexo == 2)
				frontend++;

			if (categoria == 3 && sexo == 1 && idade > 40)
				mobile++;

			if (categoria == 4 && idade < 30)
				fullstack++;

			System.out.println("Deseja continuar (S/N)? ");
			leia.skip("\\R?");
			continua = leia.nextLine().toUpperCase();

		}
		leia.close();
		
		System.out.println("\nTotal de pessoas desenvolvedoras backend: " + backend);
		System.out.println("\nTotal de mulheres desenvolvedoras frontend: " + frontend);
		System.out.println("\nTotal de homens desenvolvedores mobile maiores de 40 anos: " + mobile);
		System.out.println("\nTotal de mulheres desenvolvedoras fullstack menores de 30 anos: " + fullstack);
	}
}
