package EM;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Tratamento implements Identificavel {

	@Id
	@GeneratedValue(generator="tratamento_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="tratamento_seq")
	private Long id;
	private String medicamento;
	
	@ManyToMany(mappedBy="tratamentos")
	private Set<Doenca> doencas;
	
			
	public Set<Doenca> getDoencas() {
		return doencas;
	}
	public void setDoencas(Set<Doenca> doencas) {
		this.doencas = doencas;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getMedicamento() {
		return medicamento;
	}
	public void setMedicamento(String medicamento) {
		this.medicamento = medicamento;
	}
	public Tratamento(Long id, String medicamento) {
		super();
		this.id = id;
		this.medicamento = medicamento;
	}
	
	
	public Tratamento() {
		super();
	}

	
}
