
// Kayleen Mercer  Assignment 3B
// CS 121 Spring 2017
// 02/24/2017
// The purpose of the assignment is to create an MPG calculator

package assignment3b;

import java.util.Scanner;

public class Assignment3B 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in); // input scanner
        
        // initialization phase
        
        double MPG = 0; // initialize MPG
        int tripCounter = 0; // initialize number of trips
        double total = 0; // initialize total
        double average; // initialize average
        int miles = 0; // initialize miles
        int gallons = 0; // initalize gallons
        
        // processing phase
      
        // prompt for input and read trip miles and gallons from user
     
        
        while (miles != -1 & gallons != -1) // loop until user indicates done
       {
           
         System.out.println("Enter miles for trip or -1 to quit: "); // prompt
         miles = input.nextInt(); // input miles
        
         System.out.println("Enter gallons for trip or -1 to quit: "); // prompt
         gallons = input.nextInt(); // input gallons
            
         if (miles < -1) // comparison 
         System.out.println("You have entered a negative number, please try again"); 
          // prompt
         
         else if (gallons < -1) // comparison
         System.out.println("You have entered a negative number, please try again"); 
          // prompt
         
         MPG = miles/gallons; // divded miles by gallons to get MPG
           
         tripCounter = tripCounter + 1;
         
         if (MPG == 1) // if -1 and -1 are selected to quit
         {

            MPG = MPG - 1; // subtract by 1
            
            tripCounter = tripCounter - 1; // decrease counter by 1
            
         }
        
         else if (MPG <= -1) // if number is negative
         {
             MPG = 0; // set MPG to 0
     
             tripCounter = tripCounter - 1; // decrease counter by 1
         
         }   
         
         total = total + MPG; // add total to MPG to get grand total
        
         System.out.printf("MPG for this trip is: %.2f%n", MPG); // prompt
         

         
        }
        
            {
            
           average = total/tripCounter; 
           // divide total by how many trips
          
           System.out.printf("Average MPG is %.2f", average);
           // display total MPG
           
            }


    } // end main method
    
} // end class comparison