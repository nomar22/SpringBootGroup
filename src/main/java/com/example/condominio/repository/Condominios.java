package com.example.condominio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.condominio.model.Condominio;

public interface Condominios extends JpaRepository<Condominio, Long> {
	

}
