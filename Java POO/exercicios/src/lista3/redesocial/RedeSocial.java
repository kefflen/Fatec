package lista3.redesocial;

public class RedeSocial {
	private int codigo;
	private String nome;
	private String url;
	public int getCodigo() {
		return codigo;
	}
	
	public RedeSocial() { }
	public RedeSocial(int codigo, String nome, String url) {
		this.setCodigo(codigo);
		this.setNome(nome);
		this.setUrl(url);
	}


	final void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	final void setNome(String nome) {
		this.nome = nome;
	}
	public String getUrl() {
		return url;
	}
	final void setUrl(String url) {
		this.url = url;
	}


	public String toString() {
		return "RedeSocial [codigo=" + codigo + ", nome=" + nome + ", url=" + url + "]";
	}
	
	
	
	
}
