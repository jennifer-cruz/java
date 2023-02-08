package aulaJava;

import java.util.Scanner;

public class Ativ01 {
	
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		float salario,abono,novoSalario;
		
		System.out.println("Digite o salario: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o abono: ");
		abono = leia.nextFloat();
		
		novoSalario = salario+abono;
		System.out.printf("Seu novo salário é: " + novoSalario);
					
	}
}
