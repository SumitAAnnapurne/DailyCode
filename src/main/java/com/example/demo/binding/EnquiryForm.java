package com.example.demo.binding;

public class EnquiryForm {

	private String studentName;
	private long studentPhone;
	private String classMode;
	private String courseName;
	private String enqStatus;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public long getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(long studentPhone) {
		this.studentPhone = studentPhone;
	}

	public String getClassMode() {
		return classMode;
	}

	public void setClassMode(String classMode) {
		this.classMode = classMode;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getEnqStatus() {
		return enqStatus;
	}

	public void setEnqStatus(String enqStatus) {
		this.enqStatus = enqStatus;
	}

	@Override
	public String toString() {
		return "EnquiryForm [studentName=" + studentName + ", studentPhone=" + studentPhone + ", classMode=" + classMode
				+ ", courseName=" + courseName + ", enqStatus=" + enqStatus + "]";
	}

}
