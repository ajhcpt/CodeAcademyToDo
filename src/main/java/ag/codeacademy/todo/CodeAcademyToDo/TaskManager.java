package ag.codeacademy.todo.CodeAcademyToDo;

import java.util.ArrayList;
import java.util.Date;

public class TaskManager {
	
	private static ArrayList<Task> taskList;
	
	public TaskManager() {
		taskList = new ArrayList<Task>();
	}
	
	public void CreateTask(String description, String detail, Date startDate, Date endDateTime, Category c, boolean isCompleted) {
		Task newTask = new Task(description, detail, startDate, endDateTime, c, isCompleted);
		taskList.add(newTask);
	}
	


}
