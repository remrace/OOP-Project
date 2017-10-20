
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author QuanNguyen
 */
public abstract class User
{
    private String firstName, lastName, ID, email;
    protected ArrayList<Item> cart;
    
    public User(String firstName, String lastName, String ID, String email)
    {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setID(ID);
        this.setEmail(email);
        this.cart = new ArrayList<>();
    }
    
    public final ArrayList getCart()
    {
        return cart;
    }
    
    public final String getFirstName()
    {
        return firstName;
    }
    
    public final String getLastName()
    {
        return lastName;
    }
    
    public final String getID()
    {
        return ID;
    }
    
    public final String getEmail()
    {
        return email;
    }
    
    public final void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
    public final void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    
    public final void setID(String ID)
    {
        this.ID = ID;
    }
    
    public final void setEmail(String email)
    {
        this.email = email;
    }
    
    public void addToCart(Item item)
    {
        //find item in cart, if it's already there, increase the quantity
        //if not, add the new item into array cart
        int pos = cart.indexOf(item);
        if(pos == -1)
        {
            cart.add(item);
        }
        else
        {
            Item p = cart.get(pos);
            p.setQuantity(p.getQuantity() + item.getQuantity());
        }
    }
    
    public void removeItem(Item item, int quantity)
    {
        //find the item in the array cart and decrease quantity
        int pos = cart.indexOf(item);
        if(pos != -1)
        {
            if(cart.get(pos).getQuantity() <= quantity)
            {
                cart.remove(pos);
            }
            else
            {
                Item p = cart.get(pos);
                p.setQuantity(p.getQuantity() - quantity);
            }
        }
    }
    
    public abstract void checkOut();
    
    protected double calcSubTotal()
    {
        double sub_total = 0;
        for (Item item : cart)
        {
            sub_total += item.getQuantity() * item.getPrice();
        }
        return sub_total;
    }
    
    protected double calcTax()
    {
        return calcSubTotal()*0.0825;
    }
    
    protected double calcTotal()
    {
        return calcSubTotal() + calcTax();
    }
}
