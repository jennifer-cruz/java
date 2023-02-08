package aulaJava;

import java.util.Scanner;

public class Ativ03 {
	
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
	
		float salarioBruto,adicionalNoturno,horasExtras,descontos,salarioLiquido;
		
		System.out.println("Insira o salário bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("Insira o adicional noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("Insira as horas extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.println("Insira os descontos: ");
		descontos = leia.nextFloat();
		
		salarioLiquido = (salarioBruto+adicionalNoturno+(horasExtras*5)-descontos);
		
		System.out.printf("O salário líquido é: " + salarioLiquido);

	}
}
