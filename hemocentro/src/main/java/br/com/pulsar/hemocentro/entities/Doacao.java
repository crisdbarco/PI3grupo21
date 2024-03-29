package br.com.pulsar.hemocentro.entities;

import java.util.Date;
import java.util.Objects;

import br.com.pulsar.hemocentro.dto.AtualizacaoDoacaoDto;
import br.com.pulsar.hemocentro.dto.CadastroDoacaoDto;
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
@Table(name = "doacoes")
public class Doacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private TipoSanguineo tipoSanguineo;
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private RegionalHemocentro regionalHemocentroDoacao;
	@Column(nullable = false)
	private Double quantidadeDoadaEmMililitros;
	private Date dataDaDoacao;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "doador_id")
	private Pessoa doador;
	
	public Doacao() {
		
	}

	public Doacao(Pessoa doador, CadastroDoacaoDto dto) {
		this.doador = doador;
		this.tipoSanguineo = doador.getTipoSanguineo();
		this.quantidadeDoadaEmMililitros = dto.quantidadeDoadaEmMililitros();
		this.dataDaDoacao = new Date();
		this.regionalHemocentroDoacao = dto.regionalHemocentroDoacao();
	}
	
	public void atualizarDados(AtualizacaoDoacaoDto dto) {
		this.doador = dto.doador();
		this.tipoSanguineo = dto.doador().getTipoSanguineo();
		this.quantidadeDoadaEmMililitros = dto.quantidadeDoadaEmMililitros();
		this.regionalHemocentroDoacao = dto.regionalHemocentroDoacao();
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
		return regionalHemocentroDoacao;
	}

	public void setRegionalHemocentro(RegionalHemocentro regionalHemocentro) {
		this.regionalHemocentroDoacao = regionalHemocentro;
	}

	public Double getQuantidadeDoadaEmMililitros() {
		return quantidadeDoadaEmMililitros;
	}

	public void setQuantidadeDoadaEmMililitros(Double quantidadeDoadaEmMililitros) {
		this.quantidadeDoadaEmMililitros = quantidadeDoadaEmMililitros;
	}

	public Date getDataDaDoacao() {
		return dataDaDoacao;
	}

	public void setDataDaDoacao(Date dataDaDoacao) {
		this.dataDaDoacao = dataDaDoacao;
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
		Doacao other = (Doacao) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Doacao [id=" + id + ", tipoSanguineo=" + tipoSanguineo + ", regionalHemocentroDoacao=" + regionalHemocentroDoacao
				+ ", quantidadeDoadaEmMililitros=" + quantidadeDoadaEmMililitros + ", dataDaDoacao=" + dataDaDoacao
				+ "]";
	}
	
	
	

}
