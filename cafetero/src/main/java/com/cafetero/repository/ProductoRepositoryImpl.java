package com.cafetero.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Query;
import org.hibernate.Session;

import com.cafetero.model.Producto;

public class ProductoRepositoryImpl implements ProductoRepositoryCustom{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Producto> getListaProductosPorTipo(String descripcion) {
		Session session = entityManager.unwrap(Session.class);
		Query query = session.createQuery("from Producto as prod where prod.tipo.descripcion =:desc ");
		query.setParameter("desc", descripcion);
		return query.list();
	}

}
