package EM.service;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;


import EM.Doenca;
import EM.DoencaDAO;
import br.edu.ifpb.esperanca.daw2.util.TransacionalCdi;

@ApplicationScoped
public class DoencaService implements Serializable, Service<Doenca> {

	@Inject
	private DoencaDAO doencaDAO;

	@Override
	@TransacionalCdi
	public void save(Doenca doenca) {
		doencaDAO.save(doenca);
	}

	@Override
	@TransacionalCdi
	public void update(Doenca doenca) {
		doencaDAO.update(doenca);
	}

	@Override
	@TransacionalCdi
	public void remove(Doenca doenca) {
		doencaDAO.remove(doenca);
	}

	@Override
	public Doenca getByID(long doencaId) {
		return doencaDAO.getByID(doencaId);
	}

	@Override
	public List<Doenca> getAll() {
		return doencaDAO.getAll();
	}


}
