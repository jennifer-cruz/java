package curso;

public class Curso {
	private String aluno;
	private int tipoC;
	private int idade;
	private String periodo;
	private long idAluno;

	public Curso(String aluno, int tipoC, int idade, String periodo, long idAluno) {
		this.aluno = aluno;
		this.tipoC = tipoC;
		this.idade = idade;
		this.periodo = periodo;
		this.idAluno = idAluno;
	}

	public String getAluno() {
		return aluno;
	}

	public void setAluno(String aluno) {
		this.aluno = aluno;
	}

	public int getTipoC() {
		return tipoC;
	}

	public void setTipoC(int tipoC) {
		this.tipoC = tipoC;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public long getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(long idAluno) {
		this.idAluno = idAluno;
	}

	public void visualizar() {
		System.out.println("********************************");
		System.out.println("        Dados do Aluno          ");
		System.out.println("********************************");
		System.out.println("1- Id do Aluno: " + this.idAluno);
		System.out.println("2- Nome do Aluno: " + this.aluno);
		System.out.println("3- Idade do Aluno: " + this.idade);
		System.out.println("4- Tipo de Curso: " + this.tipoC);
		System.out.println("5- Período: " + this.periodo);

	}
}
