package lista3.academico;

public class Aluno {
	private String nome;
	private int ra;
	private int idade;
	
	
	public Aluno() { }


	public Aluno(int ra, String nome, int idade) {
		this.setIdade(idade);
		this.setNome(nome);
		this.setRa(ra);
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getRa() {
		return ra;
	}
	public void setRa(int ra) {
		this.ra = ra;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", ra=" + ra + ", idade=" + idade + "]";
	}
	
}
