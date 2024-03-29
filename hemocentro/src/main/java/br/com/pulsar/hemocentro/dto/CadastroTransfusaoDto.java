package br.com.pulsar.hemocentro.dto;

import br.com.pulsar.hemocentro.entities.enums.RegionalHemocentro;

public record CadastroTransfusaoDto	(
		String cpfReceptor, 
//		TipoSanguineo tipoSanguineo,
		Double quantidadeRecebidaEmMililitros, 
		RegionalHemocentro regionalHemocentroTransfusao) 

{


}
