package cliente;

public class PessoaFisica extends Cliente {
	private String cpf;

	public PessoaFisica(String nome, String telefone, Integer idade, String email, String endereco, Integer tipo,
			String cpf) {
		super(nome, telefone, idade, email, endereco, tipo);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println(", " + cpf);
	}
}