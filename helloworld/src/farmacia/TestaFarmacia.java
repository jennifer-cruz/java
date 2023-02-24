package farmacia;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaFarmacia {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ArrayList<Farmacia> produtos = new ArrayList<Farmacia>();

		String opcao, produto, tipoM, tipoP;
		int estoque, tipo;
		float valor;
		long id;

		do {

			System.out.println("Tipo: ");
			tipo = ler.nextInt();

			System.out.println("Produto: ");
			ler.skip("\\R?");
			produto = ler.nextLine();

			System.out.println("Valor unitário: ");
			valor = ler.nextFloat();

			System.out.println("Estoque: ");
			estoque = ler.nextInt();

			System.out.println("Id: ");
			id = ler.nextLong();

			switch (tipo) {
			case 1 -> {
				System.out.println("\nTipo de Medicamento: ");
				ler.skip("\\R?");
				tipoM = ler.nextLine();

				Medicamentos m1 = new Medicamentos(tipo, produto, valor, estoque, id, tipoM);
				produtos.add(m1);

			}
			case 2 -> {
				System.out.println("\nTipo de Cosmético: ");
				ler.skip("\\R?");
				tipoP = ler.nextLine();

				Perfumaria p1 = new Perfumaria(tipo, produto, valor, estoque, id, tipoP);
				produtos.add(p1);
			}
			}

			System.out.println("\nDeseja continuar? ");
			ler.skip("\\R?");
			opcao = ler.nextLine();

		} while (opcao.equalsIgnoreCase("S"));

		for (var produtox : produtos)
			produtox.visualizar();


		ler.close();
	}

}
