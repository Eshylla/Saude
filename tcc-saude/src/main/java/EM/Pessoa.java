package EM;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Pessoa implements Identificavel {

	@Id
	@GeneratedValue(generator = "pessoa_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "pessoa_seq")
	private Long id;
	private String nome;
	private String username;
	private String email;
	private String password;
	private String grupo;

	@ManyToMany
	@JoinTable(name="causa_pessoa", 
	joinColumns= {@JoinColumn(name="id_causa")}, 
	inverseJoinColumns= {@JoinColumn(name="id_pessoa")})
	private Set<Campanha> campanhas;
	
	@ManyToMany(mappedBy="pessoas")
	private Set<Doenca> doencas;

	public Set<Campanha> getCampanhas() {
		return campanhas;
	}
	
	public void setCampanhas(Set<Campanha> campanhas) {
		this.campanhas = campanhas;
	}
	
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Pessoa(Long id, String nome, String username, String password, String grupo, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.username = username;
		this.password = password;
		this.grupo = grupo;
		this.email = email;
	}

	public Pessoa() {
		super();
	}


}