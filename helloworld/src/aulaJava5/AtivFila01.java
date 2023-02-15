package aulaJava5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AtivFila01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Queue<String> nomes = new LinkedList<String>();

		int opcao = 6;
		String nome;

		do {
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Adicionar Cliente na Fila            ");
			System.out.println("            2 - Listar todos os Clientes             ");
			System.out.println("            3 - Retirar Cliente da Fila              ");
			System.out.println("            0 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();

			if (opcao == 0) {
				System.out.println("Programa foi Finalizado!");

				System.exit(0);

			}

			switch (opcao) {
			case 1:
				System.out.println("Adicionar Cliente");
				System.out.println("Digite o nome do cliente: ");
				leia.skip("\\R?");
				nome = leia.nextLine();
				nomes.add(nome);
				System.out.println("Cliente adicionado!");
				break;

			case 2:
				System.out.println("Lista de clientes na fila: ");
				nomes.forEach(System.out::println);
				break;

			case 3:
				System.out.println("Chamar cliente");

				if (nomes.isEmpty())
					System.out.println("A fila está vazia! ");
				else
					System.out.println("Cliente: " + nomes.poll() + " Compareça ao Guichê 01");

				break;
			default:
				System.out.println("Opção inválida!");
			}

		} while (opcao != 0);

		leia.close();
	}

}
