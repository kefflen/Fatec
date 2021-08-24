package lista3;

public class Passageiro {
	private String nome;
	private String cpf;
	
	public Passageiro() {
		super();
	}

	public Passageiro(String nome, String cpf) {
		this.setNome(nome);
		this.setCpf(cpf);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String toString() {
		return "Passageiro [nome=" + nome + ", cpf=" + cpf + "]";
	}
	
	
	
}
