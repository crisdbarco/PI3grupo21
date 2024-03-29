package br.com.pulsar.hemocentro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.pulsar.hemocentro.dto.AtualizacaoTransfusaoDto;
import br.com.pulsar.hemocentro.dto.CadastroTransfusaoDto;
import br.com.pulsar.hemocentro.entities.Pessoa;
import br.com.pulsar.hemocentro.entities.Transfusao;
import br.com.pulsar.hemocentro.repository.PessoaRepository;
import br.com.pulsar.hemocentro.repository.TransfusaoRepository;

@Service
public class TransfusaoService {

	@Autowired
	private TransfusaoRepository transfusaoRepository;

	@Autowired
	private PessoaRepository pessoaRepository;

	public void cadastrar(CadastroTransfusaoDto dto) {
		Pessoa receptor = pessoaRepository.findByCpf(dto.cpfReceptor());
		Transfusao transfusao = new Transfusao(receptor, dto);
				
		receptor.adicionarTransfusao(transfusao);
		receptor.atualizaQtdeTransfusoesRealizadas();
		transfusaoRepository.save(transfusao);
	}

	public void atualizar(AtualizacaoTransfusaoDto dto) {
		Transfusao tranfusao = transfusaoRepository.getReferenceById(dto.id());
		tranfusao.atualizarDados(dto);
	}

	public List<Transfusao> listarTodos() {
		return transfusaoRepository.findAll();
	}

	public void deleteById(@PathVariable Long id) {
		transfusaoRepository.deleteById(id);
	}

}
