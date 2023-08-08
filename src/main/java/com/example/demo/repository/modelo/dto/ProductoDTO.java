package com.example.demo.repository.modelo.dto;

public class ProductoDTO {
	private String codigoBarras;
	
	private Integer cantidad;

	public ProductoDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public ProductoDTO(String codigoBarras, Integer cantidad) {
		super();
		this.codigoBarras = codigoBarras;
		this.cantidad = cantidad;
	}

	
	
	@Override
	public String toString() {
		return "ProductoDTO [codigoBarras=" + codigoBarras + ", cantidad=" + cantidad + "]";
	}

	//Set and Get
	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	
	
	

}
