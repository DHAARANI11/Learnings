package Exception;

public class Main {
	public static void main(String[] args) {
		
		int n=10;
		int m=0;
		
		try {
			int ans=n/m;
			System.out.println(ans);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("This is finally block");
		}
		
	}
}
