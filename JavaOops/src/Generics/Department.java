package Generics;

public class Department<T> {
	
	T name;
	
	Department(T name){
		this.name=name;
	}
	
	public T getName() {
		return this.name;
	}
	
	public void setName(T name) {
		this.name=name;
	}
	
}
