package br.com.pulsar.hemocentro.dto;

import java.util.Date;

import br.com.pulsar.hemocentro.entities.enums.RegionalHemocentro;
import br.com.pulsar.hemocentro.entities.enums.TipoSanguineo;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record CadastroPessoaDto (
		@NotBlank
		@Pattern(regexp = "\\d{3}\\.?\\d{3}\\.?\\d{3}\\-?\\d{2}")
		String cpf,
		@NotBlank
		String nome,
		@NotBlank
		String celular,
		@Email
		@NotBlank
		String email,
		@NotNull
		Date dataDeNascimento,
		@NotNull
		TipoSanguineo tipoSanguineo,
		@NotNull
		RegionalHemocentro regionalHemocentroResidencia)
{

}
