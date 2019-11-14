package np.edu.nast.nast.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_parent")

public class Parent {
	  @Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
	  @Column(name="parent_id",nullable=false)
	  private Long parentId;
	  @Column(name="father_name",nullable=false)
      private String fatherName;
	  @Column(name="mother_name",nullable=false)
      private String motherName;
	  @Column(name="contact_no",nullable=false)
      private long contactNo;
	public Parent() {
		
	}
	public Long getParentId() {
		return parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	
	  
}
	