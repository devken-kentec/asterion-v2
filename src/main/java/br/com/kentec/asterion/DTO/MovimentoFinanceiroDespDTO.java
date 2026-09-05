package br.com.kentec.asterion.DTO;

import java.math.BigDecimal;

import br.com.kentec.asterion.domain.MovimentoFinanceiroDespesa;

public class MovimentoFinanceiroDespDTO {
	
    private Long id;
    private String numeroDocumento;
    private String dataDespesa;
    private String dataPagamento;
    private String statusPagamento;
    private String tipoPagamento;
    private String formaPagamento;
    private BigDecimal valor;
    private String observacao;
    private Boolean despesa;
    private Long userId;
    private Long periodoId;
    private Long descricaoDespesaId;
    private String descricaoDespesa;
    
    public MovimentoFinanceiroDespDTO() {}
    
    public MovimentoFinanceiroDespDTO(MovimentoFinanceiroDespesa movFin) {
    	this.id = movFin.getId();
    	this.numeroDocumento = movFin.getNumeroDocumento();
    	this.dataDespesa = movFin.getDataDespesa();
    	this.dataPagamento = movFin.getDataPagamento();
    	this.statusPagamento = movFin.getStatusPagamento();
    	this.tipoPagamento = movFin.getTipoPagamento();
    	this.formaPagamento = movFin.getFormaPagamento();
    	this.valor = movFin.getValor();
    	this.observacao = movFin.getObservacao();
    	this.despesa = movFin.getDespesa();
    	this.userId = movFin.getUser().getId();
    	this.periodoId = movFin.getPeriodo().getId();
    	this.descricaoDespesaId = movFin.getDescricaoDespesa().getId();
    	this.descricaoDespesa = movFin.getDescricaoDespesa().getDescricao();
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

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getPeriodoId() {
		return periodoId;
	}

	public void setPeriodoId(Long periodoId) {
		this.periodoId = periodoId;
	}

	public Long getDescricaoDespesaId() {
		return descricaoDespesaId;
	}

	public void setDescricaoDespesaId(Long descricaoDespesaId) {
		this.descricaoDespesaId = descricaoDespesaId;
	}

	public Boolean getDespesa() {
		return despesa;
	}

	public void setDespesa(Boolean despesa) {
		this.despesa = despesa;
	}

	public String getDescricaoDespesa() {
		return descricaoDespesa;
	}

	public void setDescricaoDespesa(String descricaoDespesa) {
		this.descricaoDespesa = descricaoDespesa;
	}

	@Override
	public String toString() {
		return "MovimentoFinanceiroDespDTO [id=" + id + ", numeroDocumento=" + numeroDocumento + ", dataDespesa="
				+ dataDespesa + ", dataPagamento=" + dataPagamento + ", statusPagamento=" + statusPagamento
				+ ", tipoPagamento=" + tipoPagamento + ", formaPagamento=" + formaPagamento + ", valor=" + valor
				+ ", observacao=" + observacao + ", despesa=" + despesa + ", userId=" + userId + ", periodoId="
				+ periodoId + ", descricaoDespesaId=" + descricaoDespesaId + ", descricaoDespesa=" + descricaoDespesa
				+ "]";
	}
}
