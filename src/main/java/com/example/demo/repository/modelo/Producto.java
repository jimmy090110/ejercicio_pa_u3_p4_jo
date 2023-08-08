package com.example.demo.repository.modelo;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="producto")
public class Producto {
	
	@Id
	@GeneratedValue(generator = "seq_autor",strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_autor",sequenceName = "seq_autor", allocationSize = 1)
	@Column(name="produ_id")
	private Integer id;
	
	@Column(name="produ_codigo_barras")
	private String codigoBarras;
	
	@Column(name="produ_categoria")
	private String categoria;
	
	@Column(name="produ_stock")
	private Integer stock;
	
	@Column(name="produ_precio")
	private BigDecimal precio;
	
	@Column(name="produ_nombre")
	private String nombre;
	
	@OneToMany(mappedBy = "producto")
	private List<DetalleFactura>detalles;



	@Override
	public String toString() {
		return "Producto [id=" + id + ", codigoBarras=" + codigoBarras + ", categoria=" + categoria + ", stock=" + stock
				+ ", precio=" + precio + ", nombre=" + nombre + "]";
	}

	//Set and get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public List<DetalleFactura> getDetalles() {
		return detalles;
	}

	public void setDetalles(List<DetalleFactura> detalles) {
		this.detalles = detalles;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	

}
