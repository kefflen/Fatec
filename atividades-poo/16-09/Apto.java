package lista4.moradia;

public class Apto extends Moradia{
	private int nro;
	private int andar;
	
	public Apto(String endereco, String cidade, float tamanho, int nro, int andar) {
		super(endereco, cidade, tamanho);
		this.setAndar(andar);
		this.setNro(nro);
	}

	public void calcularPreco() {
		float precoPorTamanho = tamanho*800;
		float precoPorNrm = (nro%2 == 0)? 200 : 300;
		float extra = (andar >= 3)? 2000 : 0;
		float total = precoPorTamanho + precoPorNrm + extra;
		System.out.println("Preco do apartamento: " + total);
	}
	
	
	public int getNro() {
		return nro;
	}
	
	public void setNro(int nro) {
		this.nro = nro;
	}
	public int getAndar() {
		return andar;
	}
	public void setAndar(int andar) {
		this.andar = andar;
	}

	@Override
	public String toString() {
		return "Apto [nro=" + nro + ", andar=" + andar + ", endereco=" + endereco + ", cidade=" + cidade + ", tamanho="
				+ tamanho + "]";
	}
	

	
}
