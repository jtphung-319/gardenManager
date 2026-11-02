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
      
      int userInput;
      float tCost = 0; //tool
      float pCost = 0; //plant
      float totalCost;
      float cost = 0;
      float budget = 0;
      int quantity = 0;
      String input;
      Scanner gM = new Scanner(System.in);
      Scanner c = new Scanner(System.in);
      Scanner q = new Scanner(System.in);
      
      System.out.print("Starting with Tools, enter a gardening tool you own or wish to own. Enter 'exit' when satisfied\n"); //tool list
      while(!(input = gM.nextLine()).equalsIgnoreCase("exit")){
         toolList.add(input);
         System.out.println("How expensive is this item in USD?");
         cost = c.nextFloat();
         System.out.println("How many of this item do you own or want?");
         quantity = q.nextInt();
         tCost = tCost + (cost*quantity);
         System.out.println("Next item or 'exit'");
      }
      
      System.out.println("Your Tool List: " + toolList);
      System.out.println("Your Tool Expenses: $" + tCost + "\n");
      
      
      System.out.print("Now with Plants, enter a plant you own or wish to own. Enter 'exit' when satisfied\n"); //plant list
      while(!(input = gM.nextLine()).equalsIgnoreCase("exit")){
         plantList.add(input);
         System.out.println("How expensive is this item in USD?");
         cost = c.nextFloat();
         System.out.println("How many of this item do you own or want?");
         quantity = q.nextInt();
         pCost = pCost + (cost*quantity);
         System.out.println("Next item or 'exit'");
      }
      
      System.out.println("Your Plant List: " + plantList);
      System.out.println("Your Plant Expenses: $" + pCost);
      
      totalCost = tCost + pCost;
      
      System.out.println("\nAre ALL these 1-items you own, or 2-wish to own? Type 1 or 2 to proceed");
      userInput = gM.nextInt();
      
      switch(userInput)
      {
      case 1:
         System.out.println("\nGreat! Here is a rundown of your submissions:"
         + "\nTools you own: " + toolList
         + "\nTools Expenses: $" + tCost
         + "\nPlants you own: " + plantList
         + "\nPlants Expenses: $" + pCost
         + "\nTotal Cost: $" + totalCost);
         break;
      case 2:
         System.out.println("If you wish to own these items, what is your budget in USD?");
         budget = gM.nextFloat();
      
         System.out.println("\nGreat! Here is a rundown of your submissions:"
         + "\nTools you want: " + toolList
         + "\nTools Expenses: $" + tCost
         + "\nPlants you want: " + plantList
         + "\nPlants Expenses: $" + pCost
         + "\nTotal Cost: $" + totalCost
         + "\nBudget: $" + budget);
         break;
      default:
         System.out.println("\nInvalid submission, try again");
      }

   }
   
}
   