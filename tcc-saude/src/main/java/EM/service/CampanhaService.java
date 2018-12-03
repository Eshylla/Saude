package EM.service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.inject.Inject;

import EM.Campanha;
import EM.CampanhaDAO;

import br.edu.ifpb.esperanca.daw2.util.TransacionalCdi;

public class CampanhaService implements Serializable, Service<Campanha>{


	@Inject
	private CampanhaDAO campanhaDAO;

	@Override
	@TransacionalCdi
	public void save(Campanha campanha) {
		campanhaDAO.save(campanha);
	}

	@Override
	@TransacionalCdi
	public void update(Campanha campanha) {
		campanhaDAO.update(campanha);
	}

	@Override
	@TransacionalCdi
	public void remove(Campanha campanha) {
		campanhaDAO.remove(campanha);
	}

	@Override
	public Campanha getByID(long campanhaId) {
		return campanhaDAO.getByID(campanhaId);
	}

	@Override
	public List<Campanha> getAll() {
		return campanhaDAO.getAll();
	}




}
