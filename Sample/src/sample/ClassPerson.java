package sample;

public class ClassPerson implements Person,Person3{


	@Override
	public void Name() {
		System.out.println("Dhaarani");
	}

	@Override
	public void Country() {
		System.out.println("India");
		
	}

	@Override
	public void Age() {
		System.out.println(21);
	}
//	@Override
//	public void CitizenShip() {
//		System.out.println("Russia");
//	}
}
