/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chickenfarm;

import ec.espe.edu.chickenfarm.view.Chicken;
import ec.espe.edu.chickenfarm.view.ClassCoop;


/**
 *
 * @author Fred
 */
public class ChickenFarm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       ChickenFarm x= new ChickenFarm();
       ClassCoop y= new ClassCoop();
       Chicken z= new Chicken();
       z.setName("Oscar");
       z.doStuff(7);
       y.setId(2564);
       
        
    }
    
}
