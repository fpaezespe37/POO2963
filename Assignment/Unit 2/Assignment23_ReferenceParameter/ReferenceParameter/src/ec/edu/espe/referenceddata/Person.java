/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.referenceddata;

/**
 *
 * @author STALIN RIVERA
 */
public class Person {

    private int Id;

    public Person(int Id, String name) {
        this.Id = Id;
        this.name = name;
    }
    private String name;

    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String personInfo;
        personInfo = "Id -->" + Id + ",name-->" + name;
        return personInfo;
    }

}
