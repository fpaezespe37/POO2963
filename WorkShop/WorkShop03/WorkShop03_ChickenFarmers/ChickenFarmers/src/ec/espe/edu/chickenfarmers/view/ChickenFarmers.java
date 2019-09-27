/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.chickenfarmers.view;

import ec.edu.espe.chickenfarmers.mode.Chicken;

/**
 *
 * @author Labs-DCCO
 */
public class ChickenFarmers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Chicken chicken = new Chicken();
        chicken.setname("Lucy");
        chicken.doStuff(0);
    }
    
}
