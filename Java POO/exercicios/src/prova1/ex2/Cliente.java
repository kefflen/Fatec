package prova1.ex2;

public class Cliente {
	private String nome;
	private String cliente;

	public Cliente(String cliente, String nome) {
		this.setCliente(cliente);
		this.setNome(nome);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCliente() {
		return cliente;
	}
	
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	

	@Override
	public String toString() {
		return "Cliente [cliente=" + cliente + ", nome=" + nome + "]";
	}
	
	
	
}
