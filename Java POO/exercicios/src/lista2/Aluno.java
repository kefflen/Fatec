package lista2;

public class Aluno {
	private int numeroAluno;
	private String nome;
	private int idade;
	private float p1;
	private float p2;
	
	public Aluno(int numeroAluno, String nome, int idade, float p1, float p2) {
		this.numeroAluno = numeroAluno;
		this.nome = nome;
		this.idade = idade;
		this.p1 = p1;
		this.p2 = p2;
	}

	
	
	public int getNumeroAluno() {
		return numeroAluno;
	}

	public void setNumeroAluno(int numeroAluno) {
		this.numeroAluno = numeroAluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getP1() {
		return p1;
	}

	public void setP1(float p1) {
		this.p1 = p1;
	}

	public float getP2() {
		return p2;
	}

	public void setP2(float p2) {
		this.p2 = p2;
	}
	
	
	
}
