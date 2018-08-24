package EM;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Pessoa implements Identificavel {

	@Id
	@GeneratedValue(generator="pessoa_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="pessoa_seq")
	private Long id;
	private String nome;
	private String username;
	private String password;
	private String grupo;
	
			
	public Long getId() {
		return id;
	}
	public void setId(Long idPessoa) {
		this.id = idPessoa;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
	
	
}