/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ManagementSystem.model.keyclasesandrelationship;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class TrustFriendsGroup{
   private String label;
    
   private ArrayList<Account> acounts;
    
    public void viewAccounts(){
        System.out.println(acounts);
    }
    
    public void setFriends(ArrayList<Account> acounts){
        this.acounts = acounts;
    }
}

