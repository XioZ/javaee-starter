/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entity.UserEntity;
import javax.ejb.Local;

/**
 *
 * @author victor
 */
@Local
public interface HelloSessionBeanLocal {

    public UserEntity getRandomUser();
    
}
