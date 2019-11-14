package np.edu.nast.nast.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_program")

public class Program {
	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	     
	      @Column(name="program_id",nullable=false,unique=true)
	      private Long programId;
		  @Column(name="program_name",nullable=false)
	      private String programName;
		public Program() {
		
		}
		public Long getProgramId() {
			return programId;
		}
		public void setProgramId(Long programId) {
			this.programId = programId;
		}
		public String getProgramName() {
			return programName;
		}
		public void setProgramName(String programName) {
			this.programName = programName;
		}
		 
		
	}
