package np.edu.nast.nast.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_student")

public class Student {
	  @Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
	  @Column(name="student_id",nullable=false)
	  private Long studentId;
	  @Column(name="symbol_no",nullable=false,unique=true)
	  private Long symbolNo;
	  @Column(name="registration_no",nullable=false,unique=true)
	  private Long registrationNo;
	  @Column(name="class_roll_no",nullable=false,unique=true)
	  private Long classRollNo;
	  @Column(name="student_name",nullable=false)
      private String studentName;
	  @Column(name="student_address",nullable=false)
      private String studentAddress;
	  @Column(name="faculty_id",nullable=false,unique=true)
      private Long facultyId;
	  @Column(name="semester_id",nullable=false,unique=true)
      private String semesterId;
	  @Column(name="email",nullable=false,unique=true)
      private String email;
	  @Column(name="gender",nullable=false)
      private String gender;
	  @Column(name="contact",nullable=false)
      private Long contact;
	  @Column(name="parent_id",nullable=false,unique=true)
      private Long parentId;
	 
	
	  public Student() {
		
	}


	public Long getStudentId() {
		return studentId;
	}


	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}


	public Long getSymbolNo() {
		return symbolNo;
	}


	public void setSymbolNo(Long symbolNo) {
		this.symbolNo = symbolNo;
	}


	public Long getRegistrationNo() {
		return registrationNo;
	}


	public void setRegistrationNo(Long registrationNo) {
		this.registrationNo = registrationNo;
	}


	public Long getClassRollNo() {
		return classRollNo;
	}


	public void setClassRollNo(Long classRollNo) {
		this.classRollNo = classRollNo;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public String getStudentAddress() {
		return studentAddress;
	}


	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}


	public Long getFacultyId() {
		return facultyId;
	}


	public void setFacultyId(Long facultyId) {
		this.facultyId = facultyId;
	}


	public String getSemesterId() {
		return semesterId;
	}


	public void setSemesterId(String semesterId) {
		this.semesterId = semesterId;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public Long getContact() {
		return contact;
	}


	public void setContact(Long contact) {
		this.contact = contact;
	}


	public Long getParentId() {
		return parentId;
	}


	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

   
	
      
}
