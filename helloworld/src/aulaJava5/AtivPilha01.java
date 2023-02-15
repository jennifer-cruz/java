package aulaJava5;

import java.util.Scanner;
import java.util.Stack;

public class AtivPilha01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		Stack<String> livros = new Stack<String>();
		int opcao = 4;
		String nomeLivro;

		do {
			System.out.println("1 - Adicionar Livro na pilha");
			System.out.println("2 - Listar todos os Livros");
			System.out.println("3 - Retirar Livro da Pilha");
			System.out.println("0 - Sair");
			System.out.println("Entre com a opção desejada:");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome: ");
				leia.skip("\\R?");
				nomeLivro = leia.nextLine();
				livros.push(nomeLivro);
				System.out.println("Pilha: ");
				livros.forEach(System.out::println);
				System.out.println("Livro adicionado!");
				break;

			case 2:
				System.out.println("Lista de Livros na Pilha: ");
				livros.forEach(System.out::println);
				break;

			case 3:
				if (livros.isEmpty())
					System.out.println("A Pilha está vazia!");
				else {

					System.out.println("Pilha: ");
					System.out.println(livros.pop());
					System.out.println("O Livro foi retirado da pilha!");
				}
				break;
			default:
				System.out.println("Programa Finalizado!");

			}
		} while (opcao != 0);

		leia.close();
	}

}
