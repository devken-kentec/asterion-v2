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
@Table(name="movimento_financeiro_receita")
@SuppressWarnings("serial")
public class MovimentoFinanceiroReceita implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, length = 11)
	private Long id;
	
	@Column(name="numero_documento", nullable = true, length = 32)
	private String numeroDocumento;
	
	@Column(name="data_receita", nullable = true, length = 10)
	@JsonFormat(pattern="yyyy-MM-dd")
	private String dataReceita;
	
	@Column(name="data_recebimento", nullable = true, length = 10)
	@JsonFormat(pattern="yyyy-MM-dd")
	private String dataRecebimento;

	@Column(name="status_recebimento", nullable = true, length = 22)
	private String statusRecebimento;
	
	@Column(name="tipo_recebimento", nullable = true, length = 22)
	private String tipoRecebimento;
		
	@Column(name="forma_recebimento", nullable = true, length = 22)
	private String formaRecebimento;

	@Column(name="valor", precision = 15, scale = 2, nullable = false)
	private BigDecimal valor;
	
	@Column(name="observacao", nullable = true, length = 128)
	private String observacao;
	
	@Column(name="receita", nullable = true)
	private Boolean receita;
	
	@ManyToOne
	@JoinColumn(name = "id_user", nullable = false)
	private User user = new User();
	
	@ManyToOne
	@JoinColumn(name = "id_periodo", nullable = false)
	private Periodo periodo = new Periodo();
	
	@ManyToOne
	@JoinColumn(name = "id_descricao_receita", nullable = true)
	private DescricaoReceita descricaoReceita = new DescricaoReceita();
	
	public MovimentoFinanceiroReceita() {
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

	public DescricaoReceita getDescricaoReceita() {
		return descricaoReceita;
	}

	public void setDescricaoReceita(DescricaoReceita descricaoReceita) {
		this.descricaoReceita = descricaoReceita;
	}

	public Boolean getReceita() {
		return receita;
	}

	public void setReceita(Boolean receita) {
		this.receita = receita;
	}

	@Override
	public String toString() {
		return "MovimentoFinanceiroReceita [id=" + id + ", numeroDocumento=" + numeroDocumento + ", dataReceita="
				+ dataReceita + ", dataRecebimento=" + dataRecebimento + ", statusRecebimento=" + statusRecebimento
				+ ", tipoRecebimento=" + tipoRecebimento + ", formaRecebimento=" + formaRecebimento + ", valor=" + valor
				+ ", observacao=" + observacao + ", receita=" + receita + ", user=" + user + ", periodo=" + periodo
				+ ", descricaoReceita=" + descricaoReceita + "]";
	}
}
