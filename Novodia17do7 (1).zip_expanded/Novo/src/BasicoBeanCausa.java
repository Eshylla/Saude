import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@SessionScoped

@ManagedBean

public class BasicoBeanCausa {
	private List<Causa> causas = new ArrayList();
	private Causa causa;
	
	private DAO dao = new DAO();

	public BasicoBeanCausa() {
		causa = new Causa();
	}
	
	public void addCausas() {
		causas.add(causa);
		dao.salvar(causa);
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
		dao.find(Causa.class, causa.getIdCausa());
		return causa;
	}

	public void setCausa(Causa causa) {
		this.causa = causa;
	}

}



