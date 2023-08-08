package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IProductoRepository;
import com.example.demo.repository.modelo.Producto;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Service
public class ProductoServiceImpl implements IProductoService {
	
	@Autowired
	private IProductoRepository iProductoRepository;

	@Override
	@Transactional(value = TxType.REQUIRES_NEW)
	public void ingresar(Producto producto) {
		Producto proda= new Producto();
		proda = this.iProductoRepository.seleccionar(producto.getCodigoBarras());
		
		
		if (proda== null) {
			System.out.println("Insertando  Producto");
			this.iProductoRepository.insertar(producto);
			
		}else {
			System.out.println("Actualizando stock del Producto");
			
			Integer stocknuevo = proda.getStock()+producto.getStock();
			proda.setStock(stocknuevo);
			this.iProductoRepository.modificar(proda);
		}
		
		
	}



}
