package br.com.kentec.asterion.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name="cliente")
@SuppressWarnings("serial")
public class Cliente implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, length = 11)
	private Long id;
	
	@Column(name="nome", nullable = true, length = 100)
	private String nome;
	
	@Column(name="denominacao_social", nullable = true, length = 100)
	private String denominacaoSocial;
	
	@Column(name="cpfCnpj", nullable = true, length = 14)
	private String cpfCnpj;
	
	@Column(name="cep", nullable = true, length = 8)
	private String cep;
	
	@Column(name="endereco", nullable = true, length = 100)
	private String endereco;
	
	@Column(name="numero", nullable = true, length = 5)
	private String numero;
	
	@Column(name="complemento", nullable = true, length = 100)
	private String complemento;
	
	@Column(name="bairro", nullable = true, length = 50)
	private String bairro;
	
	@Column(name="estado", nullable = true, length = 50)
	private String estado;
	
	@Column(name="municipio", nullable = true, length = 50)
	private String municipio;
	
	@Column(name="telefone", nullable = true, length = 20)
	private String telefone;
	
	@Column(name="whatsapp", nullable = true, length = 20)
	private String whatsapp;
	
	@Column(name="email", nullable = true, length = 50)
	private String email;
	
	@Column(name="data_cadastro", nullable = true)
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate dataCadastro; 
	
	@Column(name="status", nullable = true, length = 7)
	private String status;
	
	@Lob
	@Column(columnDefinition = "MEDIUMBLOB")
	public byte[] logo;
	
	public Cliente() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDenominacaoSocial() {
		return denominacaoSocial;
	}

	public void setDenominacaoSocial(String denominacaoSocial) {
		this.denominacaoSocial = denominacaoSocial;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getWhatsapp() {
		return whatsapp;
	}

	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public byte[] getLogo() {
		return logo;
	}

	public void setLogo(byte[] logo) {
		this.logo = logo;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", denominacaoSocial=" + denominacaoSocial + ", cpfCnpj="
				+ cpfCnpj + ", cep=" + cep + ", endereco=" + endereco + ", numero=" + numero + ", complemento="
				+ complemento + ", bairro=" + bairro + ", estado=" + estado + ", municipio=" + municipio + ", telefone="
				+ telefone + ", whatsapp=" + whatsapp + ", email=" + email + ", dataCadastro=" + dataCadastro
				+ ", status=" + status + ", logo=" + Arrays.toString(logo) + "]";
	}
	
	
}
