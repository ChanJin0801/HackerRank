package ExceptionHandling.ExceptionHandling2;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        try{
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println((int)a/b);

        }
        catch(InputMismatchException e){
            System.out.println(e.getClass().getName());
        }
        catch(ArithmeticException e){
            System.out.println(e.getClass().getName() + ": / by zero");
        }

	}

}
