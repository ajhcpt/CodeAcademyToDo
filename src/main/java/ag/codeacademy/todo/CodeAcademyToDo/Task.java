package ag.codeacademy.todo.CodeAcademyToDo;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class Task {
	private String description;
	private String detail;
	private Date startDate;
	private Date endDateTime;
	private Category taskCategory;
	private Boolean isCompleted;
	private int id;
	
	private static AtomicInteger nextId = new AtomicInteger(0);	
	
	public Task(String description, String detail, Date startDate,
			Date endDateTime, Category taskCategory, boolean isCompleted) {
		this.description = description;
		this.detail = detail;
		this.startDate = startDate;
		this.endDateTime = endDateTime;
		this.taskCategory = taskCategory;
		this.isCompleted = isCompleted;
		this.id = nextId.incrementAndGet();
	}

	public void SetIsCompletedToFalse() {
		isCompleted = false;
	}
	
	public void SetIsCompletedToTrue() {
		isCompleted = true;
	}

	public String getDescription() {
		return description;
	}

}