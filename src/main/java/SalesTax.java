
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Braden
 */
public class SalesTax 
{   public static void main(String[] args)
    {
      final double STATE_RATE = 0.04; 
      final double COUNTY_RATE = 0.02; 
      double purchase;         
      double stateTax;         
      double countyTax;        
      double totalTax;        
      double totalCost;        
      
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter the purchase amount:\t ");
      purchase = keyboard.nextDouble();
      
      stateTax = purchase * STATE_RATE;
      countyTax = purchase * COUNTY_RATE;
      totalTax = stateTax + countyTax;
      totalCost = purchase + totalTax;

      System.out.println("Purchase amount:\t $" + purchase);
      System.out.println("State tax:\t $" + stateTax);
      System.out.println("County tax:\t $" + countyTax);
      System.out.println("Total tax:\t $" + totalTax);
      System.out.println("Total cost:\t $" + totalCost);    
    }       
}
