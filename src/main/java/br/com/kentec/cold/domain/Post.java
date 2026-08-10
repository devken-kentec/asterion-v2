package br.com.kentec.cold.domain;

import java.io.Serializable;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="post")
@SuppressWarnings("serial")
public class Post implements Serializable  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, length = 11)
	private Long id;
	
	@Column(name="dataPostagem", nullable = true, length = 10)
	@JsonFormat(pattern="yyyy-MM-dd")
    private String dataPostagem;
	
	@Column(name="titulo", nullable = false, length = 256)
    private String titulo;
	
	@Column(name="resumo", nullable = false, columnDefinition = "TEXT")
    private String resumo;
    
    @Column(columnDefinition = "MEDIUMTEXT", nullable = true)
    private String conteudo;  
    
    @Lob
    @Column(name = "foto", nullable = true, columnDefinition = "LONGBLOB")
	public byte[] foto;
    
    @ManyToOne
	@JoinColumn(name = "id_autor", nullable = true)
    private Autor autor = new Autor();
    
    @ManyToOne
	@JoinColumn(name = "id_tag", nullable = true)
    private Tag tag = new Tag();
    
    @Column(name="visibilidade", nullable = true, length = 10)
	private String visibilidade;
    
    @Column(name="status", nullable = true, length = 7)
	private String status;
    
    public Post() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getDataPostagem() {
		return dataPostagem;
	}

	public void setDataPostagem(String dataPostagem) {
		this.dataPostagem = dataPostagem;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Tag getTag() {
		return tag;
	}

	public void setTag(Tag tag) {
		this.tag = tag;
	}

	public String getVisibilidade() {
		return visibilidade;
	}

	public void setVisibilidade(String visibilidade) {
		this.visibilidade = visibilidade;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", dataPostagem=" + dataPostagem + ", titulo=" + titulo + ", resumo=" + resumo
				+ ", conteudo=" + conteudo + ", foto=" + Arrays.toString(foto) + ", autor=" + autor + ", tag=" + tag
				+ ", visibilidade=" + visibilidade + ", status=" + status + "]";
	}
}
