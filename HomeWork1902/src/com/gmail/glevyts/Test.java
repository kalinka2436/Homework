package com.gmail.glevyts;


import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		Group gr = new Group("PN-121");
		try {
			gr.addStudent(new Student("Alexander", "Ts", 19, true, 1234, "PN-121", 0), 0);
			gr.addStudent(new Student("Ekaterina", "Rez", 18, false, 1253, "PN-121",4), 0);
			gr.addStudent(new Student("Alexey", "St", 20, true, 14523, "PN-121",1),6);
			gr.addStudent(new Student("Irina", "Iv", 23, false, 12213, "PN-121",9),1);
			gr.addStudent(new Student("Olga", "Cher", 17, false, 1243, "PN-121",10),2);
			gr.addStudent(new Student("Andrey", "Pop", 18, true, 12123, "PN-121",13),6);
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(gr);

		System.out.println();

		Student st = gr.search("Rez");

		System.out.println(st);
		
		System.out.println();
		
		System.out.println(gr.toString());
		
		System.out.println();
		
		System.out.println(gr.MannualStudentAdding());
		
		System.out.println();
		
		System.out.println();
		
		
		

	}

}
