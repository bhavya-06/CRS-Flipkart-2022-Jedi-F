package com.flipkart.bean;

import java.util.List;

public class GradeCard {
	private int StudentID;
	private List<Integer> grades;
	private int semester;
	private float cgpa;
	public int getStudentID() {
		return StudentID;
	}
	public void setStudentID(int studentID) {
		StudentID = studentID;
	}
	public List<Integer> getGrades() {
		return grades;
	}
	public void setGrades(List<Integer> grades) {
		this.grades = grades;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public float getCgpa() {
		return cgpa;
	}
	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}
	

}
