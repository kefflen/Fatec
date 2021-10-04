package prova1.ex2;

public class Unidade {
	private String estado;
	private String cidade;
	
	
	public Unidade(String cidade, String estado) {
		this.setCidade(cidade);
		this.setEstado(estado);
	}
	
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	@Override
	public String toString() {
		return "Unidade [cidade=" + cidade + ", estado=" + estado + "]";
	}
	
	
	
}
