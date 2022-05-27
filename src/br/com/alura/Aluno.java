package br.com.alura;

public class Aluno {

	private String nome;
	private int matricula;
	
	public Aluno(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	@Override
	public String toString() {
		return "[Aluno: " + this.nome + ", Matricula: " + this.matricula + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno outroAluno = (Aluno) obj;
		return this.nome.equals(outroAluno.getNome());
	}
	
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}
}
