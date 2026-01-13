package Inheritance;

public class Hierarchical extends User{
	
	int points=1000;
	
	Hierarchical(String name, String userType) {
		super(name, userType);
	}
	
	void loyaltyPoints(int lpoints) {
		System.out.println("Welcome "+this.name+" your loyalty points upgraded into "+this.points+lpoints);
	}
	
}
