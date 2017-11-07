package kr.or.dgit.mybatis_dev.dto;

import java.util.Date;

public class Course {
	private int courseId;
	private String name;
	private String description;
	private Date startDate;
	private Date EndDate;
	private int tutorId;
	public int getCouseId() {
		return courseId;
	}
	public void setCouseId(int courseId) {
		this.courseId = courseId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return EndDate;
	}
	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}
	public int getTutorId() {
		return tutorId;
	}
	public void setTutorId(int tutorId) {
		this.tutorId = tutorId;
	}
	public Course(int courseId, String name, String description, Date startDate, Date endDate, int tutorId) {
		super();
		this.courseId = courseId;
		this.name = name;
		this.description = description;
		this.startDate = startDate;
		EndDate = endDate;
		this.tutorId = tutorId;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return String.format("Course [couseId=%s, name=%s, description=%s, startDate=%s, EndDate=%s, tutorId=%s]",
				courseId, name, description, startDate, EndDate, tutorId);
	}
	
	
}
