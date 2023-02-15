package aulaJava5;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		ArrayList<Double> notas = new ArrayList<Double>();

		int opcao = 0;
		double nota = 0.0;

		do {
			System.out.println("1 - Cadastrar nota");
			System.out.println("2 - Listar notas");
			System.out.println("3 - Buscar uma nota");
			System.out.println("4 - Remover uma nota");
			System.out.println("6 - Sair");
			System.out.println("Digite a opção desejada: ");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite uma nota entre 1 e 10");
				nota = leia.nextDouble();
				notas.add(nota);
				break;

			case 2:
				System.out.println("Listar todas as notas");
				if (notas.isEmpty())
					System.out.println("Base de dados vazia!");
				notas.forEach(System.out::println);
				break;

			case 3:
				System.out.println("Digite a nota: ");
				nota = leia.nextDouble();
				System.out.println("A nota " + nota + " exite?" + notas.contains(nota));
				System.out.println("O indice da minha nota é: " + notas.indexOf(nota));
				break;

			case 4:
				System.out.println("Digite a nota para remover: ");
				nota = leia.nextDouble();
				notas.remove(nota); // Nota
				break;
			case 5:
				System.out.println("Atualizar a nota: ");
				System.out.println("Digite a nota atual: ");
				nota = leia.nextDouble();
				System.out.println("Digite a nova nota: ");
				double notaNova = leia.nextDouble();
				notas.set(notas.indexOf(nota), notaNova);
				break;
			default:
				if (opcao > 6)
					System.out.println("Opção inválida");
			}
		}

		while (opcao != 6);

		leia.close();

	}
}
