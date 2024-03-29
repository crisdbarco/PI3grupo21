package br.com.pulsar.hemocentro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.pulsar.hemocentro.dto.AtualizacaoPessoaDto;
import br.com.pulsar.hemocentro.dto.CadastroPessoaDto;
import br.com.pulsar.hemocentro.entities.Doacao;
import br.com.pulsar.hemocentro.entities.Pessoa;
import br.com.pulsar.hemocentro.entities.Transfusao;
import br.com.pulsar.hemocentro.exceptions.ValidacaoException;
import br.com.pulsar.hemocentro.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;

	public void cadastrar(CadastroPessoaDto dto) {
		boolean jaCadastrado = pessoaRepository.existsByCpf(dto.cpf());

		if (jaCadastrado) {
			throw new ValidacaoException("Pessoa já cadastrada!");
		}

		pessoaRepository.save(new Pessoa(dto));
	}

	public void atualizar(AtualizacaoPessoaDto dto) {
		Pessoa pessoa = pessoaRepository.getReferenceById(dto.id());
		pessoa.atualizarDados(dto);
	}

	public void deleteById(@PathVariable Long id) {
		pessoaRepository.deleteById(id);
	}

	public List<Doacao> listarDoacoesRealizadasPorId(Long id) {
		Pessoa pessoa = pessoaRepository.getReferenceById(id);
		return pessoa.getListaDeDoacoes();
	}
	
	public List<Transfusao> listarTransfusoesRealizadasPorId(Long id) {
		Pessoa pessoa = pessoaRepository.getReferenceById(id);
		return pessoa.getListaDeTransfusoes();
	}
	
	public List<Pessoa> listarTodasAsPessoasCadastradasOrdenadasPorQtdeDoacoesRealizadas() {
		return pessoaRepository.findAllByOrderByQtdeDoacoesRealizadasDesc();
	}
	
	public List<Pessoa> listarTodasAsPessoasCadastradasOrdenadasPorQtdeTransfusoesRealizadas() {
		return pessoaRepository.findAllByOrderByQtdeTransfusoesRealizadasDesc();
	}

}
