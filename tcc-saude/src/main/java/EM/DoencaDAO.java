package EM;

import java.util.List;

import br.edu.ifpb.esperanca.daw2.ifoto.entities.Doenca;

public class DoencaDAO extends DAO< Doenca > {
	
	public DoencaDAO() {
		super(Doenca.class);
	}

	public List<Doenca> findBy(DoencaFiltro filtro) {
		return null;
	}
	
}
