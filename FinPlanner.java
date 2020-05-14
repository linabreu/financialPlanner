/*
Lina Breunlin
CIS 1633 AA Java
October 3, 2019


Test Data

Inputs (interestRate and balance resp)          Outputs (year 1 and 15)      Passed?
0.01, 1000                                      $1,515.00, $9,289.90            Y
0.10  2000                                      $2,750.00, 25,829.36            Y
15 N/A                                           Error Message                  Y
fjhdgh N/A                                       Error Message                  Y
0.01, 500                                        Error Message                  Y
0.01, gjgj                                       Error Message                  Y

 */

package finplanner;
import java.util.Scanner;


public class FinPlanner {

   
    public static void main(String[] args) {
        
        
    // declare variables and constant

    double initialInvestment = 0.0;
    double interestRate =0.0;
    double balance = 0.0;
    final double ANNUAL_DEPOSIT = 500.00;
    int yearCounter;
    
    //begin program
    
    System.out.println ("Welcome to Smart Investments LCC.");
    
    System.out.println ();
    
    //have user input the expected interest rate    
      
    Scanner in = new Scanner (System.in);
    
    System.out.print("Please enter an expected interest rate between 1% and 10% in decimal form:");
    
    //Prevent user from entering bad value
    
      if (in.hasNextDouble()) 
    {
        interestRate = in.nextDouble();
               if (interestRate <0.01 || interestRate > 0.10)
                    {
                        System.out.println("Error. Interest rate must be between 0.01 and 0.10.");
                            return;
                    }    
    }
      else 
    {
        System.out.println ("Error. Interest cannot be text.");
        return;
    }
       
    // Get user input for starting investment
    
    System.out.print("Please enter your initial investment:");
    
    
    // Prevent user from entering bad value
    
   if (in.hasNextDouble()) 
    {
        balance = in.nextDouble();
            if (balance < 1000)
               {
                 System.out.println("Error. The minimum investment is $1000.");
                 return;
               }     
    }
   
    else 
    {
      System.out.println ("Error.The investment value must be a number.");
      return;
    }
    
   // Formatted output of user input with some blank lines to space things out 
   
   System.out.println ();
    
   System.out.println ();
  
   System.out.println ("Your investment information:");
    
   System.out.printf("Your starting investment is:" + "$" + "%,.2f",balance);
      
   System.out.println (); 
      
   System.out.printf("Your yearly interest rate is: %.2f%%",(interestRate * 100));
     
   System.out.println ();
       
   System.out.printf("Your annual desposit is:" + "$" + "%.2f",ANNUAL_DEPOSIT);
     
   System.out.println (); 
    
   System.out.println (); 
   
   System.out.println ();
   
   System.out.println ("Your 15 Year Investment Plan: ");
   
   System.out.println ();
   
   System.out.println ("Year" + " " + "Investment Amount");
     
     
    /*go into for loop
      -LCV yearCounter initialize to 1
      -SV is 15 because the investment is only 15 years
      -LCV is compared to SV in the statement yearCounter <= 15. As long as the year is less than 15 it will keep looping.
      -LCV is altered after each iteration of the loop, it gets one more year added. 
      It continues to count up until it reaches year 15
    */
    
  for (yearCounter = 1; yearCounter <= 15; ++yearCounter)   
    {    
     balance = (((balance + ANNUAL_DEPOSIT) * interestRate)) + (balance + ANNUAL_DEPOSIT);
     
     System.out.printf(yearCounter+ "        " + "$" + "%,.2f",balance);
     
     System.out.println ();
    }
        
    System.out.println (); //add some space for flavor
    
    System.out.println ("Thank you for investing with Smart Investments LLC.");  
            
}    
        
}

    

