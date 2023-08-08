package com.example.demo.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="factura")
public class Factura {
	
	@Id
	@GeneratedValue(generator = "seq_factura",strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_factura",sequenceName = "seq_factura", allocationSize = 1)
	@Column(name="fact_id")
	private Integer id;
	
	@Column(name="fact_fecha")
	private LocalDateTime fecha;
	
	@Column(name="fact_cedula_cliente")
	private String cedulaCliente;
	
	@Column(name="fact_totla_factura")
	private BigDecimal totalFactura;
	
	@OneToMany(mappedBy = "factura", cascade = CascadeType.ALL)
	private List<DetalleFactura>detalles;

	@Override
	public String toString() {
		return "Factura [id=" + id + ", fecha=" + fecha + ", cedulaCliente=" + cedulaCliente + ", totalFactura="
				+ totalFactura + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public String getCedulaCliente() {
		return cedulaCliente;
	}

	public void setCedulaCliente(String cedulaCliente) {
		this.cedulaCliente = cedulaCliente;
	}

	public BigDecimal getTotalFactura() {
		return totalFactura;
	}

	public void setTotalFactura(BigDecimal totalFactura) {
		this.totalFactura = totalFactura;
	}

	public List<DetalleFactura> getDetalles() {
		return detalles;
	}

	public void setDetalles(List<DetalleFactura> detalles) {
		this.detalles = detalles;
	}
	
	
	
	

}
