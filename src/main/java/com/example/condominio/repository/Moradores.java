package com.example.condominio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.condominio.model.Morador;

public interface Moradores extends JpaRepository<Morador, Long> {

}
