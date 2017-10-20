
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
public class UClub extends User
{
    private double reward;
    
    public UClub(String firstName, String lastName, String ID, String email, double reward)
    {
        super(firstName, lastName, ID, email);
        this.reward = reward;
    }
    
    public UClub(String firstName, String lastName, String ID, String email)
    {
        super(firstName, lastName, ID, email);
        this.cart = new ArrayList<>();
        reward = 0.0;
    }
    
    public double getReward()
    {
        return reward;
    }
    
    public void viewCart()
    {
        if(cart.isEmpty())
            System.out.println("Your cart is empty!");
        else
        {
            System.out.println("Your cart:");
            for (Item item : cart)
            {
                System.out.printf("%2d x %-25s\n", item.getQuantity(), item.getName());
            }
        }
    }

    @Override
    public void checkOut()
    {
        //output as a ticket
        //make change to the cart
        //calculate tax - reward - add to balance
        System.out.println("-------------------------------------------------");
        System.out.println("Items:");
        for (Item item : cart)
        {
            System.out.printf("%2d x %-25s$%.2f\n", item.getQuantity(), item.getName(), item.getPrice());
        }
        System.out.println("-------------------------------------------------");
        System.out.printf("%-30s$%.2f\n", "Sub Total:", calcSubTotal());
        System.out.printf("%-30s$%.2f\n", "Tax (8.25%):", calcTax());
        System.out.printf("%-30s$%.2f\n", "TOTAL:", calcTotal());
        System.out.printf("%-30s$%.2f\n", "UClub Rewards:", calcReward());
        System.out.println("-------------------------------------------------");
    }
    
    public void addToReward(double amount)
    {
        reward = reward + amount;
    }
    
    private double calcReward()
    {
        return calcSubTotal()*0.05;
    }
}
