package com.cafetero.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cafetero.model.Tostada;

public interface TostadaRepository extends JpaRepository<Tostada, Integer>, TostadaRepositoryCustom{

}
