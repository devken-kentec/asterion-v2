package br.com.kentec.asterion.domain;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="caixa")
@SuppressWarnings("serial")
public class Caixa implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, length = 11)
	private Long id;
	
	@Column(name="descricao", nullable = true, length = 256)
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name = "id_user", nullable = false)
	private User user = new User();

	@Column(name="status", nullable = true, length = 7)
	private String status;
	
	public Caixa() {
		
	}
	
	public Caixa(String descricao, User user, String status) {
		this.descricao = descricao;
		this.user = user;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Caixa [id=" + id + ", descricao=" + descricao + ", user=" + user + ", status=" + status + "]";
	}
}
