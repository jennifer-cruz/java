package farmacia;
public class Perfumaria extends Farmacia {

	private String tipoP;

	public Perfumaria(int tipo, String produto, float valor, int estoque, long id, String tipoP) {
		super(tipo, produto, valor, estoque, id);
		this.tipoP = tipoP;
	}

	public String getTipoP() {
		return tipoP;
	}

	public void setTipoP(String tipoP) {
		this.tipoP = tipoP;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("6-Tipo de Perfume: " + this.tipoP);
	}
}