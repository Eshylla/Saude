package EM.service;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import EM.Tratamento;
import EM.TratamentoDAO;
import br.edu.ifpb.esperanca.daw2.util.TransacionalCdi;

@ApplicationScoped
public class TratamentoService implements Serializable, Service<Tratamento> {

	@Inject
	private TratamentoDAO tratamentoDAO;

	@Override
	@TransacionalCdi
	public void save(Tratamento tratamento) {
		tratamentoDAO.save(tratamento);
	}

	@Override
	@TransacionalCdi
	public void update(Tratamento tratamento) {
		tratamentoDAO.update(tratamento);
	}

	@Override
	@TransacionalCdi
	public void remove(Tratamento tratamento) {
		tratamentoDAO.remove(tratamento);
	}

	@Override
	public Tratamento getByID(long tratamentoId) {
		return tratamentoDAO.getByID(tratamentoId);
	}

	@Override
	public List<Tratamento> getAll() {
		return tratamentoDAO.getAll();
	}

}
