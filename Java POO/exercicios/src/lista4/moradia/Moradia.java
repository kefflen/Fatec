package lista4.moradia;

public abstract class Moradia {
	protected String endereco;
	protected String cidade;
	protected float tamanho;
	
	
	public Moradia(String endereco, String cidade, float tamanho) {
		this.setCidade(cidade);
		this.setEndereco(endereco);
		this.setTamanho(tamanho);
	}

	public abstract void calcularPreco();
	
	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public float getTamanho() {
		return tamanho;
	}


	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}
	
	
	
}
