package aulaJava5;

import java.util.Scanner;
import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		Stack<String> pilha = new Stack<String>();

		pilha.push("Rony");
		pilha.push("Lucas");
		pilha.push("Isaac");
		pilha.push("Fernando");
		pilha.push("Laise");
		pilha.push("Elisangela");

		for (var elemento : pilha)
			System.out.println(elemento);

		System.out.println("Remover 01 elemento da pilha");

		pilha.pop();

		for (var elemento : pilha)
			System.out.println(elemento);

		System.out.println("Topo da pilha " + pilha.peek());

		leia.close();

	}

}
