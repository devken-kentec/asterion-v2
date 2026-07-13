package br.com.kentec.cold.domain;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="autor")
@SuppressWarnings("serial")
public class Autor implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, length = 11)
	private Long id;
	
	@Column(name="medium", nullable = false, length = 32)
    private String medium;
	
	@Column(name="guia", nullable = false, length = 32)
    private String guia;
	
	@Column(name="sobre_guia", nullable = false, length = 256)
    private String sobreGuia;
	
    @Column(name="status", nullable = true, length = 7)
	private String status;
    
    public Autor() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMedium() {
		return medium;
	}

	public void setMedium(String medium) {
		this.medium = medium;
	}

	public String getGuia() {
		return guia;
	}

	public void setGuia(String guia) {
		this.guia = guia;
	}

	public String getSobreGuia() {
		return sobreGuia;
	}

	public void setSobreGuia(String sobreGuia) {
		this.sobreGuia = sobreGuia;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Autor [id=" + id + ", medium=" + medium + ", guia=" + guia + ", sobreGuia=" + sobreGuia + ", status="
				+ status + "]";
	}
}
