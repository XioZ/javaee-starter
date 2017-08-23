/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entity.UserEntity;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author victor
 */
@Stateless
public class HelloSessionBean implements HelloSessionBeanLocal {
    
    @PersistenceContext
    EntityManager em;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public UserEntity getRandomUser(){
        UserEntity u = new UserEntity();
        u.setUsername("randomusername");
        u.setEmail("random@random.com");
        em.persist(u);
        return u;
    }
}
