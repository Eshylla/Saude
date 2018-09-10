package EM.beans;

	import java.io.Serializable;
	import java.util.ArrayList;
	import java.util.Collection;
	import java.util.List;

	import javax.annotation.PostConstruct;
	import javax.faces.bean.ManagedBean;
	import javax.faces.bean.SessionScoped;
	import javax.inject.Inject;

import EM.Causa;
import EM.DAO;
import EM.service.CausaService;



	@SessionScoped

	@ManagedBean

	public class CausaBean implements Serializable {

		@Inject
		private CausaService service;

		protected Causa entidade;

		protected Collection<Causa> entidades;

		@PostConstruct
		public void init() {
			entidade = new Causa();
			entidades = service.getAll();
		}

		private List<Causa> causas = new ArrayList();
		private Causa causa;

		public CausaBean() {
			causa = new Causa();
		}

		public void addCausa() {
			causas.add(causa);
			service.save(causa);
			causa = new Causa();
		}

		public void removeCausas() {
			causas.remove(causa);
		}

		public List<Causa> getCausas() {
			return causas;
		}

		public void setCausas(List<Causa> causas) {
			this.causas = causas;
		}

		public Causa getCausa() {
			service.getByID(causa.getId());
			return causa;
		}

		public void setCausa(Causa causa) {
			this.causa = causa;
		}

	}



