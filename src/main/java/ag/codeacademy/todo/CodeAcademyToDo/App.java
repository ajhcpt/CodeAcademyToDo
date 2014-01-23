package ag.codeacademy.todo.CodeAcademyToDo;

/**
 * Hello world!
 *
 */
public class App {
	
	private static TaskList taskList; 
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        setTaskList(new TaskList());
    }
    
    public void CreateTask() {
    	
    }

	public static TaskList getTaskList() {
		return taskList;
	}

	public static void setTaskList(TaskList taskList) {
		App.taskList = taskList;
	}
}
