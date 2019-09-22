package service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.transferEntity;

/**
 * Session Bean implementation class transferEJB
 */
@Stateless
@LocalBean
public class transferEJB {

    @PersistenceContext
    private EntityManager em;
    
    public transferEJB() {
        // TODO Auto-generated constructor stub
    }
    
    public void AddNew(transferEntity transferEntity)
    {
    	System.out.println("=========Adding a transfer to database =============");
    	em.persist(transferEntity);
    }
    
}
