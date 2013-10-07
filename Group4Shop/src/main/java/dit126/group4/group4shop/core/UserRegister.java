package dit126.group4.group4shop.core;

import dit126.group4.group4shop.utils.AbstractDAO;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author Group4
 */
public class UserRegister extends AbstractDAO<Users, Long> implements IUserRegister {
    
    public UserRegister(String puName){
        super(Users.class, puName);
    }
    
    @Override
    public void remove(String id) {
        EntityManager em = emf.createEntityManager();
        try{
            EntityTransaction t = em.getTransaction();
            try{
                t.begin();
                Users user = find(id);
                if(user != null){
                    Users toBeRemoved = em.merge(user);
                    em.remove(toBeRemoved);
                    t.commit();
                }
            }finally{
                if(t.isActive())
                    t.rollback();
            }
        }finally{
            em.close();
        }
    }
    
    @Override
    public Users find(String id) {
        EntityManager em = emf.createEntityManager();
        Users user = em.find(clazz, id);
        return user;
    }
}
