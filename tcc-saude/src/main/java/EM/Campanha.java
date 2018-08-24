package EM;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Campanha implements Identificavel {
	@Id
	private Long id;
	private String tipoCampanha;
	
	@ManyToMany(mappedBy="campanhas")
	private Set<Doenca> doencas;
	
	@ManyToMany(mappedBy="campanhas")
	private Set<Pessoa> pessoas;
	
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
