package prova1.ex3;

public class NaoMotorizado extends Veiculo {
	private String meioLocomocao;

	
	public NaoMotorizado(int ano, float preco, String descricao, String meioLocomocao) {
		super(ano, preco, descricao);
		this.setMeioLocomocao(meioLocomocao);
	}

	public String getMeioLocomocao() {
		return meioLocomocao;
	}

	public void setMeioLocomocao(String meioLocomocao) {
		this.meioLocomocao = meioLocomocao;
	}

	@Override
	public String toString() {
		return "NaoMotorizado [meioLocomocao=" + meioLocomocao + ", ano=" + ano + ", preco=" + preco + ", descricao="
				+ descricao + "]";
	}
	
	
	
}
