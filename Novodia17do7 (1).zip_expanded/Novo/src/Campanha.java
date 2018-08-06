import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Campanha {
	@Id
	private Integer idCampanha;
	private String tipoCampanha;
	
	@ManyToMany(mappedBy="campanhas")
	private Set<Doenca> doencas;
	
	@ManyToMany(mappedBy="campanhas")
	private Set<Pessoa> pessoas;
	
	public Integer getIdCampanha() {
		return idCampanha;
	}
	public void setIdCampanha(Integer idCampanha) {
		this.idCampanha = idCampanha;
	}
	public String getTipoCampanha() {
		return tipoCampanha;
	}
	public void setTipoCampanha(String tipoCampanha) {
		this.tipoCampanha = tipoCampanha;
	}
	
	public Campanha(Integer idCampanha, String tipoCampanha) {
		super();
		this.idCampanha = idCampanha;
		this.tipoCampanha = tipoCampanha;
	}
	public Campanha() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void add(int idCampanha) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
