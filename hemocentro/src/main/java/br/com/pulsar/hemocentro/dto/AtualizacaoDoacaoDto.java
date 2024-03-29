package br.com.pulsar.hemocentro.dto;

import br.com.pulsar.hemocentro.entities.Pessoa;
import br.com.pulsar.hemocentro.entities.enums.RegionalHemocentro;

public record AtualizacaoDoacaoDto(
		Long id,
		Pessoa doador, 
//		TipoSanguineo tipoSanguineo,
		Double quantidadeDoadaEmMililitros, 
		RegionalHemocentro regionalHemocentroDoacao) 

{

}
