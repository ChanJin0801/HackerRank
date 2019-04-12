package Strings.TagContactExtractor;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases-->0){

			String line = in.nextLine();
            String pattern ="\\<(.+)\\>([^\\<\\>]+)\\<\\/\\1\\>";
            boolean matchFound = false;
         
            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(line);

            while(m.find()){
                System.out.println(m.group(2));
                matchFound = true;
            }
            
            if(!matchFound)
            	System.out.println("None");
            
		}

	}

}
