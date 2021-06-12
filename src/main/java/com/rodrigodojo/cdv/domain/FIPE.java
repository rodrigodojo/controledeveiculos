package com.rodrigodojo.cdv.domain;

public class FIPE {
	
	private String marca;
	private String codigo;
	
	public FIPE() {}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public FIPE(String marca, String codigo) {
		super();
		this.marca = marca;
		this.codigo = codigo;
	}
	
}
