package br.com.kentec.asterion.DTO;

import br.com.kentec.asterion.domain.User;

public class UserGeneric {
	
    private Long id;
    private String nome;
    private String apelido;
    private String dataNascimento;
    private String fone;
    private String whatsapp;
    private String email; 
    private String cep;
    private String endereco;
    private String complemento;
    private String chaveUsuario;
    private String role;
    private Boolean autenticado;
    private String status;
    
    public UserGeneric() {
    }
    
    public UserGeneric(User user) {
    	this.id = user.getId();
    	this.nome = user.getNome();
    	this.apelido = user.getDataNascimento();
    	this.fone = user.getFone();
    	this.whatsapp = user.getWhatsapp();
    	this.email = user.getEmail();
    	this.cep = user.getCep();
    	this.endereco = user.getEndereco();
    	this.complemento = user.getComplemento();
    	this.chaveUsuario = user.getChaveUsuario();
    	this.role = user.getRole();
    	this.autenticado = user.getAutenticado();
    	this.status = user.getStatus();
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
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
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
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getChaveUsuario() {
		return chaveUsuario;
	}
	public void setChaveUsuario(String chaveUsuario) {
		this.chaveUsuario = chaveUsuario;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Boolean getAutenticado() {
		return autenticado;
	}
	public void setAutenticado(Boolean autenticado) {
		this.autenticado = autenticado;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "UserGeneric [id=" + id + ", nome=" + nome + ", apelido=" + apelido + ", dataNascimento="
				+ dataNascimento + ", fone=" + fone + ", whatsapp=" + whatsapp + ", email=" + email + ", cep=" + cep
				+ ", endereco=" + endereco + ", complemento=" + complemento + ", chaveUsuario=" + chaveUsuario
				+ ", role=" + role + ", autenticado=" + autenticado + ", status=" + status + "]";
	}   
}
