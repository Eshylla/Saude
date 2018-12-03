package EM.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;

import EM.Doenca;
import EM.service.DoencaService;

@SessionScoped
@Named
public class DoencaBean implements Serializable {

	@Inject
	private DoencaService service;

	protected Doenca entidade;

	protected Collection<Doenca> entidades;

	@PostConstruct
	public void init() {
		entidade = new Doenca();
		entidades = service.getAll();
	}

	private List<Doenca> doencas = new ArrayList();
	private Doenca doenca;

	public DoencaBean() {
		doenca = new Doenca();
	}

	public void addDoenca() {
		doencas.add(doenca);
		service.save(doenca);
		doenca = new Doenca();
	}

	public void remove(Long id) {
		Doenca d = service.getByID(id);
		doencas.remove(doenca);
	}

	public List<Doenca> getDoencas() {
		return doencas;
	}

	public void setDoencas(List<Doenca> doencas) {
		this.doencas = doencas;
	}

	public Doenca getDoenca() {
		service.getByID(doenca.getId());
		return doenca;
	}

	public void setDoenca(Doenca doenca) {
		this.doenca = doenca;
	}

}
