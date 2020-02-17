package com.aiub.lab4;

public class Student {
		private String name;
		private String id;
		private String dept;
		private double cgpa;
		public Student() {
			super();
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getDept() {
			return dept;
		}
		public void setDept(String dept) {
			this.dept = dept;
		}
		public double getCgpa() {
			return cgpa;
		}
		public void setCgpa(float cgpa) {
			this.cgpa = cgpa;
		}
		public Student(String name, String id, String dept, float cgpa) {
			super();
			this.name = name;
			this.id = id;
			this.dept = dept;
			this.cgpa = cgpa;
		}
		public void Show()
		{
			System.out.println(name+" "+id+" "+dept+" "+cgpa);
		}
}
