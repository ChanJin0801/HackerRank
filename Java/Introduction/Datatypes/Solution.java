package Introduction.Datatypes;

import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//Boolean canBoolean = true;
		Boolean canByte = true;
		Boolean canShort = true;
		Boolean canInt = true;
		Boolean canLong = true;
		
		int N = sc.nextInt();
		for(int i=0; i<N; i++) {
			
			String line = sc.next();
			try {
				Byte b = Byte.parseByte(line);
			} catch(Exception e) {
				canByte = false;
			}
			
			try {
				Short s = Short.parseShort(line);
			} catch(Exception e) {
				canShort = false;
			}
			
			try {
				int n = Integer.parseInt(line);
			} catch(Exception e) {
				canInt = false;
			}
			
			try {
				long l = Long.parseLong(line);
			} catch(Exception e) {
				canLong = false;
			}
			
			if(!canByte && !canShort && !canInt && !canLong) {
				System.out.println(line + " can't be fitted anywhere");
			}
			else {
				
				System.out.println(line + " can be fitted in: ");
				
				if(canByte)
					System.out.println("* byte");
				if(canShort)
					System.out.println("* short");
				if(canInt)
					System.out.println("* int");
				if(canLong)
					System.out.println("* long");
				
			}
			
			
			
		}
		
		

	}

}
