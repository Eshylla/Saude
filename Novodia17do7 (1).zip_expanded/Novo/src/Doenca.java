import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Doenca {
	
	@Id
	private Integer idDoenca;
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
	@JoinTable(name="doenca_campanha",
			joinColumns={@JoinColumn(name="id_doenca")},
			inverseJoinColumns= {@JoinColumn (name= "id_campanha")})
	private Set<Campanha> campanhas;
	
	public Integer getIdDoenca() {
		return idDoenca;
	}
	public void setIdDoenca(Integer idDoenca) {
		this.idDoenca = idDoenca;
	}
	public String getSintoma() {
		return sintoma;
	}
	public void setSintoma(String sintoma) {
		this.sintoma = sintoma;
	}
	
	public Doenca(Integer idDoenca, String sintoma) {
		super();
		this.idDoenca = idDoenca;
		this.sintoma = sintoma;
	}
	
	public Doenca() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void add(int idDoenca) {
		// TODO Auto-generated method stub
		
	}

}

	
