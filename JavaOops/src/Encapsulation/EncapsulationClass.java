package Encapsulation;

public class EncapsulationClass {
	
	private int id;
	private String name;
	private int age;
	private String Department;
	private String Designation;
	
	EncapsulationClass(int id,String name,int age,String Department,String Designation){
		this.id=id;
		this.name=name;
		this.age=age;
		this.Department=Department;
		this.Designation=Designation;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public String getDepartment() {
		return Department;
	}
	
	public void setDepartment(String Department) {
		this.Department=Department;
	}
	
	public String getDesignation() {
		return Designation;
	}
	
	public void setDesignation(String Designation) {
		this.Designation=Designation;
	}
	
	@Override
	public String toString() {
		return getId()+" "+getName()+" "+getAge()+" "+getDepartment()+" "+getDesignation();
	}
}
