package br.com.kentec.asterion.DTO;

import java.math.BigDecimal;

import br.com.kentec.asterion.domain.MovimentoFinanceiroReceita;

public class MovimentoFinanceiroRecDTO {
    private Long id;
    private String numeroDocumento;
    private String dataReceita;
    private String dataRecebimento;
    private String statusRecebimento;
    private String tipoRecebimento;
    private String formaRecebimento;
    private BigDecimal valor;
    private String observacao;
    private Boolean receita;
    private Long userId;
    private Long periodoId;
    private Long descricaoReceitaId;
    private String descricaoReceita;
    
    
    public MovimentoFinanceiroRecDTO() {}
    
    public MovimentoFinanceiroRecDTO(MovimentoFinanceiroReceita movFin) {
    	this.id = movFin.getId();
    	this.numeroDocumento = movFin.getNumeroDocumento();
    	this.dataReceita = movFin.getDataReceita();
    	this.dataRecebimento = movFin.getDataRecebimento();
    	this.statusRecebimento = movFin.getStatusRecebimento();
    	this.tipoRecebimento = movFin.getTipoRecebimento();
    	this.formaRecebimento = movFin.getFormaRecebimento();
    	this.valor = movFin.getValor();
    	this.observacao = movFin.getObservacao();
    	this.receita = movFin.getReceita();
    	this.userId = movFin.getUser().getId();
    	this.periodoId = movFin.getPeriodo().getId();
    	this.descricaoReceitaId = movFin.getDescricaoReceita().getId();
    	this.descricaoReceita = movFin.getDescricaoReceita().getDescricao();
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

	public String getDataReceita() {
		return dataReceita;
	}

	public void setDataReceita(String dataReceita) {
		this.dataReceita = dataReceita;
	}

	public String getDataRecebimento() {
		return dataRecebimento;
	}

	public void setDataRecebimento(String dataRecebimento) {
		this.dataRecebimento = dataRecebimento;
	}

	public String getStatusRecebimento() {
		return statusRecebimento;
	}

	public void setStatusRecebimento(String statusRecebimento) {
		this.statusRecebimento = statusRecebimento;
	}

	public String getTipoRecebimento() {
		return tipoRecebimento;
	}

	public void setTipoRecebimento(String tipoRecebimento) {
		this.tipoRecebimento = tipoRecebimento;
	}

	public String getFormaRecebimento() {
		return formaRecebimento;
	}

	public void setFormaRecebimento(String formaRecebimento) {
		this.formaRecebimento = formaRecebimento;
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

	public Long getDescricaoReceitaId() {
		return descricaoReceitaId;
	}

	public void setDescricaoReceitaId(Long descricaoReceitaId) {
		this.descricaoReceitaId = descricaoReceitaId;
	}

	public Boolean getReceita() {
		return receita;
	}

	public void setReceita(Boolean receita) {
		this.receita = receita;
	}

	public String getDescricaoReceita() {
		return descricaoReceita;
	}

	public void setDescricaoReceita(String descricaoReceita) {
		this.descricaoReceita = descricaoReceita;
	}

	@Override
	public String toString() {
		return "MovimentoFinanceiroRecDTO [id=" + id + ", numeroDocumento=" + numeroDocumento + ", dataReceita="
				+ dataReceita + ", dataRecebimento=" + dataRecebimento + ", statusRecebimento=" + statusRecebimento
				+ ", tipoRecebimento=" + tipoRecebimento + ", formaRecebimento=" + formaRecebimento + ", valor=" + valor
				+ ", observacao=" + observacao + ", receita=" + receita + ", userId=" + userId + ", periodoId="
				+ periodoId + ", descricaoReceitaId=" + descricaoReceitaId + ", descricaoReceita=" + descricaoReceita
				+ "]";
	}	
}
