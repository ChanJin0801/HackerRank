package DataStructures.PriorityQueue2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Student{
	private String name;
	private double cgpa;
	private int id;
	
	Student(String name, double cgpa, int id){
		this.name = name;
		this.cgpa = cgpa;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public double getCgpa() {
		return cgpa;
	}
	public int getId() {
		return id;
	}
	
}

class StudentComparator implements Comparator<Student>{
	public int compare(Student s1, Student s2) {
		if(s1.getCgpa() < s2.getCgpa()) {
			return 1;
		}
		if(s1.getCgpa() > s2.getCgpa()) {
			return -1;
		}
		if(s1.getCgpa() == s2.getCgpa()) {
			if(s1.getName().compareTo(s2.getName()) > 0) {
				return 1;
			}
			if(s1.getName().compareTo(s2.getName()) < 0) {
				return -1;
			}
			if(s1.getName().compareTo(s2.getName()) == 0) {
				if(s1.getId() - s2.getId() > 0)
					return 1;
				if(s1.getId() - s2.getId() < 0)
					return -1;
			}
		}
		return 0;
	}
	
}

public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int totalEvents = Integer.parseInt(in.nextLine());
        PriorityQueue<Student> pq = new PriorityQueue(totalEvents, new StudentComparator());
            while(totalEvents>0){
            String event = in.next();
            if (event.equals("ENTER")) {
                String name = in.next();
                double cgpa = in.nextDouble();
                int id = in.nextInt();
                Student s = new Student(name, cgpa, id);
                pq.add(s);
            }
            else {
                pq.poll();
            }

            totalEvents--;
        }
        if (pq.isEmpty()) {
            System.out.println("EMPTY");
        }
        while (!pq.isEmpty()) {
            System.out.println(pq.poll().getName());
        }

	}

}
