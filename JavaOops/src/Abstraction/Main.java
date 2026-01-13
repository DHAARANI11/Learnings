package Abstraction;

public class Main {
	public static void main(String[] args) {
		
		//up casting and down casting
		AbsA a=new AbsC();
		a.subjectB();
		
		AbsB b=new AbsC();
		b.subjectA();
		b.subjectC();
		b.Names();
		
		AbsC c=(AbsC) b;
		c.subjectA();
		
	}
}
