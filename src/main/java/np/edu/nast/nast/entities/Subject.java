package np.edu.nast.nast.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_subject")

public class Subject {
	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	     
	      @Column(name="subject_id")
		  private Long subjectId;
		  @Column(name="subject_name",nullable=false)
	      private String subjectName;
		
		  public Subject() {

		}
		
		  public Long getSubjectId() {
			return subjectId;
		}
		public void setSubjectId(Long subjectId) {
			this.subjectId = subjectId;
		}
		public String getSubjectName() {
			return subjectName;
		}
		public void setSubjectName(String subjectName) {
			this.subjectName = subjectName;
		}
		
		  
		  
	}
