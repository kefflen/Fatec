package fatecfranca.edu.br.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Table;

import javax.persistence.Id;

@Entity
@Table(name = "postagem")
public class Postagem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String texto;
	private String autor;
	private int qtdLikes;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_post", referencedColumnName = "id")
	private List<Comentario> comentarios = new ArrayList<>();

	public Postagem() {
		super();
	}

	public Postagem(Long id, String texto, String autor, int qtdLikes, List<Comentario> comentarios) {
		super();
		this.id = id;
		this.texto = texto;
		this.autor = autor;
		this.qtdLikes = qtdLikes;
		this.comentarios = comentarios;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getQtdLikes() {
		return qtdLikes;
	}

	public void setQtdLikes(int qtdLikes) {
		this.qtdLikes = qtdLikes;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

	@Override
	public String toString() {
		return "Postagem [id=" + id + ", texto=" + texto + ", autor=" + autor + ", qtdLikes=" + qtdLikes
				+ ", comentarios=" + comentarios + "]";
	}

}
