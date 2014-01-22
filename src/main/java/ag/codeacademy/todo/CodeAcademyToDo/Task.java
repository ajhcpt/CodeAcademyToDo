package ag.codeacademy.todo.CodeAcademyToDo;

import java.util.Date;

public class Task {
	private String Description;
	private String Detail;
	private Date StartDate;
	private Date EndDateTime;
	private Category Category;
	
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getDetail() {
		return Detail;
	}
	public void setDetail(String detail) {
		Detail = detail;
	}
	public Date getStartDate() {
		return StartDate;
	}
	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}
	public Date getEndDateTime() {
		return EndDateTime;
	}
	public void setEndDateTime(Date endDateTime) {
		EndDateTime = endDateTime;
	}
	
}
