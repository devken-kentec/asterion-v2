package br.com.kentec.cold.DTO;

import br.com.kentec.cold.domain.Post;

public class PostDTO {
	private Long id;
	private String dataPostagem;
	private String titulo;
	private String conteudo;
	private String resumo;
	private byte[] foto;
	private Long autorId;
	private String autorNome;
	private Long tagId;
	private String tagNome;
	private String visibilidade;
	private String  status;
	
	public PostDTO() {}
	
	public PostDTO(Post post) {
		this.id = post.getId();
		this.dataPostagem = post.getDataPostagem();
		this.titulo = post.getTitulo();
		this.conteudo = post.getConteudo();
		this.resumo = post.getResumo();
		this.foto = post.getFoto();
		this.autorId = post.getAutor().getId();
		this.autorNome = post.getAutor().getMedium() +"/"+ post.getAutor().getGuia();
		this.tagId = post.getTag().getId();
		this.tagNome = post.getTag().getDescricao();
		this.visibilidade = post.getVisibilidade();
		this.status = post.getStatus();
	}

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

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public Long getAutorId() {
		return autorId;
	}

	public void setAutorId(Long autorId) {
		this.autorId = autorId;
	}

	public String getAutorNome() {
		return autorNome;
	}

	public void setAutorNome(String autorNome) {
		this.autorNome = autorNome;
	}

	public Long getTagId() {
		return tagId;
	}

	public void setTagId(Long tagId) {
		this.tagId = tagId;
	}

	public String getTagNome() {
		return tagNome;
	}

	public void setTagNome(String tagNome) {
		this.tagNome = tagNome;
	}


	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getVisibilidade() {
		return visibilidade;
	}

	public void setVisibilidade(String visibilidade) {
		this.visibilidade = visibilidade;
	}

	@Override
	public String toString() {
		return "PostDTO [id=" + id + ", dataPostagem=" + dataPostagem + ", titulo=" + titulo + ", conteudo=" + conteudo
				+ ", resumo=" + resumo + ", foto=" + foto + ", autorId=" + autorId + ", autorNome=" + autorNome
				+ ", tagId=" + tagId + ", tagNome=" + tagNome + ", visibilidade=" + visibilidade + ", status=" + status
				+ "]";
	}
}
