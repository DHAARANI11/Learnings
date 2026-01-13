package Inheritance;

public class HybridInheritance extends Hierarchical{

	HybridInheritance(String name, String userType) {
		super(name, userType);
	}
	
	void Welcome() {
		System.out.println("Welcome "+this.name+" "+"as a "+this.userType);
	}
}
