package adda;
import java.util.*;
import java.util.HashMap;
public class class1{
	private Map<String,String> users=new HashMap<>();
	private Scanner scanner;
	public class1() {
		scanner =new Scanner(System.in);
		users.put("ram", "3025");
	}
	public void closeScanner() {
		scanner.close();
	}
	public void authenticateUser() {
		System.out.print("Enter Name:");
		String name=scanner.nextLine();
		System.out.print("Enter ID:");
		String ID=scanner.nextLine();
		boolean isAuthenticated = authenticate(name,ID);
		if(isAuthenticated) {
			System.out.println("Successfull");
		}
		else {
			System.out.println("Unsuccessfull");
		}
	}
	public boolean authenticate(String name,String ID) {
		String stored=users.get(name);
		return stored != null && stored.equals(ID);
	}
	public static void main(String[] args) {
		class1 app=new class1();
		app.authenticateUser();
		app.closeScanner();
	}
}