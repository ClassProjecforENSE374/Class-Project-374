/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ense374project;

/**
 *
 * @author ahmed35m
 */
import java.util.*;

public class displayer
{
    Scanner reader = new Scanner(System.in);
    private String sym;
    private String disclaimerText;
    private int input;
    private char agreement;
    private boolean haveResults;
    

public static void main(String [ ] args)
{
 displayer Displ = new displayer();
 Displ.printScreen();
 //Displ.printDisclaimer();
 Displ.printMenu();
 
 //Displ.clearScreen();
}
    displayer()
{
    agreement ='N';
   Scanner reader = new Scanner(System.in);  // Reading from System.in
    sym="=";
    disclaimerText ="Welcome to PharmSearch. "                  //disclaimer class member inherits
            + "This application is under construction."+
            "\n"+"The developers don't take any responsibility of any adverse"+
            "\n"+"effects caused by usage of the medicines recommended by the application."
            + "\n"+"Please see a physician if conditions worsen."+"\n"
            +"DO YOU AGREE?[Y/N]";
} 
        public void setInput()
        {
            Scanner reader = new Scanner(System.in);  // Reading from System.in
            System.out.println("Enter your selection: ");
            input = reader.nextInt(); // Scans the next token of the input as an int.

        }
         public void setHaveResults(boolean ans)
         {
             haveResults=ans;
         }
        public boolean getHaveResults()
        {
        return haveResults;
        }
    public void printMenu()
    {
        System.out.println("\n"+"1- Search Medicine"+"\n");
        System.out.println("2- Exit"+"\n");
        while(input <= 2)
        {
        //System.out.println("Please enter your selection[1-3]");
        this.setInput();
            switch (input)
        {
            case 1: System.out.println("Call search function"+"\n"); 
                    break;
            case 2: System.out.println("Thank you for using PharmSearch"+
                    "\n"+"Terminating Session");
                    System.exit(0);
                    
                    break;
            
        }
    
        }
        
    }
    public char getAgreement()          // move to session class
    {
        return agreement;
    }
    public int printDisclaimer()       //call from disclaimer class ,
    {                                  //move out and define in disclaimer class
        System.out.println(disclaimerText);
            
        return 0;
    }
    public void printScreen()
    {
        this.clearScreen();
        for (int i=0 ;i<50;i++)
        {
        System.out.print(sym);
        }
        System.out.print("\n");
        for (int i=0 ;i<20;i++)
        {System.out.print(" ");}
        
        System.out.print("Program Name"+"\n");
        
        for (int i=0 ;i<50;i++)
        {
        System.out.print(sym);
        }
         System.out.print("\n");
        
         if (agreement=='Y' && haveResults == true)
         {
             //print list here
         }
        
    }
    public void  clearScreen ()
    {
       for (int i=0 ;i<50;i++)
        {
        System.out.println("\n");
        }       
    }
  /*  public void displayResults(med[x])  // x is the # of elements
    {
      String Name;
      String manu;
      double pr;
      String use;
      String sidee;
      String medDis;
      String rev;
      for (int i=0; i<x; i++)
      {
          System.out.println("\n"+" Result "+i);
          System.out.println("----------");
          System.out.println("Medicine Name: "+ Name);
          System.out.println("Medicine Manufacture: "+ manu);
          System.out.println("Medicine Price: "+ pr);
          System.out.println("Medicine Usage: "+ use);
          System.out.println("Medicine Side Effect: "+ sidee);
          System.out.println("Medicine Discription: "+ medDis);
          System.out.println("Medicine Review: "+ rev);
          
          
            Name= med.medName[i];
            manu= med.medspec.manufacture[i];
            pr= med.medspec.price[i];
            use=med.medspec.usage[i];
            sidee=med.medspec.sideEffects[i];
            medDis= med.medspec.medDisc[i];
            rev= med.medspec.review[i];
      }
        setHaveResults(false);
    }
*/
}
