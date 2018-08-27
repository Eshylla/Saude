package EM;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Campanha implements Identificavel {
	@Id
	private Long id;
	private String tipoCampanha;
	
	@ManyToOne
	@JoinColumn(name="id_doenca")
	private Doenca doencas;
	
	@ManyToMany
    @JoinTable(name="pessoa_campanha", joinColumns=
    {@JoinColumn(name="pessoa_id")}, inverseJoinColumns=
      {@JoinColumn(name="campanha_id")})
	private Set<Pessoa> pessoas;
	
	
	public Doenca getDoencas() {
		return doencas;
	}
	public void setDoencas(Doenca doencas) {
		this.doencas = doencas;
	}
	public Set<Pessoa> getPessoas() {
		return pessoas;
	}
	public void setPessoas(Set<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTipoCampanha() {
		return tipoCampanha;
	}
	public void setTipoCampanha(String tipoCampanha) {
		this.tipoCampanha = tipoCampanha;
	}
	
	public Campanha(Long id, String tipoCampanha) {
		super();
		this.id = id;
		this.tipoCampanha = tipoCampanha;
	}
	public Campanha() {
		super();
	}

}
