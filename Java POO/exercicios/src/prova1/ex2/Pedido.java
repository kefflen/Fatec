package prova1.ex2;

import java.util.Date;

public class Pedido {
	private int codigo;
	private Date data;
	private Cliente cliente;
	private Unidade unidade;
	
	public Pedido(int codigo, Date data, Cliente cliente, Unidade unidade) {
		this.codigo = codigo;
		this.unidade = unidade;
		this.data = data;
		this.cliente = cliente;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Unidade getUnidade() {
		return unidade;
	}

	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}

	@Override
	public String toString() {
		return "Pedido [codigo=" + codigo + ", data=" + data + ", cliente=" + cliente + ", unidade=" + unidade + "]";
	}
	
	
	
}
