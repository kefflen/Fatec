package prova1.ex3;

public class Veiculo {
	protected int ano;
	protected float preco;
	protected String descricao;
	
	
	
	public Veiculo() {
	}

	public Veiculo(int ano, float preco, String descricao) {
		super();
		this.ano = ano;
		this.preco = preco;
		this.descricao = descricao;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public float getPreco() {
		return preco;
	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Veiculo [ano=" + ano + ", preco=" + preco + ", descricao=" + descricao + "]";
	}
	
	
}
