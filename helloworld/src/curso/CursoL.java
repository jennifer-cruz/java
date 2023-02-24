package curso;

public class CursoL extends Curso {

	private String cursoL;

	public CursoL(String aluno, int tipoC, int idade, String periodo, long idAluno, String cursoL) {
		super(aluno, tipoC, idade, periodo, idAluno);
		this.cursoL = cursoL;
	}

	public String getCursoL() {
		return cursoL;
	}

	public void setCursoL(String cursoL) {
		this.cursoL = cursoL;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("6- Curso Livre: " + this.cursoL);
	}

}