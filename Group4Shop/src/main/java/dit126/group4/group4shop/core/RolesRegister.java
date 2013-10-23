package dit126.group4.group4shop.core;

import dit126.group4.group4shop.utils.AbstractDAO;
import dit126.group4.group4shop.utils.IDAO;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Group4
 * 
 * Class for accessing the roles. Also possible to add new user roles
 * 
 */
public class RolesRegister extends AbstractDAO<Roles, String> implements IDAO<Roles, String>{
//    private EntityManagerFactory emf;
//    private final Class<Roles> clazz;
    
    public RolesRegister(String puName){
//        this.emf = Persistence.createEntityManagerFactory(puName);
//        this.clazz = Roles.class;
        super(Roles.class, puName);
    }
//    
//    @Override
//    public void add(Roles roles) {
//         EntityManager em = this.emf.createEntityManager();
//        try{
//            em.getTransaction().begin();
//            em.persist(roles);
//            em.getTransaction().commit();
//        }finally{
//            em.close();
//        }
//    }
//    
//    @Override
//    public Roles get(String role){
//        EntityManager em = emf.createEntityManager();
//        Roles fetchedRole;
//        fetchedRole = (Roles)em.createQuery("SELECT r FROM Roles r WHERE r.rolename='" + role + "'").getSingleResult();
//        return fetchedRole;
//    }
}
