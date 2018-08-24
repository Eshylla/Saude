package EM;

import java.util.List;

import br.edu.ifpb.esperanca.daw2.ifoto.entities.Pessoa;

public class PessoaDAO extends DAO< Pessoa > {
	
	public PessoaDAO() {
		super(Pessoa.class);
	}

	public List<Pessoa> findBy(PessoaFiltro filtro) {
		return null;
	}
	
}
