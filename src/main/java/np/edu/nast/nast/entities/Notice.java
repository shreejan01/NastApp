package np.edu.nast.nast.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_notice")

public class Notice {
	  @Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
	  @Column(name="notice_id")
	  private Long noticeId;
	  @Column(name="notice_title",nullable=false)
      private String noticeTitle;
	  @Column(name="notice",nullable=false)
      private String notice;
	  @Column(name="published_date",nullable=false)	 
      private String publishedDate;
	  @Column(name="notice_Type",nullable=false)
	  private String noticeType;
	  @Column(name="is_Active",nullable=false)
      private Boolean isActive;
	  
	public Notice() {
		
	}

	public Long getNoticeId() {
		return noticeId;
	}



	public void setNoticeId(Long noticeId) {
		this.noticeId = noticeId;
	}



	public String getNoticeTitle() {
		return noticeTitle;
	}



	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}



	public String getNotice() {
		return notice;
	}



	public void setNotice(String notice) {
		this.notice = notice;
	}



	public String getPublishedDate() {
		return publishedDate;
	}



	public void setPublishedDate(String publishedDate) {
		this.publishedDate = publishedDate;
	}



	public String getNoticeType() {
		return noticeType;
	}



	public void setNoticeType(String noticeType) {
		this.noticeType = noticeType;
	}



	public Boolean getIsActive() {
		return isActive;
	}



	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}



	@Override
	public String toString() {
		return "Notice [noticeId=" + noticeId + ", noticeTitle=" + noticeTitle + ", notice=" + notice
				+ ", publishedDate=" + publishedDate + ",noticeType=" + noticeType + ", isActive=" + isActive + "]";
	}
      
}
