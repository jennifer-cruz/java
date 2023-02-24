package curso;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaCurso {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ArrayList<Curso> cursos = new ArrayList<Curso>();

		String opcao, aluno, periodo, cursoL, cursoE;
		int idade, tipoC;
		long idAluno;

		do {
			System.out.println("Id do Aluno: ");
			idAluno = ler.nextInt();

			System.out.println("Nome do Aluno: ");
			ler.skip("\\R?");
			aluno = ler.nextLine();

			System.out.println("Idade do Aluno: ");
			idade = ler.nextInt();

			System.out.println("Tipo do Curso: ");
			tipoC = ler.nextInt();

			System.out.println("Período: ");
			ler.skip("\\R?");
			periodo = ler.nextLine();

			switch (tipoC) {
			case 1 -> {
				System.out.println("Qual curso livre? ");
				ler.skip("\\R?");
				cursoL = ler.nextLine();

				CursoL cl1 = new CursoL(aluno, tipoC, idade, periodo, idAluno, cursoL);
				cursos.add(cl1);
			}
			case 2 -> {
				System.out.println("Qual especialização? ");
				ler.skip("\\R?");
				cursoE = ler.nextLine();

				Especializacao ce1 = new Especializacao(aluno, tipoC, idade, periodo, idAluno, cursoE);
				cursos.add(ce1);
			}

			}

			System.out.println("\nDeseja continuar? ");
			ler.skip("\\R?");
			opcao = ler.nextLine();

		} while (opcao.equalsIgnoreCase("S"));

		for (var curso : cursos)
			curso.visualizar();

		ler.close();
	}
}
