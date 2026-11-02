// Jake Phung
// CS319
// Garden Manager Project

import java.util.Scanner;
import java.util.ArrayList;

public class gardenManager
{
   public static void main(String[] args)
   
   {
     
      System.out.println("Hello user, welcome to Garden Manager." //introduction, describes
      + "\nThis program will help you organize your gardening"    //the purpose of this
      + "\nneeds by keeping everything in one place!"             //program
      + "\n"
      + "\nYou will enter inputs according to these categories:"
      + "\n"
      + "\n1 - Tools\n2 - Plants\n3 - Expenses"
      + "\n");
      
      ArrayList<String> toolList = new ArrayList<>(); //arrays to store user lists of inputs
      ArrayList<String> plantList = new ArrayList<>();
      ArrayList<String> expenseList = new ArrayList<>();
      
      float tCost = 0; //tool
      float pCost = 0; //plant
      float totalCost;
      float cost = 0;
      int quantity = 0;
      String input;
      Scanner gM = new Scanner(System.in);
      Scanner c = new Scanner(System.in);
      Scanner q = new Scanner(System.in);
      
      System.out.print("Starting with Tools, enter a gardening tool you own. Enter 'exit' when satisfied\n"); //tool list
      while(!(input = gM.nextLine()).equalsIgnoreCase("exit")){
         toolList.add(input);
         System.out.println("How expensive is this item in USD?");
         cost = c.nextFloat();
         System.out.println("How many of this item do you own?");
         quantity = q.nextInt();
         tCost = tCost + (cost*quantity);
         System.out.println("Next item or 'exit'");
      }
      
      System.out.println("Your Tool List: " + toolList);
      System.out.println("Your Tool Expenses: $" + tCost + "\n");
      
      
      System.out.print("Now with Plants, enter a plant you own. Enter 'exit' when satisfied\n"); //plant list
      while(!(input = gM.nextLine()).equalsIgnoreCase("exit")){
         plantList.add(input);
         System.out.println("How expensive is this item in USD?");
         cost = c.nextFloat();
         System.out.println("How many of this item do you own?");
         quantity = q.nextInt();
         pCost = pCost + (cost*quantity);
         System.out.println("Next item or 'exit'");
      }
      
      System.out.println("Your Plant List: " + plantList);
      System.out.println("Your Plant Expenses: $" + pCost);
      
      totalCost = tCost + pCost;
      System.out.println("\nYour Total Expense: $" + totalCost);

   }
   
}
   