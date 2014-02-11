package ag.codeacademy.todo.CodeAcademyToDo;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

import ag.codeacademy.todo.services.StringToDate;

public class ToDo {
	private String description;
	private String detail;
	private Date startDate;
	private Date endDateTime;
	private String taskCategory;
	private String importance;
	private int id;
	
	private static AtomicInteger nextId = new AtomicInteger(0);	
	
	public ToDo(String description, String detail, String startDate,
			String endDateTime, String taskCategory, String importance) {
		this.description = description;
		this.detail = detail;
		this.startDate = StringToDate.ConvertStringToDate(startDate);
		this.endDateTime = StringToDate.ConvertStringToDate(endDateTime);
		this.taskCategory = taskCategory;
		this.importance = importance;
		this.id = nextId.incrementAndGet();
	}

	public String getDescription() {
		return description;
	}

}
