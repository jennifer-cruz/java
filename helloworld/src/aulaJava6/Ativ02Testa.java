package aulaJava6;

public class Ativ02Testa {

	public static void main(String[] args) {
		Ativ02 f1 = new Ativ02("Cliente Teste 01", 23, "cliente01teste@teste.com", "(11) 93443-2323", 3, 2345.98f);

		Ativ02 f2 = new Ativ02("Cliente Teste 02", 43, "cliente02teste@teste.com", "(11) 92334-4556", 1, 4564.76f);

		f1.visualizar();
		f2.visualizar();

	}

}
