package DataStructures.Sort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	
	public Student(int id, String fname, double cgpa) {
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

class StudentComparator implements Comparator<Student>{
	public int compare(Student s1, Student s2) {
		if(s1.getCgpa() != s2.getCgpa()) {
			return s1.getCgpa() < s2.getCgpa() ? 1:-1;
		}
		else if(s1.getFname() != s2.getFname()) {
			return s1.getFname().compareTo(s2.getFname());
		}
		else {
			return s1.getId() < s2.getId() ? 1:-1;
		}
	}
}
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		ArrayList<Student> studentList = new ArrayList<>();
		while(N-->0) {
			int id = scanner.nextInt();
			String fname = scanner.next();
			double cgpa = scanner.nextDouble();
			
			Student student = new Student(id, fname, cgpa);
			studentList.add(student);	
		}
		StudentComparator studentcomparator = new StudentComparator();
		Collections.sort(studentList, studentcomparator);
		
		for(Student st : studentList) {
			System.out.println(st.getFname());
		}

	}

}
