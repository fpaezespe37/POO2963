/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coop;

import ec.espe.edu.coop.view.Chicken;
import ec.espe.edu.coop.view.ClassCoop;

/**
 *
 * @author Fred
 */
public class Coop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClassCoop x= new ClassCoop(); 
        Chicken y= new Chicken();
        y.setName("Chijx");
        y.doStuff(7);
        x.add(y);
    }

   
   
}
