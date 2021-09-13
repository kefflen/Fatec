package lista4.rh;

public abstract class Funcionario {
	protected String nome;
	protected String cpf;
	protected float salario;
	
	
	public Funcionario() {}
	
	public Funcionario(String nome, String cpf, float salario) {
		this.setCpf(cpf);
		this.setSalario(salario);
		this.setNome(nome);
	}
	
	public abstract void receberSalario();
	

	public String getNome() {
		return nome;
	}

	public final void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public final void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public float getSalario() {
		return salario;
	}

	public final void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", cpf=" + cpf + ", salario=" + salario + "]";
	}
	
}
