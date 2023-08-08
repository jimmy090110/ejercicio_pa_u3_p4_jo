package com.example.demo.repository.modelo.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class DetalleFacturaDTO {
	
	private String nombre;
	
	private LocalDateTime fecha;
	
	private Integer cantidad;
	
	private BigDecimal precioUnitario;
	
	private BigDecimal precioTotal;
	
	public DetalleFacturaDTO() {
		// TODO Auto-generated constructor stub
	}

	public DetalleFacturaDTO(String nombre, LocalDateTime fecha, Integer cantidad, BigDecimal precioUnitario,
			BigDecimal precioTotal) {
		super();
		this.nombre = nombre;
		this.fecha = fecha;
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
		this.precioTotal = precioTotal;
		
	}

	//Set and Get
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(BigDecimal precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public BigDecimal getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(BigDecimal precioTotal) {
		this.precioTotal = precioTotal;
	}
	
	
	
	

}
