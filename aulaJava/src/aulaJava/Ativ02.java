package aulaJava;

import java.util.Scanner;

public class Ativ02 {
	
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
	float nota1,nota2,nota3,nota4,media;
	
	System.out.println("Insira a nota 1: ");
	nota1 = leia.nextFloat();
	
	System.out.println("Insira a nota 2: ");
	nota2 = leia.nextFloat();
	
	System.out.println("Insira a nota 3: ");
	nota3 = leia.nextFloat();
	
	System.out.println("Insira a nota 4: ");
	nota4 = leia.nextFloat();
	
	media = (nota1+nota2+nota3+nota4)/4;
	
	System.out.printf("Média final: %.1f", media);
	
	
	}
}
