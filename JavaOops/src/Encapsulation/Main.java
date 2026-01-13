package Encapsulation;

public class Main {
	public static void main(String[] args) {
		EncapsulationClass ec=new EncapsulationClass(17,"Dhaarani",21,"CRM","AppX");
		System.out.println(ec);
		System.out.println(ec.getId()+"\n"+ec.getName()+"\n"+ec.getAge()+"\n"+ec.getDepartment()+"\n"+ec.getDesignation());
		ec.setId(24650);
		System.out.println(ec.getId());
		
	}
}
