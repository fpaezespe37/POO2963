/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.mechanic.mode;

/**
 *
 * @author Fred
 */
public class Mechanic {
  private String name;
  private String technics;
  private int id;
  private int discount;
  private int price;
 
  public void doStuff(int forTime){
      System.out.println("My mechanic" +  "is ready for all");
      transfer();
      payment();
      credit();
      discount();
      sell();
      operator();
              
  }
  public void transfer(){
      System.out.println(getName() + "My mechanic accept transfer of all banks");
}
  private void payment(){
      System.out.println(getName() + "My mechanic accept all methods of payment");
}
  private void credit(){
      System.out.println(getName() + "My mechanic accept credit");
}
  private void discount(){
      System.out.println(getName() + "My mechanic have discounts every day");
}
  private void sell(){
      System.out.println(getName() + "My mechanic sell the best products");
}
  private void operator(){
      System.out.println(getName() + "My mechanic work with a lot of operator");
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

    /**
     * @return the technics
     */
    public String getTechnics() {
        return technics;
    }

    /**
     * @param technics the technics to set
     */
    public void setTechnics(String technics) {
        this.technics = technics;
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

    /**
     * @return the discount
     */
    public int getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(int discount) {
        this.discount = discount;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }
  
}
