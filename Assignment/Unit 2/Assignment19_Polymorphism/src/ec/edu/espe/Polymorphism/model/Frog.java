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
public class Frog extends Anphibian{
    private boolean liveinWater;

    public Frog(boolean liveinWater, int id, String name, String gender, float weight, Cage cage) {
        super(liveinWater, id, name, gender, weight, cage);
    }

   

    @Override
    public String toString() {
        return "Frog{" + "liveinWater=" + liveinWater + '}';
    }

    /**
     * @return the liveinWater
     */
    public boolean isLiveinWater() {
        return liveinWater;
    }

    /**
     * @param liveinWater the liveinWater to set
     */
    public void setLiveinWater(boolean liveinWater) {
        this.liveinWater = liveinWater;
    }
    
}
