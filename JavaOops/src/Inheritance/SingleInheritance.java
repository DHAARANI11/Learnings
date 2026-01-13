package Inheritance;

public class SingleInheritance extends User{
	double billAmount;
	int amount=1000;

	SingleInheritance(String name, String userType, int billAmount) {
		super(name, userType);
		this.billAmount=billAmount;
		
	}
	
	void ThanksMessage() {
		System.out.println("Dear "+this.name+" "+"Thank you choosing "+this.userType);
	}
	
	void Offer() {
		System.out.println("Your billamount is reduced by 10% for welcome discount"+calc());
	}
	
	double calc() {
		return billAmount-(billAmount*0.1);
		
	}
}
