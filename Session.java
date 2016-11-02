		package ense374project;
		
		import java.util.*;
		
		//author alhwirif
		// Fares Alhwirini
		// 200304672
		
		
		public class Session { 
		
		public int ID; // session ID will be used later.
		User user1;
		Search srch;
		displayer print;
		
		
			  public void session() { 
			  
			       user1.user();
			  
			      if ( user1.username.equals(user1.user.usern) && user1.userPass.equals(user1.user.userp)  ) {
					  print.printScrean();
					  srch.search();
					  print.includeSearchResults();
					  print.printDisclaim();
					  
				  } else {
					  
					  // print error message from user saying the user and pass word is wrong or does not exist
					  // then exit program
					  System.exit(0)
				  }
					  
				
					  
				  
			  }
	
			
			
		}
			
		
		
			
		
		
			
			
	
