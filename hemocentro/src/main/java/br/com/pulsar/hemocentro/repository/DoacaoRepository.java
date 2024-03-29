package br.com.pulsar.hemocentro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pulsar.hemocentro.entities.Doacao;

public interface DoacaoRepository extends JpaRepository<Doacao, Long> {
	
	
	
}
