package Inheritance;

public class Main {
	public static void main(String...args) {
		
		
		User user=new User("Dhaarani","Regular");
		user.WelcomeUser();
		
		
		SingleInheritance si=new SingleInheritance("Dharshini","Premium",1000);
		si.WelcomeUser();
		si.ThanksMessage();
		si.Offer();
		
		
		MultiLevelInheritance mi=new MultiLevelInheritance("Kavi","Gold",500);
		mi.WelcomeUser();
		mi.ThanksMessage();
		mi.Offer();
		mi.coupouncode();
		mi.billAmt();
		
		
		Hierarchical hr=new Hierarchical("Baki","Premium");
		hr.WelcomeUser();
		hr.loyaltyPoints(500);
		
		
		HybridInheritance hi=new HybridInheritance("Ilaks","Regular");
		hi.Welcome();
		hi.WelcomeUser();
		hi.loyaltyPoints(600);
		
		
	}
}
