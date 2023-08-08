package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IFacturaRepository;
import com.example.demo.repository.IProductoRepository;
import com.example.demo.repository.modelo.DetalleFactura;
import com.example.demo.repository.modelo.Factura;
import com.example.demo.repository.modelo.Producto;
import com.example.demo.repository.modelo.dto.ProductoDTO;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;



@Service
public class FacturaServiceImpl implements IFacturaService {
	
	@Autowired
	private IProductoRepository productoRepository;
	
	@Autowired
	private IFacturaRepository facturaRepository;
	
	@Override
	@Transactional(value = TxType.REQUIRES_NEW)
	public void realizar(List<ProductoDTO> productos, String cedulaCliente) {
		Factura fact = new Factura();
		fact.setCedulaCliente(cedulaCliente);
		fact.setFecha(LocalDateTime.now());
		List<DetalleFactura> detalles=new ArrayList<>();
		productos.forEach(p->{
			Producto prod = this.productoRepository.seleccionar(p.getCodigoBarras());
			if (prod.getStock()>=0) {
				DetalleFactura defa = new DetalleFactura();
				defa.setCantidad(p.getCantidad());
				defa.setFactura(fact);
				defa.setProducto(prod);
				detalles.add(defa);
				fact.setDetalles(detalles);
				this.facturaRepository.insertar(fact);
			}else {
				throw new RuntimeException();
		
			}				
		});
		
		
		
	}
}
