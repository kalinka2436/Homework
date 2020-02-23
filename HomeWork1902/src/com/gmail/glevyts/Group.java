package com.gmail.glevyts;

import java.util.ArrayList;
import java.util.Scanner;

public class Group implements Voencom {

	private Student[] studentArray = new Student[10];
	private String groupName;

	public Group() {
		super();
		this.groupName = "unknow";
	}

	public Group(String groupName) {
		super();
		this.groupName = groupName;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public void addStudent(Student student, int j) throws MyException {
		if (student == null) {
			throw new IllegalArgumentException("Null student");
		}
		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i] == null) {
				student.setGroup(this.groupName);
				studentArray[i] = student;
				return;
			}
		}
		throw new MyException();
	}

	public Student search(String lastName) {
		for (Student student : studentArray) {
			if (student != null && student.getLastname().equals(lastName)) {
				return student;
			}
		}
		return null;
	}

	public boolean deleteStudent(long number) {
		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i] != null && studentArray[i].getZach() == number) {
				studentArray[i] = null;
				return true;
			}
		}
		return false;

	}

	private void sort() {
		for (int i = 0; i < studentArray.length - 1; i++) {
			for (int j = i + 1; j < studentArray.length; j++) {
				if (compareStudent(studentArray[i], studentArray[j]) > 0) {
					Student temp = studentArray[i];
					studentArray[i] = studentArray[j];
					studentArray[j] = temp;
				}
			}
		}
	}

	private int compareStudent(Student a, Student b) {
		if (a != null && b == null) {
			return 1;
		}
		if (a == null && b != null) {
			return -1;
		}
		if (a == null && b == null) {
			return 0;
		}
		return a.getLastname().compareTo(b.getLastname());

	}

	public int compareStudentGrade(Object s1, Object s2) {
		if (s1 != null && s2 == null) {
			return 1;
		}

		if (s1 == null && s2 != null) {
			return -1;
		}

		if (s1 == null && s2 == null) {
			return 0;
		}
		Student a = (Student) s1;
		Student b = (Student) s2;

		if (a.getGrade().compareTo(b.getGrade()) > 0) {
			return 1;
		}
		if (a.getGrade().compareTo(b.getGrade()) < 0) {
			return -1;
		}
		return 0;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Group: " + this.groupName).append(System.lineSeparator());
		int i = 0;
		sort();
		for (Student student : studentArray) {
			if (student != null) {
				sb.append((++i) + ") ").append(student);
				sb.append(System.lineSeparator());
			}
		}
		return sb.toString();
	}

	public Student MannualStudentAdding() {
		System.out.println("To add new student in the group " + groupName + " put his/her name and press Enter.");
		String groupName = this.groupName;
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("Then the last name and press Enter");
		String lastname = sc.nextLine();
		System.out.println("Age");
		int age = sc.nextInt();
		System.out.println("Gender");
		int sex = sc.nextInt();
		System.out.println("Student ID");
		long zach = sc.nextLong();
		int grade = sc.nextInt();
		System.out.println("Student's grade");
		sc.close();
		return new Student(name, lastname, age, sex, zach, grade);

	}

	@Override
	public Student[] getStudentsToArmy() {
		// TODO Auto-generated method stub
		int i = 0;
		for (Student student : studentArray) {
			if (student != null && student.isSex() && student.getAge() >= 18) {
				i += 1;
			}
		}
		Student[] millitarist = new Student[i];
		int j = 0;
		for (Student student : this.studentArray) {
			if (student != null && student.isSex() && student.getAge() >= 18) {
				millitarist[j++] = student;
			}

		}
		return millitarist;
	}

}
