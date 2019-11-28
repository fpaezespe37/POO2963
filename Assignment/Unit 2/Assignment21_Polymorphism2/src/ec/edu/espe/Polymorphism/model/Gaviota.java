/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Polymorphism.model;

/**
 *
 * @author Fred
 */
public class Gaviota extends Bird{
    
    private boolean fly; 

    @Override
    public String toString() {
        return "Gaviota{" + "fly=" + fly + '}';
    }

    public Gaviota(int wingSize, boolean fly) {
        super(wingSize, fly);
    }

    /**
     * @return the fly
     */
    public boolean isFly() {
        return fly;
    }

    /**
     * @param fly the fly to set
     */
    public void setFly(boolean fly) {
        this.fly = fly;
    }
    
    

}
