package com.example.demo.service;

import java.util.List;


import com.example.demo.repository.modelo.dto.ProductoDTO;


public interface IFacturaService {
	
	public void realizar(List<ProductoDTO>productos,String cedulaCliente);

}
