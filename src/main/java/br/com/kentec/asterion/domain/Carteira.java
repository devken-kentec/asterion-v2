package br.com.kentec.asterion.domain;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="carteira")
@SuppressWarnings("serial")
public class Carteira implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, length = 11)
	private Long id;
	
	@Column(name="conta", nullable = true, length = 256)
	private String conta;
	
	@Column(name="status", nullable = true, length = 7)
	private String status;
	
	public Carteira() {
		
	}
	
	public Carteira(String conta, String status) {
		this.conta = conta;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Carteira [id=" + id + ", conta=" + conta + ", status=" + status + "]";
	}
}
