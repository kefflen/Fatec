package lista3.mercado;

public class ItemCarrinho {
	private int codigo; 
	private String descricao; 
	private int qtd; 
	private float preco;
	public int getCodigo() {
		return codigo;
	}
	
	public ItemCarrinho() {
	}

	public ItemCarrinho(int codigo, String descricao, int qtd, float preco) {
		this.setCodigo(codigo);
		this.setDescricao(descricao);
		this.setQtd(qtd);
		this.setPreco(preco);
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "ItemCarrinho [codigo=" + codigo + ", descricao=" + descricao + ", qtd=" + qtd + ", preco=" + preco
				+ "]";
	} 
	
	
}
