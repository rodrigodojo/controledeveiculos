package com.rodrigodojo.cdv.domain;

import java.util.Date;

public class Usuario {
	
	private int id;
	private String nome;
	private String email;
	private Integer CPF;
	private Date dataDeNascimento;
	
	public Usuario() {
		
	}

	public Usuario(int id, String nome, String email, Integer cPF, Date dataDeNascimento) {
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

	public Integer getCPF() {
		return CPF;
	}

	public void setCPF(Integer cPF) {
		CPF = cPF;
	}

	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
}
