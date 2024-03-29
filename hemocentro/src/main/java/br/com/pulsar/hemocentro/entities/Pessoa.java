package br.com.pulsar.hemocentro.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.pulsar.hemocentro.dto.AtualizacaoPessoaDto;
import br.com.pulsar.hemocentro.dto.CadastroPessoaDto;
import br.com.pulsar.hemocentro.entities.enums.RegionalHemocentro;
import br.com.pulsar.hemocentro.entities.enums.TipoSanguineo;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "pessoas")
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String cpf;
	private String nome;
	private String celular;
	private String email;
	private Integer qtdeDoacoesRealizadas;
	private Integer qtdeTransfusoesRealizadas;
	
	@Temporal(TemporalType.DATE)
	private Date dataDeNascimento;
	
	@Temporal(TemporalType.DATE)
	private Date dataDeCadastro;
	
	@Enumerated(EnumType.STRING)
	private TipoSanguineo tipoSanguineo;
	
	@Enumerated(EnumType.STRING)
	private RegionalHemocentro regionalHemocentroResidencia;
	
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "doador", cascade = CascadeType.ALL)
	private List<Doacao> listaDeDoacoes = new ArrayList<>();
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "receptor", cascade = CascadeType.ALL)
	private List<Transfusao> listaDeTransfusoes = new ArrayList<>();
	
	public Pessoa() {
		
	}

	public Pessoa(CadastroPessoaDto dto) {
		this.cpf = dto.cpf();
		this.nome = dto.nome();
		this.celular = dto.celular();
		this.email = dto.email();
		this.tipoSanguineo = dto.tipoSanguineo();
		this.regionalHemocentroResidencia = dto.regionalHemocentroResidencia();
		this.dataDeNascimento = dto.dataDeNascimento();
		this.dataDeCadastro = new Date();
		this.qtdeDoacoesRealizadas = 0;
		this.qtdeTransfusoesRealizadas = 0;
	}
	
	public void atualizarDados(AtualizacaoPessoaDto dto) {
		this.nome = dto.nome();
		this.celular = dto.celular();
		this.email = dto.email();
		this.dataDeNascimento = dto.dataDeNascimento();
		this.tipoSanguineo = dto.tipoSanguineo();
		this.regionalHemocentroResidencia = dto.regionalHemocentroResidencia();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public Date getDataDeCadastro() {
		return dataDeCadastro;
	}

	public void setDataDeCadastro(Date dataDeCadastro) {
		this.dataDeCadastro = dataDeCadastro;
	}

	public TipoSanguineo getTipoSanguineo() {
		return tipoSanguineo;
	}

	public void setTipoSanguineo(TipoSanguineo tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}

	public RegionalHemocentro getRegionalHemocentroResidencia() {
		return regionalHemocentroResidencia;
	}

	public void setRegionalHemocentroResidencia(RegionalHemocentro regionalHemocentroResidencia) {
		this.regionalHemocentroResidencia = regionalHemocentroResidencia;
	}
	
	public void adicionarDoacao(Doacao doacao) {
		listaDeDoacoes.add(doacao);
	}


	public List<Doacao> getListaDeDoacoes() {
		return listaDeDoacoes;
	}
	
	public void adicionarTransfusao(Transfusao transfusao) {
		listaDeTransfusoes.add(transfusao);
	}


	public List<Transfusao> getListaDeTransfusoes() {
		return listaDeTransfusoes;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	public Integer atualizaQtdeDoacoesRealizadas() {
		this.qtdeDoacoesRealizadas = listaDeDoacoes.size();
		return this.qtdeDoacoesRealizadas;
	}

	public Integer atualizaQtdeTransfusoesRealizadas() {
		this.qtdeTransfusoesRealizadas = listaDeTransfusoes.size();
		return this.qtdeTransfusoesRealizadas;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", cpf=" + cpf + ", nome=" + nome + ", celular=" + celular + ", email=" + email
				+ ", qtdeDoacoesRealizadas=" + qtdeDoacoesRealizadas + ", qtdeTransfusoesRealizadas="
				+ qtdeTransfusoesRealizadas + ", dataDeNascimento=" + dataDeNascimento + ", dataDeCadastro="
				+ dataDeCadastro + ", tipoSanguineo=" + tipoSanguineo + ", regionalHemocentroResidencia="
				+ regionalHemocentroResidencia + ", listaDeDoacoes=" + listaDeDoacoes + ", listaDeTransfusoes="
				+ listaDeTransfusoes + "]";
	}

	
	
	
	
	
	
	
}
