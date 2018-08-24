package EM;

	import java.util.Set;

	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.ManyToMany;


	@Entity
	public class Causa implements Identificavel {
		@Id
		private Long id;
		private String virus;
		private String bacteria;
		private String generico;
	
		// arrumar o mapeamento 
		@ManyToMany(mappedBy="causas")
		private Set<Doenca> doencas;
		
		@ManyToMany(mappedBy="campanhas")
		private Set<Pessoa> pessoas;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getVirus() {
			return virus;
		}

		public void setVirus(String virus) {
			this.virus = virus;
		}

		public String getBacteria() {
			return bacteria;
		}

		public void setBacteria(String bacteria) {
			this.bacteria = bacteria;
		}

		public String getGenerico() {
			return generico;
		}

		public void setGenerico(String generico) {
			this.generico = generico;
		}

		public Set<Doenca> getDoencas() {
			return doencas;
		}

		public void setDoencas(Set<Doenca> doencas) {
			this.doencas = doencas;
		}

		public Set<Pessoa> getPessoas() {
			return pessoas;
		}

		public void setPessoas(Set<Pessoa> pessoas) {
			this.pessoas = pessoas;
		}

		public Causa(Long id, String virus, String bacteria, String generico, Set<Doenca> doencas,
				Set<Pessoa> pessoas) {
			super();
			this.id = id;
			this.virus = virus;
			this.bacteria = bacteria;
			this.generico = generico;
			this.doencas = doencas;
			this.pessoas = pessoas;
		}
		
		public Causa() {
			super();
		}
}
