package lista3;

public class Voo {
	private String origem;
	private String destino;
	private int codigo;
	
	
	
	public Voo() { }


	public Voo(String origem, String destino, int codigo) {
		this.setOrigem(origem);
		this.setDestino(destino);
		this.setCodigo(codigo);
	}
	

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String toString() {
		return "Voo [origem=" + origem + ", destino=" + destino + ", codigo=" + codigo + "]";
	}
	
	

}
