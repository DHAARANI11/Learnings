package Abstraction;

public abstract class AbsB extends AbsA{
	
	private String name="Dharshu";
	
	abstract void subjectC();
	abstract void subjectD();
	
	
	@Override
	void subjectA() {
		System.out.println("This Subject is A");
	}
	
	@Override
	void subjectB() {
		System.out.println("This Subject is B");
	}
	
	void Names() {
		System.out.println(super.name);
		System.out.println(this.name);
	}
}
