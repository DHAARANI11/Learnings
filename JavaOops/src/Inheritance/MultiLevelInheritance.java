package Inheritance;

public class MultiLevelInheritance extends SingleInheritance{
	
	static int coupouncode=600;

	MultiLevelInheritance(String name, String userType, int billAmount) {
		super(name, userType, billAmount);
	}
	
	void coupouncode() {
		System.out.println("Here is your coupoun code for next offer"+" "+ ++coupouncode);
	}
	
	void billAmt() {
		System.out.println("Your bill amount is "+amount);
	}
	
}
