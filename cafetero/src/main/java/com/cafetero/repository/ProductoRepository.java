package com.cafetero.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cafetero.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer>, ProductoRepositoryCustom{

}
