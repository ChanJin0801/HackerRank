package DataStructures.Generics;

import java.io.IOException;
import java.lang.reflect.Method;

class Printer{
	public static <E> void printArray(E[] inputArray) {
		for(E element : inputArray) {
			System.out.printf("%s", element);
			System.out.println();
		}
		
	}
}



public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer printer = new Printer();
		Integer[] intArray = {1,2,3};
		String[] strArray = {"Hello", "World"};
		printer.printArray(intArray);
		printer.printArray(strArray);
		int count = 0;
		
		for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");

	

	}
}
