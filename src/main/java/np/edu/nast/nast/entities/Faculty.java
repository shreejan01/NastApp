package np.edu.nast.nast.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_faculty")

public class Faculty {
	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	     
	      @Column(name="faculty_id",nullable=false,unique=true)
	      private Long facultyId;
		  @Column(name="faculty_name",nullable=false)
	      private String facultyName;
		 
		  public Faculty() {
			
		}

		public Long getFacultyId() {
			return facultyId;
		}

		public void setFacultyId(Long facultyId) {
			this.facultyId = facultyId;
		}

		public String getFacultyName() {
			return facultyName;
		}

		public void setFacultyName(String facultyName) {
			this.facultyName = facultyName;
		}
		  
		
		
	      
	}
