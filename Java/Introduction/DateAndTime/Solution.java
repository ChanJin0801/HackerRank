package Introduction.DateAndTime;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.time.LocalDate;

public class Solution {
	
	public static String getDay(String day, String month, String year) {
        int d = Integer.valueOf(day);
        int m = Integer.valueOf(month);
        int y = Integer.valueOf(year);
        LocalDate date = LocalDate.of(y, m, d);
        return date.getDayOfWeek().toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        String month = in.next();
        String day   = in.next();
        String year  = in.next();
        
        System.out.println(getDay(day, month, year));

	}

}
