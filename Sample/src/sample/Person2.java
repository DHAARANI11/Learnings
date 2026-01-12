package sample;

public interface Person2{
	void Name();
	default void CitizenShip() {
		System.out.println("India");
	}
}
