package ClassAndObject;

public class InnerClass {
	
	void Outermethod() {
	
	class Innercls1{
		public void Helloworld() {
			System.out.println("Hello World");
		}
	}
	
	Innercls1 ic=new Innercls1();
	ic.Helloworld();
	
	}
	
	static class Innercls2{
		public void Helloworld() {
			System.out.println("Hello");
		}
	}
	
	class Innercls1{
		public void Helloworld() {
			System.out.println("Innercls");
		}
	}
	
}
