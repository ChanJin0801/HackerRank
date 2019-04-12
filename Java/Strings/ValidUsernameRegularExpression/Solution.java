package Strings.ValidUsernameRegularExpression;

import java.util.Scanner;
import java.util.regex.Pattern;

class usernameValidator{
	private Pattern pattern;
	
	public static final String regularExpression = "[a-zA-Z][a-zA-Z0-9_]{7,29}$";
	public usernameValidator() {
		 pattern = Pattern.compile(regularExpression);
	}
	
}

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		while(N-->0) {
			String s = scanner.nextLine();
			System.out.println(s.matches(usernameValidator.regularExpression) ? "Valid" : "Invalid");
			
		}
		
		
		

	}

}
