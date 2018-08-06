import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Pessoa {
	@Id
	private Integer idPessoa;
	private String nome;
	
	@ManyToMany(mappedBy="pessoas")
	private Set<Doenca> doencas;
	
	@ManyToMany
	@JoinTable(name="pessoa_campanha",
			joinColumns={@JoinColumn(name="id_pessoa")},
			inverseJoinColumns= {@JoinColumn (name= "id_campanha")})
	private Set<Campanha> campanhas;
	
	public Integer getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Pessoa(Integer idPessoa, String nome) {
		super();
		this.idPessoa = idPessoa;
		this.nome = nome;
	}
	
	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void add(int idPessoa) {
		// TODO Auto-generated method stub
		
	}
	

}
