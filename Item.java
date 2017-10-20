
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author QuanNguyen
 */
public class Item
{
    private final String name;
    private final double price;
    private int quantity;
    
    public Item(String name, double price, int quantity)
    {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    public String getName()
    {
        return name;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public int getQuantity()
    {
        return quantity;
    }
    
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    
    @Override
    public boolean equals(Object o)
    {
 
        // If the object is compared with itself then return true  
        if (o == this) {
            return true;
        }
 
        /* Check if o is an instance of Item or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof Item)) {
            return false;
        }
         
        // typecast o to Complex so that we can compare data members 
        Item c = (Item) o;
         
        // Compare the data members and return accordingly 
        return this.name.equals(c.getName());
    }
}
