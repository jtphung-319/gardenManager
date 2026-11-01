// Jake Phung
// CS319
// Garden Manager Project

import java.util.Scanner;

public class gardenManager
{
   public static void main(String[] args)
   
   {
      
      int userChoice;
      Scanner gM = new Scanner(System.in);
   
      System.out.println("Hello user, welcome to Garden Manager."
      + "\nThis program wll help you organize your gardening"
      + "\nneeds by keeping everything in one place!"
      + "\n"
      + "\nPlease type the number based on your desired category:"
      + "\n"
      + "\n1 - Tools\n2 - Plants\n3 - Expenses"
      + "\n");
      
      userChoice = gM.nextInt();
      
      switch(userChoice)
      {
      case 1:
         System.out.println("You chose Tools. What tools do you want to record?");
         break;
      case 2:
         System.out.println("You chose Plants. What plants do you want to record?");
         break;
      case 3:
         System.out.println("You chose Expenses. What expenses do you want to record?");
         break;
      default:
         System.out.println("Sorry, that was an invalid choice. Please try again");
      }
      
      System.out.println("Please enter each item one at a time. Type 'exit' when you are done adding to the list\n");
      
   
   }
   
}
   