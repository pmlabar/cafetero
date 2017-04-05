package com.cafetero.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class TostadaRepositoryImpl implements TostadaRepositoryCustom{

	@PersistenceContext
	private EntityManager entityManager;
	
	

}
