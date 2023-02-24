package farmacia;

public class Medicamentos extends Farmacia {

	private String tipoM;

	public Medicamentos(int tipo, String produto, float valor, int estoque, long id, String tipoM) {
		super(tipo, produto, valor, estoque, id);
		this.tipoM = tipoM;
	}

	public String getTipoM() {
		return tipoM;
	}

	public void setTipoM(String tipoM) {
		this.tipoM = tipoM;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("6- Tipo de Medicamento: " + this.tipoM);
	}

}