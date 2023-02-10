package aulaJava;

import java.util.Scanner;

public class Ativ04 {
	
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		float n1,n2,n3,n4,diferenca;
		
		System.out.println("Insira o 1° número: ");
		n1 = leia.nextFloat();
		
		System.out.println("Insira o 2° número: ");
		n2 = leia.nextFloat();
		
		System.out.println("Insira o 3° número: ");
		n3 = leia.nextFloat();
		
		System.out.println("Insira o 4° número: ");
		n4 = leia.nextFloat();
		
		diferenca = (n1*n2)-(n3*n4);
	
		System.out.println("A diferença do cálculo é: " + diferenca);
	
	}
}
