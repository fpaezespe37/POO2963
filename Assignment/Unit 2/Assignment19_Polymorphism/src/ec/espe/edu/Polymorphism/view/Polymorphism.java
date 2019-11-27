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
        System.out.println("\n---MAMAL---");
        Cage cage = new Cage(1, "hierro", 1, 1);
        Animal animal = new Animal(1, "Pepito", "Male", 5, cage);
        System.out.println(animal);
        Animal anima2 = new Animal(2, "Oscar", "Female", 8, cage);
        System.out.println(anima2);

        System.out.println("\n---ANPHIBIAN---");
        Cage cage2 = new Cage(2, "lagos", 2, 1);
        Animal anima3 = new Animal(3, "nemo", "masculino", 2, cage2);
        System.out.println(anima3);
        Animal anima4 = new Animal(4, "rose", "hembra", 2, cage2);
        System.out.println(anima4);
        
        System.out.println("\n---FISH---");
        Cage cage3 = new Cage(3, "river", 2, 1);
        Animal anima5 = new Animal(3, "Pepe", "masculino", 2, cage3);
        System.out.println(anima5);
        Animal anima6 = new Animal(4, "Maria", "hembra", 2, cage3);
        System.out.println(anima6);
        
        System.out.println("\n---REPTIL---");
        Cage cage4 = new Cage(4, "grass",1, 4);
        Animal animal7 = new Animal(4, "Farns", "Male", 4, cage4);
        System.out.println(animal7);
        Animal animal8 = new Animal(4, "Marty", "Female", 4, cage4);
        System.out.println(animal8);
        
        System.out.println("\n---BIRD---");
        Cage cage5 = new Cage(5,"plate",3,1);
        
        Animal animal9 = new Animal(5, "Squirtle", "Male", 5, cage5);
        System.out.println(animal9);
        
        Animal animal10 = new Animal(6, "Ziba", "Female", 4, cage5);
        System.out.println(animal10);

    }

}
