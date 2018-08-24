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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	public Pessoa(Long id, String nome, String username, String password, String grupo) {
		super();
		this.id = id;
		this.nome = nome;
		this.username = username;
		this.password = password;
		this.grupo = grupo;
	}
	public Pessoa() {
		super();
	}	
	
}