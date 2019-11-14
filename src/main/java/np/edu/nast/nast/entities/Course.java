package np.edu.nast.nast.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="tbl_course")

public class Course {
	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	   
	   
	    @Column(name="course_id")
	      private Long courseId;
	      
	   
	    @Column(name="subject_id",nullable=false,unique=true)
	      private Long subjectId;	      
	     
	    @Column(name="program_id",nullable=false,unique=true)
	      private Long programId;
	    
	    @Column(name="semester_id",nullable=false,unique=true)		  
		  private Long semesterId;
	      
		  @Column(name="course_code",nullable=false)
	      private String courseCode;
		  
		  @Column(name="full_marks",nullable=false)
	      private String fullMarks;
		  
		  @Column(name="pass_marks",nullable=false)
	      private String passMarks;
	
		  @Column(name="grace_marks",nullable=false)
	      private String graceMarks;

		public Course() {
			
		}

		public Long getCourseId() {
			return courseId;
		}

		public void setCourseId(Long courseId) {
			this.courseId = courseId;
		}

		public Long getSubjectId() {
			return subjectId;
		}

		public void setSubjectId(Long subjectId) {
			this.subjectId = subjectId;
		}

		public Long getProgramId() {
			return programId;
		}

		public void setProgramId(Long programId) {
			this.programId = programId;
		}

		public Long getSemesterId() {
			return semesterId;
		}

		public void setSemesterId(Long semesterId) {
			this.semesterId = semesterId;
		}

		public String getCourseCode() {
			return courseCode;
		}

		public void setCourseCode(String courseCode) {
			this.courseCode = courseCode;
		}

		public String getFullMarks() {
			return fullMarks;
		}

		public void setFullMarks(String fullMarks) {
			this.fullMarks = fullMarks;
		}

		public String getPassMarks() {
			return passMarks;
		}

		public void setPassMarks(String passMarks) {
			this.passMarks = passMarks;
		}

		public String getGraceMarks() {
			return graceMarks;
		}

		public void setGraceMarks(String graceMarks) {
			this.graceMarks = graceMarks;
		}
	
		
	      
	}
