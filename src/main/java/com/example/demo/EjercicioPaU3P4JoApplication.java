package com.example.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Producto;
import com.example.demo.repository.modelo.dto.ProductoDTO;
import com.example.demo.service.IFacturaService;
import com.example.demo.service.IProductoService;

@SpringBootApplication
public class EjercicioPaU3P4JoApplication implements CommandLineRunner{

	@Autowired
	private IProductoService productoService;
	
	@Autowired
	private IFacturaService facturaService;
	
	public static void main(String[] args) {
		SpringApplication.run(EjercicioPaU3P4JoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//1
		Producto prod = new Producto();
		prod.setCategoria("Medicamentos");
		prod.setCodigoBarras("123a");
		prod.setPrecio(new BigDecimal(2));
		prod.setStock(5);
		prod.setNombre("Paracetamol");
		
		this.productoService.ingresar(prod);
		this.productoService.ingresar(prod);
		
		Producto prod2 = new Producto();
		prod2.setCategoria("Bebidas");
		prod2.setCodigoBarras("987z");
		prod2.setPrecio(new BigDecimal(1));
		prod2.setStock(4);
		prod2.setNombre("Hidratante");
		
		this.productoService.ingresar(prod2);
		this.productoService.ingresar(prod2);
		
		
		//2
		ProductoDTO prod3 = new ProductoDTO();
		prod3.setCantidad(1);
		prod3.setCodigoBarras("123a");
		
		ProductoDTO prod4 = new ProductoDTO();
		prod4.setCantidad(2);
		prod4.setCodigoBarras("987z");
		
		List<ProductoDTO>produs = new ArrayList<>();
		produs.add(prod3);
		produs.add(prod4);
		this.facturaService.realizar(produs, "010");
		
		//3
	
		
	}

}
