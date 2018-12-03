package EM.service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.inject.Inject;

import EM.Causa;
import EM.CausaDAO;
import br.edu.ifpb.esperanca.daw2.util.TransacionalCdi;

public class CausaService implements Serializable, Service<Causa> {

	@Inject
	private CausaDAO causaDAO;

	@Override
	@TransacionalCdi
	public void save(Causa causa) {
		causaDAO.save(causa);
	}

	@Override
	@TransacionalCdi
	public void update(Causa causa) {
		causaDAO.update(causa);
	}

	@Override
	@TransacionalCdi
	public void remove(Causa causa) {
		causaDAO.remove(causa);
	}

	@Override
	public Causa getByID(long causaId) {
		return causaDAO.getByID(causaId);
	}

	@Override
	public List<Causa> getAll() {
		return causaDAO.getAll();
	}


}
