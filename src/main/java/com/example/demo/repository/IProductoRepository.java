package com.example.demo.repository;

import com.example.demo.repository.modelo.Producto;

public interface IProductoRepository {
	public void insertar(Producto producto);
	
	public void modificar(Producto producto);
	
	public Producto seleccionar(String codigoBarras);

}
