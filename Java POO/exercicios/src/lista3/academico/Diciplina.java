package lista3.academico;

import java.util.ArrayList;

public class Diciplina {
	private String nome;
	private int cargaHoraria;
	private ArrayList<Aluno> alunos;
	
	public Diciplina() {
		this.setAlunos(new ArrayList<Aluno>());;
	}
	
	public Diciplina(String nome, int cargaHoraria) {
		this();
		this.setCargaHoraria(cargaHoraria);
		this.setNome(nome);
	}

	public Diciplina(String nome, int cargaHoraria, ArrayList<Aluno> alunos) {
		this.setAlunos(alunos);
		this.setCargaHoraria(cargaHoraria);
		this.setNome(nome);
	}

	public void addAluno(Aluno aluno) {
		this.alunos.add(aluno);
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}

	@Override
	public String toString() {
		return "Diciplina [nome=" + nome + ", cargaHoraria=" + cargaHoraria + ", \n\talunos=" + alunos + "]";
	}
	
	
}
