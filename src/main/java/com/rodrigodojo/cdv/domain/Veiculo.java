package com.rodrigodojo.cdv.domain;

public class Veiculo {
	
	private int id;
	private String marca;
	private String modelo;
	private Integer ano;
	
	public Veiculo() {
		
	}

	public Veiculo(int id, String marca, String modelo, Integer ano) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
}
