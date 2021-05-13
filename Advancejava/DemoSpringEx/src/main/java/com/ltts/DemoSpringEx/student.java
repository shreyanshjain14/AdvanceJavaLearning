package com.ltts.DemoSpringEx;

public class student {
	private int Studentid;
	private String studentname;
	private String studentaddress;
	public int getStudentid() {
		return Studentid;
	}
	public void setStudentid(int studentid) {
		Studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentaddress() {
		return studentaddress;
	}
	public void setStudentaddress(String studentaddress) {
		this.studentaddress = studentaddress;
	}
	@Override
	public String toString() {
		return "Student [Studentid=" + Studentid + ", studentname=" + studentname + ", studentaddress=" + studentaddress
				+ "]";
	}
	

}