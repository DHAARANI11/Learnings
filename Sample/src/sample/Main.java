package sample;

public class Main {
	static int i=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPerson2 cp=new ClassPerson2();
		cp.Age();
		cp.Name();
		cp.Country();
		cp.CitizenShip();
		call();
		int a =i;
		call();
		int b=i;
		System.out.print(a+" "+b);

	}
	public static int call() {
		return ++i;
	}

}
