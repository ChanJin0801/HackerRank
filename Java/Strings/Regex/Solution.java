package Strings.Regex;

import java.util.Scanner;

class Regex{
	
	public String pattern="([1][\\d][\\d]|[0][0][0]|([0][0]|)[\\d]|([0]|)[\\d][\\d]|[2][0-4][\\d]|[2][5][0-5])."
            + "([1][\\d][\\d]|[0][0][0]|([0][0]|)[\\d]|([0]|)[\\d][\\d]|[2][0-4][\\d]|[2][5][0-5])."
            + "([1][\\d][\\d]|[0][0][0]|([0][0]|)[\\d]|([0]|)[\\d][\\d]|[2][0-4][\\d]|[2][5][0-5])."
            + "([1][\\d][\\d]|[0][0][0]|([0][0]|)[\\d]|([0]|)[\\d][\\d]|[2][0-4][\\d]|[2][5][0-5])";
}

public class Solution {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			
			String IP = scanner.next();
			System.out.println(IP.matches(new Regex().pattern));
		}

	}

}
