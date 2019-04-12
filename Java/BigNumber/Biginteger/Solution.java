package BigNumber.Biginteger;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		BigInteger a = scanner.nextBigInteger();
		BigInteger b = scanner.nextBigInteger();
		
		BigInteger result = a.add(b);
		BigInteger result2 = a.multiply(b);
		
		System.out.println(result);
		System.out.println(result2);
		
	}

}
