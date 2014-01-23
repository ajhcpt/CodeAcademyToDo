package ag.codeacademy.todo.CodeAcademyToDo;

import java.util.Date;

public class Task {
	private String description;
	private String detail;
	private Date startDate;
	private Date endDateTime;
	private Category taskCategory;
	private Boolean isCompleted;
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDateTime() {
		return endDateTime;
	}
	public void setEndDateTime(Date endDateTime) {
		this.endDateTime = endDateTime;
	}
	public Category getTaskCategory() {
		return taskCategory;
	}
	public void setTaskCategory(Category taskCategory) {
		this.taskCategory = taskCategory;
	}
	public Boolean getIsCompleted() {
		return isCompleted;
	}
	public void setIsCompleted(Boolean isCompleted) {
		this.isCompleted = isCompleted;
	}

	
}