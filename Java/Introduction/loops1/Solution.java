package Introduction.loops1;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
        for(int i=1; i<11; i++){
            
            System.out.println(N + " x " + i + " = " + (N * i) );
            
        
        }
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

	}

}
