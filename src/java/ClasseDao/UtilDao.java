package ClasseDao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class UtilDao {
    EntityManagerFactory emf;
    EntityManager em;
    
    public void iniciarEntityManager() {
emf = Persistence.createEntityManagerFactory("SifitranPU");
        em = emf.createEntityManager();
    }
    public void iserir(Object obj){
        em.getTransaction().begin();
        em.persist(obj);
        em.getTransaction().commit();
    }
    public void atualizar(Object obj){
        em.getTransaction().begin();
        em.merge(obj);
        em.getTransaction().commit();
    }
}
