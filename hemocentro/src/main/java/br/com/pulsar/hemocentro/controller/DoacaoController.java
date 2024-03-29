package br.com.pulsar.hemocentro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pulsar.hemocentro.dto.CadastroDoacaoDto;
import br.com.pulsar.hemocentro.exceptions.ValidacaoException;
import br.com.pulsar.hemocentro.service.DoacaoService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/doacoes")
public class DoacaoController {

	@Autowired
	private DoacaoService doacaoService;

	@PostMapping
	@Transactional
	public ResponseEntity<String> cadastrar(@RequestBody @Valid CadastroDoacaoDto dto) {
		try {
			doacaoService.cadastrar(dto);
			return ResponseEntity.ok().build();
		} catch (ValidacaoException exception) {
			return ResponseEntity.badRequest().body(exception.getMessage());
		}

	}

}
