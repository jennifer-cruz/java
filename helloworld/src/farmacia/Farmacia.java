package farmacia;

public abstract class Farmacia {

	private int tipo;
	private String produto;
	private float valor;
	private int estoque;
	private long id;

	public Farmacia(int tipo, String produto, float valor, int estoque, long id) {
		this.tipo = tipo;
		this.produto = produto;
		this.valor = valor;
		this.estoque = estoque;
		this.id = id;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void visualizar() {

		String tipo = "";

		switch (this.tipo) {
		case 1 -> tipo = "Medicamento";
		case 2 -> tipo = "Perfumaria";
		}

		System.out.println("****************************************************************");
		System.out.println("                                                                ");
		System.out.println("                   🛍️ Dados da Sua Compra 🛍️                    ");
		System.out.println("                                                                ");
		System.out.println("****************************************************************");
		System.out.println("                                                                ");
		System.out.println("                   1- Produto: " + this.produto);
		System.out.println("                   2- Tipo: " + tipo);
		System.out.println("                   3- Valor unitário: " + this.valor);
		System.out.println("                   4- Quantidade: " + this.estoque);
		System.out.println("                   5- Valor Total: " + this.id);

	}
}