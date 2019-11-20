/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ManagementSystem.model.authenticationAndSession;

import ec.edu.espe.ManagementSystem.model.keyclasesandrelationship.User;

/**
 *
 * @author ASUS
 */
public class UserSession {
    private User user;

    public UserSession(User user) {
        this.user = user;
    }

    
    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
        
    }
    
    public void clearUser(){
       
    }
    
}
