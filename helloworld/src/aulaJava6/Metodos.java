package aulaJava6;

public class Metodos {

	public static void main(String[] args) {

		metodoPublic();
		metodoPadrao();
		metodoProtegido();
		metodoPrivado();
		
		Classe.metodoPublico1();
		Classe.metodoFriendly1();
		Classe.metodoProtegido1();
		//Class1.metodoPrivado1();
		
		System.out.println(soma(2, 4));
	}

	public static void metodoPublic() {
		System.out.println("Eu sou um Método Público!");
	}

	public static int soma(int numero1, int numero2) {
		return numero1 + numero2;
	}

	static void metodoPadrao() {
		System.out.println("Eu sou um Método Friendly!");
	}

	protected static void metodoProtegido() {
		System.out.println("Eu sou um Método Protegido!");
	}

	private static void metodoPrivado() {
		System.out.println("Eu sou um Método Privado!");
	}

}
