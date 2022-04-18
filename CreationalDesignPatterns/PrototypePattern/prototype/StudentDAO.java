package DesignPatterns.CreationalDesignPatterns.PrototypePattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO implements Cloneable{

	private static List<Student> list;
	
	static {																//Block has been created to demo the database connection object(static block used in place of db)
		
		list = new ArrayList<>();

		Student student1 = new Student(21, "Jack");
		
		Student student2 = new Student(21, "Adam");
		
		list.add(student1);
		list.add(student2); 									
	}
	
	public List<Student> getStudents(){
		return list;
	}
	public List<Student> clone() throws CloneNotSupportedException{
		List<Student> dummylist = new ArrayList<>();
		for(Student student: list) {
			dummylist.add(student);
		}
		return dummylist;
		
	}
	
	
}
