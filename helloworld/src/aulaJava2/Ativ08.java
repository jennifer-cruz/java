package aulaJava2;

import java.util.Scanner;

public class Ativ08 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int operacao;
		float saldo, valorSaque, novoSaldo, deposito;
		saldo = 1000f;

		System.out.println("Digite o código da operação");
		leia.skip("\\R?");
		operacao = leia.nextInt();

		switch (operacao) {
		case 1:
			System.out.print("Operação - Saldo: ");
			System.out.printf("Saldo: R$ " + saldo);
			break;
		case 2:
			System.out.print("Digite o valor: R$ ");
			valorSaque = leia.nextFloat();
			novoSaldo = saldo - valorSaque;
			if (valorSaque > saldo) {
				System.out.println("Saldo insuficiente! ");
			} else {
				System.out.print("Novo saldo: R$ " + novoSaldo);
			}
			break;
		case 3:
			System.out.print("Digite o valor: ");
			deposito = leia.nextFloat();
			novoSaldo = saldo + deposito;
			System.out.print("Operação - Depósito: R$ " + novoSaldo);
			break;

		default:
			System.out.print("Operação inválida! ");
		}

		leia.close();
	}
}