package br.com.pulsar.hemocentro.dto;

import java.util.Date;

import br.com.pulsar.hemocentro.entities.enums.RegionalHemocentro;
import br.com.pulsar.hemocentro.entities.enums.TipoSanguineo;
import jakarta.validation.constraints.Email;

public record AtualizacaoPessoaDto(
		Long id,
		String nome, 
		String celular, 
		@Email
		String email, 
		Date dataDeNascimento,
		TipoSanguineo tipoSanguineo,
		RegionalHemocentro regionalHemocentroResidencia) 

{

}
