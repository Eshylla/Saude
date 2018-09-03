package EM.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import EM.DAO;
import EM.Tratamento;
import EM.TratamentoDAO;
import EM.service.TratamentoService;

@SessionScoped

@ManagedBean

public class TratamentoBean implements Serializable {

	@Inject
	private TratamentoService service;

	protected Tratamento entidade;

	protected Collection<Tratamento> entidades;

	@PostConstruct
	public void init() {
		entidade = new Tratamento();
		entidades = service.getAll();
	}

	private List<Tratamento> tratamentos = new ArrayList();
	private Tratamento tratamento;

	public TratamentoBean() {
		tratamento = new Tratamento();
	}

	public void addTratamentos() {
		tratamentos.add(tratamento);
		service.save(tratamento);
		tratamento = new Tratamento();
	}

	public void removeTratamentos() {
		tratamentos.remove(tratamento);
	}

	public List<Tratamento> getTratamentos() {
		return tratamentos;
	}

	public void setTratamentos(List<Tratamento> tratamentos) {
		this.tratamentos = tratamentos;
	}

	public Tratamento getTratamento() {
		service.getByID(tratamento.getId());
		return tratamento;
	}

	public void setTratamento(Tratamento tratamento) {
		this.tratamento = tratamento;
	}

}
