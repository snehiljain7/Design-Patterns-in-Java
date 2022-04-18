package DesignPatterns.CreationalDesignPatterns.PrototypePattern.Client;

import java.util.List;

import DesignPatterns.CreationalDesignPatterns.PrototypePattern.prototype.Student;
import DesignPatterns.CreationalDesignPatterns.PrototypePattern.prototype.StudentDAO;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		StudentDAO studentDAO = new StudentDAO();
		List<Student> list = studentDAO.getStudents();
		System.out.println("Original students list is: ");
		list.forEach(System.out::println);
		
		List<Student> list2 = studentDAO.clone();
		list2.add(new Student(25, "Dummy"));
		System.out.println("Updated students list is: ");
		list2.forEach(System.out::println);
	}

}
