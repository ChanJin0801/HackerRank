package Advanced.PrimeChecker;

import java.text.*;
import java.math.*;
import java.util.HashSet;
import java.util.regex.*;
import java.lang.reflect.*;

import static java.lang.System.in;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Prime{
	
	void checkPrime(int ...nums) {
		for(int num : nums) {
			if (isPrime(num))
				System.out.print(num + " ");
		}
		System.out.println();
	}
	
	boolean isPrime(int num) {
		if(num < 2) {
			return false;
		}
		if(num==2) {
			return true;
		}
		for(int i=2; i<=(int)Math.sqrt(num); i++) {
				if(num%i == 0) {
					return false;
				}
		}
		
		return true;
	}
	
	
}

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n1 = Integer.parseInt(br.readLine());
			int n2 = Integer.parseInt(br.readLine());
			int n3 = Integer.parseInt(br.readLine());
			int n4 = Integer.parseInt(br.readLine());
			int n5 = Integer.parseInt(br.readLine());
			Prime ob = new Prime();
			ob.checkPrime(n1);
			ob.checkPrime(n1, n2);
			ob.checkPrime(n1, n2, n3);
			ob.checkPrime(n1, n2, n3, n4, n5);
			
			Method[] methods = Prime.class.getDeclaredMethods();
			HashSet<String> set=new HashSet<>();
			boolean overload=false;
			for(int i=0;i<methods.length;i++)
			{
				if(set.contains(methods[i].getName()))
				{
					overload=true;
					break;
				}
				set.add(methods[i].getName());
				
			}
			if(overload)
			{
				throw new Exception("Overloading not allowed");
			}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}

	}

}
