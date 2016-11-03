/*
 Muhammad Ahmed
 200 350 262
 */
import java.util.*;

//package enseprojectsearch;

/**
 *
 * @author ahmed35m
 */
public class Search {
    
    // private medSpec searchSpec;     // Search criteria 
    
      public static void main(String[] args) {
          
          Search se = new Search();
          se.getSearchCriteria();
          
      }
      
      Search()
      {
         
      }
    // new function to get list
      public List getSearchCriteria()           
      {
           Scanner userIn = new Scanner(System.in);
         
           List<String> symp=new ArrayList<String>();
           boolean cont=true;
           int i=0;
           
           while(cont==true);
           {
           System.out.println("Please Enter your symptoms: ");
           symp.add(userIn.next());
           i=i+1;
           System.out.println("Do you have more symptoms?[Y/N] ");
           String a = userIn.next();
           if (a.equals("N") || a.equals("n"))
           {
               cont=false;
           }
           }
           return symp ;
      }
      
       public List Searchresult(List symptoms)
       {
           List Results=null;
         // check all med's symtoms with the given list symptoms
           // if match then add to the list of meds to return
           return Results;
       }
}
