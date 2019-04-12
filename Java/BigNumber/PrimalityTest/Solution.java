package BigNumber.PrimalityTest;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		BigInteger n = scanner.nextBigInteger();
		
		System.out.println(n.isProbablePrime(100) ? "prime":"not prime");
		

	}

}
