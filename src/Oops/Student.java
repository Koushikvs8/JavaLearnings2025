package Oops;

import java.util.Scanner;

public class Student {
	
	String name;
	int num;
	int age;
	int score;
	

	public Student() {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the student name :");
		this.name=input.nextLine();
		System.out.println("enter the student number :");
		this.num=input.nextInt();
		System.out.println("enter the student age :");
		this.age=input.nextInt();
		System.out.println("enter the student score :");
		this.score=input.nextInt();
	}
	
	public void sendToSchool()
	{  School sc=new  School();
	      sc.generateReport(this);
		
	}
	
	
	public static void main(String[] sfj)
	{
		Student s1=new Student();
		s1.sendToSchool();
		
	}
	

}
