package org.study.demo;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Student {
	
	@Pattern(regexp="[^0-9]*")
	private String studentName;
	@NotNull @Size(min=2, max=30) @IsValidHobby(listOfValidHobbies ="music|ball|song")
	private String studentHobby;
	@Past
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
