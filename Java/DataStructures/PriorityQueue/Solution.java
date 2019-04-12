package DataStructures.PriorityQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.PriorityQueue;

class Student implements Comparable<Student>{
	
	String name;
    int id;
    Double cgpa;
    Student(String name, Double cgpa, int id){
        this.name = name;
        this.cgpa = cgpa;
        this.id = id;
    }
    public int compareTo(Student b){
        if(this.cgpa > b.cgpa){
            return -1;
        }
        if(this.cgpa < b.cgpa){
            return 1;
        }
        if(this.cgpa == b.cgpa){
            if(this.name.compareTo(b.name) > 0){
                return 1;
            }
            if(this.name.compareTo(b.name) < 0){
                return -1;
            }
            if(this.name.compareTo(b.name) == 0){
                if(this.id > b.id)
                    return 1;
                if(this.id < b.id)
                    return -1;
            }

        }
        return 0;
    }
    public String getName(){
        return name;
    }
		
}

class Priorities{
	Priorities(){};
	public List<Student> getStudents(List<String> events){
        PriorityQueue<Student> queue = new PriorityQueue<>();
        for(int i=0; i<events.size(); i++){
            if(events.get(i).contains("SERVED")){
                if(queue.size()>0){
                    queue.poll();
                }
            }
            else{
                String[] data = events.get(i).split(" ");
                queue.add(new Student(data[1], Double.valueOf(data[2]), Integer.parseInt(data[3]) ));
            }
        }
        List<Student> result = new ArrayList<>();
        while(queue.size() > 0){
                result.add(queue.poll());
            }
        return result;
    }
}

public class Solution {
	
	private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents > 0) {
            String event = scan.nextLine();
            events.add(event);
            
            totalEvents--;
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }

}
