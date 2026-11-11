package br.com.kentec.asterion.domain;

import java.io.Serializable;
import java.math.BigDecimal;

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
	@Column(name="id", nullable = false)
	private Long id;
	
	@Column(name="entrada", nullable = true)
	private Boolean entrada;
	
	@Column(name="saida", nullable = true)
	private Boolean saida;
	
	@Column(name="valor", precision = 15, scale = 2, nullable = false)
	private BigDecimal valor;
	
	@ManyToOne
	@JoinColumn(name = "id_cliente", nullable = false)
	private Cliente cliente = new Cliente();
	
	@Column(name="status", nullable = true, length = 7)
	private String status; 
}
