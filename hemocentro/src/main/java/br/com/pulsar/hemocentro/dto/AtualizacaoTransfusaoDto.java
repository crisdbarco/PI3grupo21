package br.com.pulsar.hemocentro.dto;

import br.com.pulsar.hemocentro.entities.Pessoa;
import br.com.pulsar.hemocentro.entities.enums.RegionalHemocentro;

public record AtualizacaoTransfusaoDto(
		Long id,
		Pessoa receptor, 
//		TipoSanguineo tipoSanguineo,
		Double quantidadeRecebidaEmMililitros, 
		RegionalHemocentro regionalHemocentroTransfusao) 

{

}
