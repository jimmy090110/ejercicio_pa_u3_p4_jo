package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Producto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Transactional
@Repository
public class ProductoRepositoryImpl implements IProductoRepository {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional(value = TxType.MANDATORY)
	public void insertar(Producto producto) {
		this.entityManager.persist(producto);
		
	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public Producto seleccionar(String codigoBarras) {
		TypedQuery<Producto>myQuery = this.entityManager.createQuery("Select p from Producto p WHERE p.codigoBarras=:datoCodigo",Producto.class);
		myQuery.setParameter("datoCodigo", codigoBarras);
		
		try {
			return myQuery.getSingleResult();
		} catch (Exception e) {
			System.out.println("Producto no encontrado");
			return null;
		}
		
	}

	@Override
	@Transactional(value = TxType.MANDATORY)
	public void modificar(Producto producto) {
		this.entityManager.merge(producto);
		
	}

}
