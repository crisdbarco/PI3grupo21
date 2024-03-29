package br.com.pulsar.hemocentro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pulsar.hemocentro.dto.CadastroTransfusaoDto;
import br.com.pulsar.hemocentro.exceptions.ValidacaoException;
import br.com.pulsar.hemocentro.service.TransfusaoService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/transfusoes")
public class TransfusaoController {

	@Autowired
	private TransfusaoService transfusaoService;

	@PostMapping
	@Transactional
	public ResponseEntity<String> cadastrar(@RequestBody @Valid CadastroTransfusaoDto dto) {
		try {
			transfusaoService.cadastrar(dto);
			return ResponseEntity.ok().build();
		} catch (ValidacaoException exception) {
			return ResponseEntity.badRequest().body(exception.getMessage());
		}

	}

}
