import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Causa {
	@Id
	private Integer idCausa;
	private String virus;
	private String bacteria;
	private String generico;

	@ManyToMany(mappedBy="causas")
	private Set<Doenca> doencas;
	
	public Integer getIdCausa() {
		return idCausa;
	}
	public void setIdCausa(Integer idCausa) {
		this.idCausa = idCausa;
	}
	public String getVirus() {
		return virus;
	}
	public void setVirus(String virus) {
		this.virus = virus;
	}
	public String getBacteria() {
		return bacteria;
	}
	public void setBacteria(String bacteria) {
		this.bacteria = bacteria;
	}
	public String getGenerico() {
		return generico;
	}
	public void setGenerico(String generico) {
		this.generico = generico;
		
	}
	public Causa(Integer idCausa, String virus, String bacteria, String generico) {
		super();
		this.idCausa = idCausa;
		this.virus = virus;
		this.bacteria = bacteria;
		this.generico = generico;
	}
	
	public Causa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void add(int idCausa) {
		// TODO Auto-generated method stub
		
	}

}
