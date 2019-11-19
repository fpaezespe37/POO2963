/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ManagementSystem.model.keyclasesandrelationship;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class User {
    
    private String userName;
    private String password;
    private String fullName;
    private boolean isActive;
    
    public boolean checkPassword(String password){
        boolean checkedPassword = false;
        if(this.password.equals(password)){
            checkedPassword = true;
        }
        return checkedPassword;
    }
   
}
