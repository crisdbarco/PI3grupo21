package br.com.pulsar.hemocentro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pulsar.hemocentro.entities.Transfusao;

public interface TransfusaoRepository extends JpaRepository<Transfusao, Long> {
	
}
