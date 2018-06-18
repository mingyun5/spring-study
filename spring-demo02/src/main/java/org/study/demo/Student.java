package org.study.demo;

import java.util.Date;

public class Student {
	
	private String studentName;
	private String studentHobby;
	private Date studentDOB;
	
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentHobby() {
		return studentHobby;
	}
	public void setStudentHobby(String studentHobby) {
		this.studentHobby = studentHobby;
	}
	public Date getStudentDOB() {
		return studentDOB;
	}
	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}
	
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentHobby=" + studentHobby + ", studentDOB=" + studentDOB
				+ ", address=" + address + "]";
	}
	
	
}
