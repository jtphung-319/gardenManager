// Jake Phung
// CS319
// Garden Manager Project

import java.util.Scanner;
import java.util.ArrayList;

public class gardenTest
{

   static String userChoice(int x)
   {
   
      if(x==1){
         return "Novice";
      }else if(x==2){
         return "Amateur";
      }else if(x==3){
         return "Expert";
      }else if(x==4){
         return "Choice";
      }else{
         return "Invalid";
      }
   }
   
   static void test(int input, String expected)
   {
      String output = userChoice(input);
      if(output==expected){
         System.out.println("PASS: " + input);
      }else{
         System.out.println("FAIL: " + input);
      }
   }

   public static void main(String[] args)
   {
       test(1, "Novice"); // passes
       test(3, "Expert");
       test(5, "Invalid");
       test(2, "Amateur");
       test(0, "Invalid");
       
       System.out.println("");
         
       test(1, "Invalid"); // fails 
       test(7, "Amateur"); 
       test(2, "Expert"); 
       test(3, "Novice");
       test(1, "Novic");
   }
   
}