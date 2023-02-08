package aulaJava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Variaveis {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("###.##");
		
		int numero;
		String nome;
		double area;
		
		System.out.println("Digite um número inteiro: ");
		numero = leia.nextInt();
		
		System.out.println("Digite um nome: ");
		leia.skip("\\R?");
		nome = leia.nextLine();
		
		System.out.println("Digite um número real: ");
		area = leia.nextDouble();
		
		System.out.println("O nome da participante é: " + nome);
		System.out.println("O nome da participante é: " + numero);
		System.out.printf("A área é: %.2f \n", area); 
		System.out.println("A área é " + df.format(area));
	}
}
