package EM;

import java.util.Date;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Doenca implements Identificavel {

	@Id
	@GeneratedValue(generator="doenca_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="doenca_seq")
	private Long id;
	private String sintoma;
	
			
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

