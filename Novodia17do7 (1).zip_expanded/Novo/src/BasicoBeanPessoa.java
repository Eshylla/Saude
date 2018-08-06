
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class BasicoBeanPessoa {
	private List<Pessoa> pessoas = new ArrayList();
	private Pessoa pessoa;
	
	private DAO dao = new DAO();
	
	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

	public Pessoa getPessoa() {
		dao.find(Pessoa.class, pessoa.getIdPessoa());
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public BasicoBeanPessoa () {
		pessoa = new Pessoa();
	}
	
	public void addPessoa() {
		pessoas.add(pessoa);
		dao.salvar(pessoa);
		pessoa = new Pessoa();
	}
	
	public void removePessoa() {
		pessoas.remove(pessoa);
	}
	
	
}



