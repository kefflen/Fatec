package lista3.redesocial;

import java.util.Date;

public class Publica {
	private int nro;
	private Date data;
	private float nota;
	private Usuario usuario;
	private RedeSocial redeSocial;
	
	
	
	public Publica() { }
	
	public Publica(int nro, Date data, float nota, Usuario usuario, RedeSocial redeSocial) {
		this.setData(data);
		this.setNota(nota);
		this.setNro(nro);
		this.setRedeSocial(redeSocial);
		this.setUsuario(usuario);
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public RedeSocial getRedeSocial() {
		return redeSocial;
	}

	public void setRedeSocial(RedeSocial redeSocial) {
		this.redeSocial = redeSocial;
	}

	public int getNro() {
		return nro;
	}
	final void setNro(int nro) {
		this.nro = nro;
	}
	public Date getData() {
		return data;
	}
	final void setData(Date data) {
		this.data = data;
	}
	public float getNota() {
		return nota;
	}
	final void setNota(float nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Publica [nro=" + nro + ", data=" + data + ", nota=" + nota + ", \n\tusuario=" + usuario + ", \n\tredeSocial="
				+ redeSocial + "]";
	}
	
}
