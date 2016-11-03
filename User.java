package Assignment_3;

public class User {
	
	private int user_ID;
	private String username;
	private String user_password;
	
	
	public void user(int ID,String name,String password){
		
		user_ID = ID;
		username = name;
		user_password = password;
		
		
	}
	
	public int getuserID(){
		
		return user_ID;
	
	}
	
	public String getusername(){
		
		return username;
		
	}
	
	public String getpassword(){
		
		return user_password;
		
	}

	
	
}
