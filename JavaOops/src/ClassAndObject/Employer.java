package ClassAndObject;

public class Employer {
	private String name;
	private String Department;
	private static Employer employer;
	
	private Employer() {}
	
	public static Employer getEmployer() {
		if(employer==null) employer=new Employer();
		return employer;
	}
}
