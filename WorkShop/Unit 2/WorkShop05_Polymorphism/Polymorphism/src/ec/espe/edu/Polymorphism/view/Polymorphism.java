/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.Polymorphism.view;

import ec.edu.espe.Polymorphism.model.Animal;
import ec.edu.espe.Polymorphism.model.Cage;

/**
 *
 * @author Labs-DCCO
 */
public class Polymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cage cage = new Cage(1, "wood", 1, 1);
        Animal animal = new Animal(1, "Pepito", "Male", 5, cage);
        System.out.println(animal);
        

    }

}
