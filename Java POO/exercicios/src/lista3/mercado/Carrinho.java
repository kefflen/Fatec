package lista3.mercado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Carrinho {
	
	private int codigo;
	private float valorTotal;
	private String entrega;
	private String formaPagamento;
	private Date data;
	private ArrayList<ItemCarrinho> itens;
	
	
	
	public Carrinho() {
		this.setItens(new ArrayList<>());
	}

	public Carrinho(int codigo, float valorTotal, String entrega, String formaPagamento, Date data) {
		this();
		this.setCodigo(codigo);
		this.setData(data);
		this.setEntrega(entrega);
		this.setFormaPagamento(formaPagamento);
		this.setValorTotal(valorTotal);

	}
	
	public void addItemCarrinho(int codigo, String descricao, int qtd, float preco) {
		this.itens.add(new ItemCarrinho(codigo, descricao, qtd, preco));
	}
	
	public boolean removeItemCarrinho(int codigo) {
		ItemCarrinho item;

		item = this.itens.stream()
				.filter(carrinho -> carrinho.getCodigo() == codigo)
				.findFirst().orElse(new ItemCarrinho());
		
		return this.itens.remove(item);
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public float getValorTotal() {
		return valorTotal;
	}


	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}


	public String getEntrega() {
		return entrega;
	}


	public void setEntrega(String entrega) {
		this.entrega = entrega;
	}


	public String getFormaPagamento() {
		return formaPagamento;
	}


	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}


	public ArrayList<ItemCarrinho> getItens() {
		return itens;
	}
	
	private void setItens(ArrayList<ItemCarrinho> itens) {
		this.itens = itens;
	}


	@Override
	public String toString() {
		return "Carrinho [codigo=" + codigo + ", valorTotal=" + valorTotal + ", entrega=" + entrega
				+ ", formaPagamento=" + formaPagamento + ", data=" + data + ", \n\titens=" + itens + "]";
	}
	
}
