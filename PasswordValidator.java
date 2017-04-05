import java.util.HashMap;
import java.util.Scanner;

public class PasswordValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		boolean small = false;
		boolean caps = false;
		boolean space = false;
		boolean spchar = false;
		boolean num = false;

		if (s.length()<8) {
			System.out.println("Invalid Password");
			System.exit(0);
		}
		else {
			for (int i = 0; i < s.length(); i++) {
//				System.out.println((int)s.charAt(i)+" "+s.charAt(i));
				char cs = s.charAt(i);
				/*if (cs == 32) {
					space = true;
				}*/
				if (cs>=48 && cs<=57) {
					num = true;
				}
				else if (cs>=65&&cs<=90) {
					caps = true;
				}
				else if (cs>=97&&cs<=122) {
					small = true;
				}
				else {
					spchar = true;
				}
			}
		}
		
		if (small && caps && num && spchar) {
			System.out.println("Strong Password");
		}
		else if (small && caps && num) {
			System.out.println("Moderate Password");
		}
		else if (small && caps) {
			System.out.println("Weak Password");
		}
		else {
			System.out.println("Moderate Password");
		}
	}
}

