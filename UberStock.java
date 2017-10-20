package uberstock;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class UberStock 
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
            
        StandardUser userStand = new StandardUser(null, null, null, null, 0.0d, null);
        UClub userUClub = new UClub(null, null, null, null, 0.0d, null);

        System.out.println("Please select an option: ");
        System.out.println("1. Register as Standard User");
        System.out.println("2. Register as UClub User");
        System.out.println("3. Sign In");
        System.out.println("4. Exit ");
                    
        int choice = input.nextInt();
            
        switch(choice)
        {
            case 1:
            {
                System.out.println("Please enter your First name: ");
                userStand.setFirstName(input.next());

                System.out.println("Please enter your Last name: ");
                userStand.setLastName(input.next());

                System.out.println("Please enter your User ID: ");
                userStand.setID(input.next());
                 
                //use boolean function and ask user for another ID if it is already taken 
                
                System.out.println("Please enter your Email Address: ");
                userStand.setEmail(input.next());
                    
                System.out.println("Please enter your Middle Inital: ");
                userStand.setMiddle(input.next());
            
                break;
            }
                
            case 2:
            {
                System.out.println("Please enter your First name: ");
                userUClub.setFirstName(input.next());

                System.out.println("Please enter your Last name: ");
                userUClub.setLastName(input.next());

                System.out.println("Please enter your User ID: ");
                userUClub.setID(input.next());

                System.out.println("Please enter your Email Address: ");
                userUClub.setEmail(input.next());

                System.out.println("Please enter your Middle Inital: ");
                userUClub.setMiddle(input.next());

                break;
            }

            case 3:
            {
                System.out.println("Please enter your User ID: ");
                input.next();
                
                // call ID search and read line for Stand or UClub
                
                // item
                
                menu();
                        
                break;
            }

            case 4:
            {
                break;
            }

        }
    }
    
    public static void menu() //throws FileNotFoundException
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please select an item type: ");
        System.out.println("1. Furniture");
        System.out.println("2. Rugs");
        System.out.println("3. Decor");
        System.out.println("4. Bed & Bath ");
        System.out.println("5. Home Improvement");
        System.out.println("6. Kitchen");
        System.out.println("7. Outdoor");

        int choice = input.nextInt();

        switch(choice)
        {
            case 1:
            {
                // The name of the file to open.
                String fileName = "src/UberStock/furniture.txt";

                // This will reference one line at a time
                String line = null;

                try 
                {
                    // FileReader reads text files in the default encoding.
                    FileReader fileReader = 
                        new FileReader(fileName);

                    // Always wrap FileReader in BufferedReader.
                    BufferedReader bufferedReader = 
                        new BufferedReader(fileReader);

                    while((line = bufferedReader.readLine()) != null) {
                        System.out.println(line);
                    }   

                    // Always close files.
                    bufferedReader.close();         
                }
                catch(FileNotFoundException ex) 
                {
                    System.out.println(
                        "Unable to open file '" + 
                        fileName + "'");                
                }
                catch(IOException ex) 
                {
                    System.out.println(
                        "Error reading file '" 
                        + fileName + "'");                  
                    // Or we could just do this: 
                    // ex.printStackTrace();
                }
                
                /*try
                {
                   File fileName=new File("furniture.txt");
                   System.out.println(fileName.exists());
                   Scanner scan=new Scanner(fileName);
                }
                catch(FileNotFoundException ex) 
                {
                    System.out.println(
                        "Unable to open file '" + 
                        fileName + "'");                
                }*/

                break;
            }

            case 2:
            {
                break;
            }

            case 3:
            {
                break;
            }

            case 4:
            {
                break;
            }

            case 5:
            {
                break;
            }

            case 6:
            {
                break;
            }

            case 7:
            {
                break;
            }
        }
    }
}


/*boolean IDsearch(String ID)
{
    boolean ID_found= false;

    //open txt file
    //while not end of file
    while(ID_found == false)
    {
        //reading through each line to compare ID with input

        //if(ID == (file variable))
           {
                ID_found = true;
                //close file
           }
        //close file
        //break;
    }
}*/

/*
public void menu()
{
    System.out.println("Please select an item type: ");
    System.out.println("1. Furniture");
    System.out.println("2. Rugs");
    System.out.println("3. Decor");
    System.out.println("4. Bed & Bath ");
    System.out.println("5. Home Improvement");
    System.out.println("6. Kitchen");
    System.out.println("7. Outdoor");
                    
    int choice = input.nextInt();

    switch(choice)
    {
        case 1:
        {
            break;
        }
        
        case 2:
        {
            break;
        }

        case 3:
        {
            break;
        }

        case 4:
        {
            break;
        }

        case 5:
        {
            break;
        }

        case 6:
        {
            break;
        }

        case 7:
        {
            break;
        }
    }
}*/