package aulaJava2;

import java.util.Scanner;

public class Ativ05 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int produto, quantidade;
		float total;

		System.out.println("Produtos e preços por unidade");
		System.out.println("1-\tCachorro Quente - R$ 10,00");
		System.out.println("2-\tX-Salada - R$ 15,00");
		System.out.println("3-\tX-Bacon - R$ 18,00");
		System.out.println("4-\tBauru - R$ 12,00");
		System.out.println("5-\tRefrigerante - R$ 8,00");
		System.out.println("6-\tSuco de laranja - R$ 13,00 \n\n");

		System.out.print("Escolha um item de 1 ao 6: ");
		produto = leia.nextInt();

		System.out.print("Escolha a quantidade: ");
		quantidade = leia.nextInt();

		switch (produto) {
		case 1:
			System.out.print("Produto: Cachorro Quente");
			total = 10.00f * quantidade;
			System.out.printf("Valor total: R$ %.2f", total);
			break;
		case 2:
			System.out.print("Produto: X-Salada ");
			total = 15.00f * quantidade;
			System.out.printf("Valor total: R$ %.2f", total);
			break;
		case 3:
			System.out.print("Produto: X-Bacon ");
			total = 18.00f * quantidade;
			System.out.printf("Valor total: R$ %.2f", total);
			break;
		case 4:
			System.out.print("Produto: Bauru ");
			total = 12.00f * quantidade;
			System.out.printf("Valor total: R$ %.2f", total);
			break;
		case 5:
			System.out.print("Produto: Refrigerante ");
			total = 8.00f * quantidade;
			System.out.printf("Valor total: R$ %.2f", total);
			break;
		case 6:
			System.out.print("Produto: Suco de laranja ");
			total = 13.00f * quantidade;

			System.out.printf("Valor total: R$ %.2f", total);
			break;

		default:
			System.out.print("Produto inválido! Escolha outra opção de 1 ao 6");
		}
		leia.close();
	}
}
