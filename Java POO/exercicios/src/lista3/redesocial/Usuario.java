package lista3.redesocial;

public class Usuario {
	private int codigo;
	private String senha;
	private String nome;
	
	public Usuario() { }

	
	public Usuario(int codigo, String nome, String senha) {
		this.setSenha(senha);
		this.setCodigo(codigo);
		this.setNome(nome);
	}


	public int getCodigo() {
		return codigo;
	}

	final void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getSenha() {
		return senha;
	}
	final void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	final void setNome(String nome) {
		this.nome = nome;
	}


	@Override
	public String toString() {
		return "Usuario [codigo=" + codigo + ", senha=" + senha + ", nome=" + nome + "]";
	}
	
	
	
}
