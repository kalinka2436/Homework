package com.gmail.glevyts;

public class Student extends Human {
	
	private long zach;
	private String group;
	private int grade;


	public Student(String name, String lastname, int age, boolean sex, long zach, String group, int grade) {
		super(name, lastname, age, sex);
		this.zach=zach;
		this.group=group;
		this.grade=grade;

	}
	
	
	public void setGrade(int grade) {
		this.grade = grade;
	}


	public Student(String name, String lastname, int age, int sex, long zach,int grade) {
		super();
	}

	public long getZach() {
		return zach;
	}

	public void setZach(long zach) {
		this.zach = zach;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	@Override
	public String toString() {
		return "Student [zach=" + zach + ", group=" + group + super.toString();
	}

	public Object getGrade() {
		// TODO Auto-generated method stub
		return null;
	}

}
