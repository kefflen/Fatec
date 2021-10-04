package prova1.ex3;

public class Motorizado extends Veiculo {
	private float potencia;
	private String combustivel;
	
	public Motorizado(int ano, float preco, String descricao, float potencia, String combustivel) {
		super(ano, preco, descricao);
		this.setPotencia(potencia);
		this.setCombustivel(combustivel);
	}
	
	public float getPotencia() {
		return potencia;
	}
	
	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}
	
	public String getCombustivel() {
		return combustivel;
	}
	
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	@Override
	public String toString() {
		return "Motorizado [potencia=" + potencia + ", combustivel=" + combustivel + ", ano=" + ano + ", preco=" + preco
				+ ", descricao=" + descricao + "]";
	}
	
	
}
