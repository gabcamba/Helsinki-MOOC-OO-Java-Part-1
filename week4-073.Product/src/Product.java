/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gab Camba
 */
public class Product {
    private final String name;
    private final double price;
    private final int amount;
   
    public Product(String nameAtStart, double priceAtStart, int amountAtStart)
    {
        this.name = nameAtStart;
        this.price = priceAtStart;
        this.amount = amountAtStart;
    }
    
    public void printProduct()
    {
        System.out.println(this.name +", price " +this.price +", amount " +this.amount);
    }
    
}
