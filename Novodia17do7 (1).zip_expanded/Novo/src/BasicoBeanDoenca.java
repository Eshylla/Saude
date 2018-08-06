	import java.util.ArrayList;
	import java.util.List;

	import javax.faces.bean.ManagedBean;
	import javax.faces.bean.SessionScoped;


	@SessionScoped

	@ManagedBean

	public class BasicoBeanDoenca {
		private List<Doenca> doencas = new ArrayList();
		private Doenca doenca;

		private DAO dao = new DAO();
		
		public BasicoBeanDoenca() {
			doenca = new Doenca();
		}
		
		public void addDoencas() {
			doencas.add(doenca);
			dao.salvar(doenca);
			doenca = new Doenca();
		}
		
		public void removeDoencas() {
			doencas.remove(doenca);
		}

		public List<Doenca> getDoencas() {
			return doencas;
		}

		public void setDoencas(List<Doenca> doencas) {
			this.doencas = doencas;
		}

		public Doenca getDoenca() {
			dao.find(Doenca.class, doenca.getIdDoenca());
			return doenca;
		}

		public void setDoenca(Doenca doenca) {
			this.doenca = doenca;
		}

	}





