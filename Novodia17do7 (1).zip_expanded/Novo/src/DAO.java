import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DAO {

	private static final EntityManagerFactory fac = Persistence.createEntityManagerFactory("dodo");
	
	public void salvar(Object objeto) {
		EntityManager manager = fac.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(objeto);
		manager.getTransaction().commit();
	}
	
	
	public void update(Object objeto) {
		EntityManager manager = fac.createEntityManager();
		manager.getTransaction().begin();
		manager.merge(objeto);
		manager.getTransaction().commit();
	}
	
	public void find(Class classe, Object objeto) {
		EntityManager manager = fac.createEntityManager();
		manager.getTransaction().begin();
		manager.find(classe, objeto);
		manager.getTransaction().commit();
	}
	
	
	
}
