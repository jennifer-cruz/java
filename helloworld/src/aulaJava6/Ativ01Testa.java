package aulaJava6;

public class Ativ01Testa {

	public static void main(String[] args) {
		Ativ01 c1 = new Ativ01("Cliente 01", 
				34,
				"(11) 91234-5678",
				"cliente01@emailteste.com", 
				1);

		Ativ01 c2 = new Ativ01("Adriana Almada", 
				41,
				"(22) 98765-4321",
				"cliente02@emailteste.com", 
				2);

c1.visualizar();
c2.visualizar();

}


}
