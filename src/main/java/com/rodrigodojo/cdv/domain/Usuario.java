package com.rodrigodojo.cdv.domain;

import java.io.Serializable;

public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String nome;
	private String email;
	private String CPF;
	private Integer dataDeNascimento;
	
	public Usuario() {
		
	}

	public Usuario(int id, String nome, String email, String cPF, Integer dataDeNascimento) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		CPF = cPF;
		this.dataDeNascimento = dataDeNascimento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public Integer getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Integer dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
}
