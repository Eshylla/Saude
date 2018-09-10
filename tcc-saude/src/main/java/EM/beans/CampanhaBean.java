	package EM.beans;

	import java.io.Serializable;
	import java.util.ArrayList;
	import java.util.Collection;
	import java.util.List;

	import javax.annotation.PostConstruct;
	import javax.faces.bean.ManagedBean;
	import javax.faces.bean.SessionScoped;
	import javax.inject.Inject;

import EM.Campanha;
import EM.DAO;
import EM.service.CampanhaService;
import EM.service.CausaService;

	@SessionScoped

	@ManagedBean

	public class CampanhaBean implements Serializable {

		@Inject
		private CampanhaService service;

		protected Campanha entidade;

		protected Collection<Campanha> entidades;

		@PostConstruct
		public void init() {
			entidade = new Campanha();
			entidades = service.getAll();
		}

		private List<Campanha> campanhas = new ArrayList();
		private Campanha campanha;

		public CampanhaBean() {
			campanha = new Campanha();
		}

		public void addCampanha() {
			campanhas.add(campanha);
			service.save(campanha);
			campanha = new Campanha();
		}

		public void removeCampanhas() {
			campanhas.remove(campanha);
		}

		public List<Campanha> getCampanhas() {
			return campanhas;
		}

		public void setCampanhas(List<Campanha> campanhas) {
			this.campanhas = campanhas;
		}

		public Campanha getCampanha() {
			service.getByID(campanha.getId());
			return campanha;
		}

		public void setCampanha(Campanha campanha) {
			this.campanha = campanha;
		}

	}
