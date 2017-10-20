
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
public class Standard extends User
{
    private double balance;
    private ArrayList<Item> cart;
    
    public Standard(String firstName, String lastName, String ID, String email, double balance)
    {
        super(firstName, lastName, ID, email);
        this.balance = balance;
    }
    
    public Standard(String firstName, String lastName, String ID, String email)
    {
        super(firstName, lastName, ID, email);
        balance = 0.0;
    }
    
    public double getBalance()
    {
        return balance;
    }
    
    public void addToBalance(double amount)
    {
        balance = balance + amount;
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
        System.out.println("-------------------------------------------------");
    }
}
