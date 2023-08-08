package com.example.demo.repository.modelo;

import java.math.BigDecimal;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="detalle")
public class DetalleFactura {

	
	@Id
	@GeneratedValue(generator = "seq_detalle",strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_detalle",sequenceName = "seq_detalle", allocationSize = 1)
	@Column(name="defa_id")
	private Integer id;
	
	@Column(name = "defa_cantidad")
	private Integer cantidad;
	
	@Column(name="defa_precio_unitario")
	private BigDecimal precioUnitario;
	
	@Column(name="defa_subtotal")
	private BigDecimal subTotal;
	
	@ManyToOne
	@JoinColumn(name = "defa_id_factura")
	private Factura factura;
	
	@ManyToOne
	@JoinColumn(name = "defa_id_producto")
	private Producto producto;


	
	@Override
	public String toString() {
		return "DetalleFactura [id=" + id + ", cantidad=" + cantidad + ", precioUnitario=" + precioUnitario
				+ ", subTotal=" + subTotal + "]";
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
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



	public BigDecimal getSubTotal() {
		return subTotal;
	}



	public void setSubTotal(BigDecimal subTotal) {
		this.subTotal = subTotal;
	}



	public Factura getFactura() {
		return factura;
	}



	public void setFactura(Factura factura) {
		this.factura = factura;
	}



	public Producto getProducto() {
		return producto;
	}



	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	//Set and Get
	
	
	
	
}
