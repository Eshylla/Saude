package EM;

import java.util.Date;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Tratamento implements Identificavel {

	@Id
	@GeneratedValue(generator="tratamento_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="tratamento_seq")
	private Long id;
	private String medicamento;
	
			
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
	
	
	
	
	
	
}
