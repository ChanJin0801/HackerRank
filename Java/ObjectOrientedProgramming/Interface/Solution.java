package ObjectOrientedProgramming.Interface;

import java.util.Scanner;

interface AdvancedArithmetic{
	  int divisor_sum(int n);
	}

class Mycalculator implements AdvancedArithmetic{
	public int divisor_sum(int n) {
		int result = 0;
        int sqrt = (int)Math.sqrt(n);
        for(int i=1; i<=sqrt; i++){
            if(n%i==0){
                result += (i+n/i);
            }
        }
        if(sqrt * sqrt == n){
            result -= sqrt;
        }
        return result;
	}
}

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mycalculator my_calculator = new Mycalculator();
		System.out.print("I implemented: ");
		ImplementedInterfaceNames(my_calculator);
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		System.out.println(my_calculator.divisor_sum(N) + "\n");
		
		
		

	}
	
	static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
	
	

}
