package EM;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Doenca implements Identificavel {

	@Id
	@GeneratedValue(generator="doenca_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="doenca_seq")
	private Long id;
	private String sintoma;
	
	@ManyToMany
	@JoinTable(name="doenca_tratamento", 
			joinColumns= {@JoinColumn(name="id_doenca")}, 
			inverseJoinColumns= {@JoinColumn(name="id_tratamento")})
	private Set<Tratamento> tratamentos;
	
	@ManyToMany
	@JoinTable(name="doenca_causa",
			joinColumns={@JoinColumn(name="id_doenca")},
			inverseJoinColumns= {@JoinColumn (name= "id_causa")})
	private Set<Causa> causas;
	
	@ManyToMany
	@JoinTable(name="doenca_pessoa",
			joinColumns={@JoinColumn(name="id_doenca")},
			inverseJoinColumns= {@JoinColumn (name= "id_pessoa")})
	private Set<Pessoa> pessoas;
	
	@ManyToMany
	@JoinTable (name="doenca_campanha",
			joinColumns= {@JoinColumn(name="id_doenca")},
			inverseJoinColumns= {@JoinColumn (name= "id_campanha")})
	private Set<Campanha> campanhas;
	
			
	public Set<Tratamento> getTratamentos() {
		return tratamentos;
	}
	public void setTratamentos(Set<Tratamento> tratamentos) {
		this.tratamentos = tratamentos;
	}
	public Set<Causa> getCausas() {
		return causas;
	}
	public void setCausas(Set<Causa> causas) {
		this.causas = causas;
	}
	public Set<Pessoa> getPessoas() {
		return pessoas;
	}
	public void setPessoas(Set<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
	public Set<Campanha> getCampanhas() {
		return campanhas;
	}
	public void setCampanhas(Set<Campanha> campanhas) {
		this.campanhas = campanhas;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long idDoenca) {
		this.id = idDoenca;
	}
	
	public String getSintoma() {
		return sintoma;
	}
	public void setSintoma(String sintoma) {
		this.sintoma = sintoma;
	}
	public Doenca(Long id, String sintoma) {
		super();
		this.id = id;
		this.sintoma = sintoma;
	}
	
	
	public Doenca() {
		super();
	}

	
	
	
}

