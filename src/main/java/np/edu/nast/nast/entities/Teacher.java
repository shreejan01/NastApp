package np.edu.nast.nast.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_teacher")

public class Teacher {
	  @Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
	  @Column(name="teacher_id")
	  private Long teacherId;
	  @Column(name="teacher_name",nullable=false)
      private String teacherName;
	  @Column(name="teacher_title",nullable=false)
      private String teacherTitle;
	  @Column(name="teacher_address",nullable=false)
      private String teacherAddress;
	  @Column(name="email_address",nullable=false)
      private String emailAddress;
	  @Column(name="gender",nullable=false)
      private String gender;
	  @Column(name="contact_no",nullable=false)
      private Long contactNo;
	
	
	  public Teacher() {
		
	}


	public Long getTeacherId() {
		return teacherId;
	}


	public void setTeacherId(Long teacherId) {
		this.teacherId = teacherId;
	}


	public String getTeacherName() {
		return teacherName;
	}


	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}


	public String getTeacherTitle() {
		return teacherTitle;
	}


	public void setTeacherTitle(String teacherTitle) {
		this.teacherTitle = teacherTitle;
	}


	public String getTeacherAddress() {
		return teacherAddress;
	}


	public void setTeacherAddress(String teacherAddress) {
		this.teacherAddress = teacherAddress;
	}


	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public Long getContactNo() {
		return contactNo;
	}


	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}


	
	
      
}
