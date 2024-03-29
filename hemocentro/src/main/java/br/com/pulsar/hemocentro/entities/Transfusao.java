package br.com.pulsar.hemocentro.entities;

import java.util.Date;
import java.util.Objects;

import br.com.pulsar.hemocentro.dto.AtualizacaoTransfusaoDto;
import br.com.pulsar.hemocentro.dto.CadastroTransfusaoDto;
import br.com.pulsar.hemocentro.entities.enums.RegionalHemocentro;
import br.com.pulsar.hemocentro.entities.enums.TipoSanguineo;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "transfusoes")
public class Transfusao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private TipoSanguineo tipoSanguineo;
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private RegionalHemocentro regionalHemocentroTransfusao;
	@Column(nullable = false)
	private Double quantidadeRecebidaEmMililitros;
	private Date dataDaTransfusao;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "receptor_id")
	private Pessoa receptor;
	
	public Transfusao() {
		
	}

	public Transfusao(Pessoa receptor, CadastroTransfusaoDto dto) {
		this.receptor = receptor;
		this.tipoSanguineo = receptor.getTipoSanguineo();
		this.quantidadeRecebidaEmMililitros = dto.quantidadeRecebidaEmMililitros();
		this.dataDaTransfusao = new Date();
		this.regionalHemocentroTransfusao = dto.regionalHemocentroTransfusao();
	}
	
	public void atualizarDados(AtualizacaoTransfusaoDto dto) {
		this.receptor = dto.receptor();
		this.tipoSanguineo = dto.receptor().getTipoSanguineo();
		this.quantidadeRecebidaEmMililitros = dto.quantidadeRecebidaEmMililitros();
		this.regionalHemocentroTransfusao = dto.regionalHemocentroTransfusao();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TipoSanguineo getTipoSanguineo() {
		return tipoSanguineo;
	}

	public void setTipoSanguineo(TipoSanguineo tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}

	public RegionalHemocentro getRegionalHemocentro() {
		return regionalHemocentroTransfusao;
	}

	public void setRegionalHemocentro(RegionalHemocentro regionalHemocentro) {
		this.regionalHemocentroTransfusao = regionalHemocentro;
	}

	public Double getQuantidadeDoadaEmMililitros() {
		return quantidadeRecebidaEmMililitros;
	}

	public void setQuantidadeDoadaEmMililitros(Double quantidadeDoadaEmMililitros) {
		this.quantidadeRecebidaEmMililitros = quantidadeDoadaEmMililitros;
	}

	public Date getDataDaDoacao() {
		return dataDaTransfusao;
	}

	public void setDataDaDoacao(Date dataDaTransfusao) {
		this.dataDaTransfusao = dataDaTransfusao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transfusao other = (Transfusao) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Doacao [id=" + id + ", tipoSanguineo=" + tipoSanguineo + ", regionalHemocentroDoacao=" + regionalHemocentroTransfusao
				+ ", quantidadeDoadaEmMililitros=" + quantidadeRecebidaEmMililitros + ", dataDaDoacao=" + dataDaTransfusao
				+ "]";
	}
	
	
	

}
