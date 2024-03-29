package br.com.pulsar.hemocentro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pulsar.hemocentro.dto.AtualizacaoPessoaDto;
import br.com.pulsar.hemocentro.dto.CadastroPessoaDto;
import br.com.pulsar.hemocentro.entities.Doacao;
import br.com.pulsar.hemocentro.entities.Pessoa;
import br.com.pulsar.hemocentro.entities.Transfusao;
import br.com.pulsar.hemocentro.exceptions.ValidacaoException;
import br.com.pulsar.hemocentro.service.PessoaService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

	@Autowired
	private PessoaService pessoaService;

	@PostMapping
	@Transactional
	public ResponseEntity<String> cadastrar(@RequestBody @Valid CadastroPessoaDto dto) {
		try {
			pessoaService.cadastrar(dto);
			return ResponseEntity.ok().build();
		} catch (ValidacaoException exception) {
			return ResponseEntity.badRequest().body(exception.getMessage());
		}
	}

	@PutMapping
	@Transactional
	public ResponseEntity<String> atualizar(@RequestBody @Valid AtualizacaoPessoaDto dto) {
		try {
			pessoaService.atualizar(dto);
			return ResponseEntity.ok().build();
		} catch (ValidacaoException exception) {
			return ResponseEntity.badRequest().body(exception.getMessage());
		}
	}
	
//    @GetMapping
//    public ResponseEntity<List<Pessoa>> listarTodasAsPessoasCadastradas() {
//        List<Pessoa> pessoas = pessoaService.listarTodasAsPessoasCadastradas();
//        return ResponseEntity.ok(pessoas);
//    }
    
    @GetMapping("/doacoes/{id}")
    public ResponseEntity<List<Doacao>> listarDoacoesRealizadasPorId(@PathVariable Long id) {
    	List<Doacao> listarDoacoesRealizadasPorId = pessoaService.listarDoacoesRealizadasPorId(id);
        return ResponseEntity.ok(listarDoacoesRealizadasPorId);
    }
        
    @GetMapping("transfusoes/{id}")
    public ResponseEntity<List<Transfusao>> listarTransfusoesRealizadasPorId(@PathVariable Long id) {
    	List<Transfusao> listarTransfusoesRealizadasPorId = pessoaService.listarTransfusoesRealizadasPorId(id);
        return ResponseEntity.ok(listarTransfusoesRealizadasPorId);
    }
    
    @GetMapping("doacoes")
    public ResponseEntity<List<Pessoa>> listarTodasAsPessoasCadastradasOrdenadasPorQtdeDoacoesRealizadas() {
        List<Pessoa> pessoas = pessoaService.listarTodasAsPessoasCadastradasOrdenadasPorQtdeDoacoesRealizadas();
        return ResponseEntity.ok(pessoas);
    }
    
    @GetMapping("transfusoes")
    public ResponseEntity<List<Pessoa>> listarTodasAsPessoasCadastradasOrdenadasPorQtdeTransfusoesRealizadas() {
        List<Pessoa> pessoas = pessoaService.listarTodasAsPessoasCadastradasOrdenadasPorQtdeTransfusoesRealizadas();
        return ResponseEntity.ok(pessoas);
    }
    
    
    
    
}
