package Inheritance;

public class User {
	private int userID=0;
	int UID;
	String name;
	String userType;
	
	User(String name,String userType){
		this.UID=++userID;
		this.name=name;
		this.userType=userType;
	}
	
	void WelcomeUser() {
		System.out.println("Welcome to TugoEats "+this.name);
	}
	
	
}
