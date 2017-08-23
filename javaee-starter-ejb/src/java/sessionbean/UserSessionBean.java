package sessionbean;

import entity.UserEntity;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author victor
 */
@Stateless
public class UserSessionBean implements UserSessionBeanLocal {
    
    @PersistenceContext
    EntityManager em;

    public UserEntity getRandomUser(){
        UserEntity u = new UserEntity();
        u.setUsername("randomusername");
        u.setEmail("random@random.com");
        em.persist(u);
        return u;
    }
    
    @Override
    public UserEntity getUserByUsername(String username) throws Exception{
        UserEntity result;
        result = (UserEntity) em.createNamedQuery("UserEntity.findByUsername")
                .setParameter("username", username)
                .setMaxResults(1)
                .getResultList()
                .get(0);
        return result;
    }
    
    @Override
    public List<UserEntity> getAllUser() throws Exception{
        List<UserEntity> result;
        result = em.createNamedQuery("UserEntity.findAll").getResultList();
        return result;
    }
    
    @Override
    public void createUser(String username, String email) throws Exception{
        UserEntity u = new UserEntity(username, email);
        em.persist(u);
        em.flush();
    }
    
    @Override
    public void deleteUserByUsername(String username) throws Exception{
        UserEntity u = getUserByUsername(username);
        em.remove(u);
        em.flush();
    }
}
