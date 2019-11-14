package np.edu.nast.nast.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_semester")

public class Semester {
	  @Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
	  @Column(name="semester_id")
	  
	  private Long semesterId;
	  @Column(name="semester_title",nullable=false,unique=true)
      private String semesterTitle;
	  @Column(name="semester",nullable=false)
      private String semester;
	public Semester() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getSemesterId() {
		return semesterId;
	}
	public void setSemesterId(Long semesterId) {
		this.semesterId = semesterId;
	}
	public String getSemesterTitle() {
		return semesterTitle;
	}
	public void setSemesterTitle(String semesterTitle) {
		this.semesterTitle = semesterTitle;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	  
	  
      
}
