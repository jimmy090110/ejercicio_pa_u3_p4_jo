package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.dto.DetalleFacturaDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class DetalleFacturaRepositoryImpl implements IDetalleFacturaRepository {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public DetalleFacturaDTO seleccionar(DetalleFacturaDTO detalleFacturaDTO) {
		TypedQuery<DetalleFacturaDTO>myQuery= this.entityManager.createQuery("Select NEW ",DetalleFacturaDTO.class);
		return myQuery.getSingleResult();
	}

}
