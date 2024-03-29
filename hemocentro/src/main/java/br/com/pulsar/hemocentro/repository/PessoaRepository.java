package br.com.pulsar.hemocentro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pulsar.hemocentro.entities.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

	boolean existsByCpf(String cpf);
	Pessoa findByCpf(String cpf);
	List<Pessoa> findAllByOrderByQtdeDoacoesRealizadasDesc();
	List<Pessoa> findAllByOrderByQtdeTransfusoesRealizadasDesc();	
	
}
