package Polymorphism;

public class Overloading {
	
	private static int Sid=0;
	private int id;
	private String collegeName;
	private String place;
	static int count=0;
	public String Dept="ECE";
	
	//Constructor overloading
	
	Overloading(){
		this.id=++Sid;
		this.collegeName="KIT";
		this.place="Coimbatore";
	}
	
	Overloading(String collegeName,String place){
		this.id=++Sid;
		this.collegeName=collegeName;
		this.place=place;
	}
	
	//method overloading
	void Student(String name) {
		System.out.println("Welcome"+" "+name);
	}
	
	void Student() {
		System.out.println("Hello Everyone");
	}
	
	public static void Employee() {
		System.out.println("Employee");
	}
	
	
	static void Admin() {
		System.out.println("This is Admin"+ ++count);
	}
	
	//method overriding
	public String toString() {
		return this.id+" "+this.collegeName+" "+this.place;
	}
	
}
