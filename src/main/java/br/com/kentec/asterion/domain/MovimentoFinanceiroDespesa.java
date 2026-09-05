package br.com.kentec.asterion.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="movimento_financeiro_despesa")
@SuppressWarnings("serial")
public class MovimentoFinanceiroDespesa implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, length = 11)
	private Long id;
	
	@Column(name="numero_documento", nullable = true, length = 32)
	private String numeroDocumento;
	
	@Column(name="data_despesa", nullable = true, length = 10)
	@JsonFormat(pattern="yyyy-MM-dd")
	private String dataDespesa;
	
	@Column(name="data_pagamento", nullable = true, length = 10)
	@JsonFormat(pattern="yyyy-MM-dd")
	private String dataPagamento;
	
	@Column(name="status_pagamento", nullable = true, length = 22)
	private String statusPagamento;
		
	@Column(name="tipo_pagamento", nullable = true, length = 22)
	private String tipoPagamento;
	
	@Column(name="forma_pagamento", nullable = true, length = 22)
	private String formaPagamento;
	
	@Column(name="valor", precision = 15, scale = 2, nullable = false)
	private BigDecimal valor;
	
	@Column(name="observacao", nullable = true, length = 128)
	private String observacao;
	
	@Column(name="despesa", nullable = true)
	private Boolean despesa;
	
	@ManyToOne
	@JoinColumn(name = "id_user", nullable = false)
	private User user = new User();
	
	@ManyToOne
	@JoinColumn(name = "id_periodo", nullable = false)
	private Periodo periodo = new Periodo();
		
	@ManyToOne
	@JoinColumn(name = "id_descricao_despesa", nullable = true)
	private DescricaoDespesa descricaoDespesa = new DescricaoDespesa();
	
	public MovimentoFinanceiroDespesa() {
	
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getDataDespesa() {
		return dataDespesa;
	}

	public void setDataDespesa(String dataDespesa) {
		this.dataDespesa = dataDespesa;
	}

	public String getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(String dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public String getStatusPagamento() {
		return statusPagamento;
	}

	public void setStatusPagamento(String statusPagamento) {
		this.statusPagamento = statusPagamento;
	}

	public String getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Periodo getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
	}

	public DescricaoDespesa getDescricaoDespesa() {
		return descricaoDespesa;
	}

	public void setDescricaoDespesa(DescricaoDespesa descricaoDespesa) {
		this.descricaoDespesa = descricaoDespesa;
	}

	public Boolean getDespesa() {
		return despesa;
	}

	public void setDespesa(Boolean despesa) {
		this.despesa = despesa;
	}

	@Override
	public String toString() {
		return "MovimentoFinanceiroDespesa [id=" + id + ", numeroDocumento=" + numeroDocumento + ", dataDespesa="
				+ dataDespesa + ", dataPagamento=" + dataPagamento + ", statusPagamento=" + statusPagamento
				+ ", tipoPagamento=" + tipoPagamento + ", formaPagamento=" + formaPagamento + ", valor=" + valor
				+ ", observacao=" + observacao + ", despesa=" + despesa + ", user=" + user + ", periodo=" + periodo
				+ ", descricaoDespesa=" + descricaoDespesa + "]";
	}
}

