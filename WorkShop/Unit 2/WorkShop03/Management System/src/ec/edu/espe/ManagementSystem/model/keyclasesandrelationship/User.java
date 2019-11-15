/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ManagementSystem.model.keyclasesandrelationship;

import java.util.List;

/**
 *
 * @author ASUS
 */
public class User {
    
    protected List<Username> username;
    protected List<Password> password;
    protected List<FullName>fullName;
    protected List<EmailAddress4>emailAddress;
       
    
    public boolean checkPassword (String password){
        return true;
    }
            
    public void getTrustFriendsGroups(){
        
    }
}
