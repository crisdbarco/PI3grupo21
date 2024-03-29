package br.com.pulsar.hemocentro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.pulsar.hemocentro.dto.AtualizacaoDoacaoDto;
import br.com.pulsar.hemocentro.dto.CadastroDoacaoDto;
import br.com.pulsar.hemocentro.entities.Doacao;
import br.com.pulsar.hemocentro.entities.Pessoa;
import br.com.pulsar.hemocentro.repository.DoacaoRepository;
import br.com.pulsar.hemocentro.repository.PessoaRepository;

@Service
public class DoacaoService {

	@Autowired
	private DoacaoRepository doacaoRepository;

	@Autowired
	private PessoaRepository pessoaRepository;

	public void cadastrar(CadastroDoacaoDto dto) {
		Pessoa doador = pessoaRepository.findByCpf(dto.cpfDoador());
		Doacao doacao = new Doacao(doador, dto);
				
		doador.adicionarDoacao(doacao);
		doador.atualizaQtdeDoacoesRealizadas();
		doacaoRepository.save(doacao);
	}

	public void atualizar(AtualizacaoDoacaoDto dto) {
		Doacao doacao = doacaoRepository.getReferenceById(dto.id());
		doacao.atualizarDados(dto);
	}

	public List<Doacao> listarTodos() {
		return doacaoRepository.findAll();
	}

	public void deleteById(@PathVariable Long id) {
		doacaoRepository.deleteById(id);
	}

}
