import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tratamento {
	@Id
	private Integer idTratamento;
	private String medicamento;
	
	@ManyToMany(mappedBy="tratamentos")
	private Set<Doenca> doencas;
	
	public Integer getIdTratamento() {
		return idTratamento;
	}
	public void setIdTratamento(Integer idTratamento) {
		this.idTratamento = idTratamento;
	}
	public String getMedicamento() {
		return medicamento;
	}
	public void setMedicamento(String medicamento) {
		this.medicamento = medicamento;
	}
	
	public Tratamento(Integer idTratamento, String medicamento) {
		super();
		this.idTratamento = idTratamento;
		this.medicamento = medicamento;
	}
	
	public Tratamento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void add(int idTratamento) {
		// TODO Auto-generated method stub
		
	}
	
	
}
