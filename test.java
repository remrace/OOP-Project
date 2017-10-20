/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author QuanNguyen
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Item item1 = new Item("Rug", 10.00, 2);
        Item item2 = new Item("Robot", 10.55, 10);
        Item item3 = new Item("Rug", 23.95, 1);
        UClub user1 = new UClub("Quan", "Nguyen", "qnguyen5", "RR@gmail.com", 0);
        
        user1.addToCart(item1);
        user1.addToCart(item1);
        user1.removeItem(item1, 3);
        user1.addToCart(item2);
        user1.viewCart();
        user1.checkOut();
        
        
        
        
    }
    
}
