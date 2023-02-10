package aulaJava2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat ("###.##");
		
		double n1, n2;
		
		System.out.println("Digite o 1° número");
		n1 = leia.nextDouble();
		
		System.out.println("Digite o 2° número");
		n2 = leia.nextDouble();
		
		
		System.out.println("O número " + n1 + " elevado ao número " + n2 + " é igual a " + Math.pow(n1, n2));
		
		System.out.println("A raiz quadrada do número " + n1 + " é igual a " + df.format(Math.sqrt(n1)));
		
		
		/*System.out.println("Pré incremento");
		System.out.println(n1);
		System.out.println(++ n1);
		
		System.out.println("Pós incremento");
		System.out.println(n2);
		System.out.println(n2 ++);
		System.out.println(n2);*/
		
		
		System.out.println("A soma de n1 + n2 é igual a: " + (n1 += n2));
		System.out.println(n1);
		
		
		System.out.println("O número " + n1 + " somado ao número " + n2 + " é igual a " + (n1 + n2));
		
		System.out.println("O número " + n1 + " subtraido ao número " + n2 + " é igual a " + (n1 - n2));
		
		System.out.println("O número " + n1 + " multiplicado ao número " + n2 + " é igual a " + (n1 * n2));
		
		if (n2 > 0)
		System.out.println("O número " + n1 + " dividido ao número " + n2 + " é igual a " + (n1 / n2));
		else
			System.out.println("Não é possível dividir um número por zero!");
		
		
		leia.close();
	}
	
	
}
