package EM;

import java.util.List;

import br.edu.ifpb.esperanca.daw2.ifoto.entities.Causa;

public class CausaDAO extends DAO< Causa > {
	
	public CausaDAO() {
		super(Causa.class);
	}

	public List<Causa> findBy(CausaFiltro filtro) {
		return null;
	}
	
}
