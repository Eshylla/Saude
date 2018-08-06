import java.util.ArrayList;
	import java.util.List;

	import javax.faces.bean.ManagedBean;
	import javax.faces.bean.SessionScoped;


	@SessionScoped

	@ManagedBean

	public class BasicoBeanTratamento {
		private List<Tratamento> tratamentos = new ArrayList();
		private Tratamento tratamento;
		
		private DAO dao = new DAO();

		public BasicoBeanTratamento() {
			tratamento = new Tratamento();
		}
		
		public void addTratamentos() {
			tratamentos.add(tratamento);
			dao.salvar(tratamento);
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
			dao.find(Tratamento.class, tratamento.getIdTratamento());
			return tratamento;
		}

		public void setTratamento(Tratamento tratamento) {
			this.tratamento = tratamento;
		}

	}





