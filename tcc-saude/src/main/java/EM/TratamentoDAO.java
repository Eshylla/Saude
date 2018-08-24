package EM;

import java.util.List;

import br.edu.ifpb.esperanca.daw2.ifoto.entities.Tratamento;

public class TratamentoDAO extends DAO< Tratamento > {
	
	public TratamentoDAO() {
		super(Tratamento.class);
	}

	public List<Tratamento> findBy(TratamentoFiltro filtro) {
		return null;
	}
	
}
