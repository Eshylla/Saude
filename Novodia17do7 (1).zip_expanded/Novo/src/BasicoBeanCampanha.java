
    import java.util.ArrayList;
	import java.util.List;

	import javax.faces.bean.ManagedBean;
	import javax.faces.bean.SessionScoped;


	@SessionScoped

	@ManagedBean

	public class BasicoBeanCampanha{
		private List<Campanha> campanhas = new ArrayList();
		private Campanha campanha;
		
		private DAO dao = new DAO();

		public BasicoBeanCampanha() {
			campanha = new Campanha();
		}
		
		public void addCampanhas() {
			campanhas.add(campanha);
			dao.salvar(campanha);
			campanha = new Campanha ();
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
			dao.find(Campanha.class, campanha.getIdCampanha());
			return campanha;
		}

		public void seCampanha(Campanha campanha) {
			this.campanha = campanha;
		}

	}



