package ObjectOrientedProgramming.AbstractClass;

import java.util.*;

abstract class Book{
	String title;
	abstract void setTitle(String s);
	String getTitle() {
		return title;
	}
}

class MyBook extends Book{
	void setTitle(String s){
		title = s;
	}
}

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String title = scanner.nextLine();
		MyBook new_novel = new MyBook();
		new_novel.setTitle(title);
		
		System.out.println("The title is: "+new_novel.getTitle());

	}

}
