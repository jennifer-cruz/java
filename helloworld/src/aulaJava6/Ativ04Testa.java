package aulaJava6;

import java.util.ArrayList;
import java.util.Scanner;

public class Ativ04Testa {

	public void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		ArrayList<Ativ04> medicamentos = new ArrayList<Ativ04>();

		long id;
		String nome, nomeComercial, fabricante, foto, opcao;
		float preco;

		do {

			System.out.println("\nId:");
			id = leia.nextLong();

			System.out.println("\nNome:");
			leia.skip("\\R?");
			nome = leia.nextLine();

			System.out.println("\nNomeComercial:");
			nomeComercial = leia.nextLine();

			System.out.println("\nFabricante:");
			fabricante = leia.nextLine();

			System.out.println("\nFoto:");
			foto = leia.nextLine();

			System.out.println("\nPreco:");
			preco = leia.nextFloat();

			Ativ04 f1 = new Ativ04(id, nome, nomeComercial, fabricante, foto, preco);

			medicamentos.add(f1);

			System.out.println("\nDeseja continuar?");
			leia.skip("\\R?");
			opcao = leia.nextLine();

		} while (opcao.equalsIgnoreCase("S"));

		for (var medicamento : medicamentos)
			medicamento.visualizar();

		// Ativ04 f2 = new Ativ04(2, "Paracetamol", "Tylenol", "Neo Quimica", "-",
		// 20.0f);

		// f1.visualizar();
		// f2.visualizar();

		leia.close();
	}
}
