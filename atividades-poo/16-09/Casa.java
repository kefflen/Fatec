package lista4.moradia;

public class Casa extends Moradia {
	private float tamQuintal;
	private boolean piscina;
	
	
	public Casa(String endereco, String cidade, float tamanho, float tamQuintal, boolean piscina) {
		super(endereco, cidade, tamanho);
		this.setPiscina(piscina);
		this.setTamQuintal(tamQuintal);
	}

	public void calcularPreco() {
		float precoPorTamanho = tamanho*500;
		float precoPorTamQuintal = tamQuintal * 100;
		float extras = (piscina)? 1000 : 0;
		float total = precoPorTamanho + precoPorTamQuintal + extras;
		System.out.println("Preco da casa: " + total);
	}
	
	public float getTamQuintal() {
		return tamQuintal;
	}
	public void setTamQuintal(float tamQuintal) {
		this.tamQuintal = tamQuintal;
	}

	public boolean hasPiscina() {
		return piscina;
	}

	public void setPiscina(boolean piscina) {
		this.piscina = piscina;
	}

	@Override
	public String toString() {
		return "Casa [tamQuintal=" + tamQuintal + ", piscina=" + piscina + ", endereco=" + endereco + ", cidade="
				+ cidade + ", tamanho=" + tamanho + "]";
	}
	
	
	
}
