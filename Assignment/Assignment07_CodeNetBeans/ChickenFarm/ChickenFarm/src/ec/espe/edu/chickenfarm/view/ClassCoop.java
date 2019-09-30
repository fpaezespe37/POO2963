/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.chickenfarm.view;

/**
 *
 * @author Fred
 */
public class ClassCoop {
    private int id;
   private Chicken[] chickens;
        
   public void doStuff(int forTime){
        System.out.println("My chicken" +  "is doing things");
        
        }
    public void add(Chicken chicken){
        chicken.drink();
    }
    public void remove (int ChickenId ){
        ;
    }
    public void resetIteration(){
        ;
    }
    public void next (){
        ;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

 
    }
    
