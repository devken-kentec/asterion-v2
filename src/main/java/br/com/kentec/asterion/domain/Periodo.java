package br.com.kentec.asterion.domain;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="periodo")
@SuppressWarnings("serial")
public class Periodo implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, length = 11)
	private Long id;
	
	@Column(name="mesAno", nullable = true, length = 256)
	private String mesAno;
	
	@Column(name="status", nullable = true, length = 7)
	private String status;

	public Periodo() {
	}
	
	public Periodo(String mesAno, String status) {
		this.mesAno = mesAno;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMesAno() {
		return mesAno;
	}

	public void setMesAno(String mesAno) {
		this.mesAno = mesAno;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Periodo [id=" + id + ", mesAno=" + mesAno + ", status=" + status + "]";
	}
}
