/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ManagementSystem.model.keyclasesandrelationship;

import ec.edu.espe.ManagementSystem.model.accounts.Property;
import ec.edu.espe.ManagementSystem.model.accounts.Reminders;
import java.util.ArrayList;
import javax.xml.stream.events.Comment;

/**
 *
 * @author ASUS
 */
public class Account {

    private String label;
    private String createdOnDate;
    private int lastModifiedOnDate;
    
    private Password[] password;
    private Username[] username;
    private Comment[] comment;
    
    private ArrayList<Reminders> reminders;
    private ArrayList<Property> property;
}
