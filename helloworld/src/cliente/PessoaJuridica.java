package cliente;

public class PessoaJuridica extends Cliente {
	private String cnpj;

	public PessoaJuridica(String nome, String telefone, Integer idade, String email, String endereco, Integer tipo,
			String cnpj) {
		super(nome, telefone, idade, email, endereco, tipo);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println(", " + cnpj);
	}
}