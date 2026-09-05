package br.com.kentec.asterion.domain;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="descricao_receita")
@SuppressWarnings("serial")
public class DescricaoReceita implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, length = 11)
	private Long id;
	
	@Column(name="descricao", nullable = true, length = 256)
	private String descricao;

	@Column(name="status", nullable = true, length = 7)
	private String status;

	public DescricaoReceita() {
	}
	
	public DescricaoReceita(String descricao, String status) {
		this.descricao = descricao;
		this.status = status;
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "DescricaoReceita [id=" + id + ", descricao=" + descricao + ", status=" + status + "]";
	}
}
