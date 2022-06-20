/*****************************************
* Author : Jeffory Heath
* Date : 09/06/2016
* Assignment: A02 – Scanner
******************************************/
import java.util.Scanner;

public class A02

{
     public static void main (String [] arg)
   {
   
   String Team1, Team2, Team3, Team4, Team5, Team6;
   int Score1, Score2, Score3, Score4, Score5, Score6;
   
   Scanner input = new Scanner(System.in);
   
   System.out.println("Please Enter Team Names and Scores.");
   System.out.println("Game 1");
   
   System.out.print("Team 1 Name: ");
   Team1 = input.nextLine();
   System.out.print("Team 2 Name: ");
   Team2 = input.nextLine();   
   
   System.out.print("Team 1 Score: ");
   Score1 = input.nextInt();
   System.out.print("Team 2 Score: ");
   Score2 = input.nextInt();   
   input.nextLine();
   System.out.println(" ");
  
   System.out.println("Game 2");
   System.out.print("Team 3 Name: ");
   Team3 = input.nextLine();
   System.out.print("Team 4 Name: ");
   Team4 = input.nextLine();  
     
   System.out.print("Team 3 Score: ");
   Score3 = input.nextInt();
   System.out.print("Team 4 Score: ");
   Score4 = input.nextInt();
   input.nextLine();
   System.out.println(" ");
    
   System.out.println("Game 3");
   System.out.print("Team 5 Name: ");
   Team5 = input.nextLine();
   System.out.print("Team 6 Name: ");
   Team6 = input.nextLine();
      
   System.out.print("Team 5 Score: ");
   Score5 = input.nextInt();
   System.out.print("Team 6 Score: ");
   Score6 = input.nextInt();
   System.out.println(" ");
   
   System.out.printf("Team 1          Team 2            Score%n");
   System.out.printf("%-15s %-15s %5d : %-5d%n", Team1, Team2, Score1, Score2);
   System.out.printf("%-15s %-15s %5d : %-5d%n", Team3, Team4, Score3, Score4);
   System.out.printf("%-15s %-15s %5d : %-5d%n", Team5, Team6, Score5, Score6);
    
   }
}