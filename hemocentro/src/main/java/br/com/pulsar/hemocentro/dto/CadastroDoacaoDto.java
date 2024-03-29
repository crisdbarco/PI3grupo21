package br.com.pulsar.hemocentro.dto;

import br.com.pulsar.hemocentro.entities.enums.RegionalHemocentro;

public record CadastroDoacaoDto	(
		String cpfDoador, 
//		TipoSanguineo tipoSanguineo,
		Double quantidadeDoadaEmMililitros, 
		RegionalHemocentro regionalHemocentroDoacao) 

{


}
