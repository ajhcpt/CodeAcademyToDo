package ag.codeacademy.todo.CodeAcademyToDo;

import ag.codeacademy.todo.services.ReadToDoFromFile;

public class App {
	
	public static void main( String[] args ) {
		if (args.length == 1) {
			ToDoBoard toDoBoard = new ToDoBoard(ReadToDoFromFile.ReadFromFile(args[0]));
			
			System.out.println("List of description of To Dos imported");
			for(ToDo toDo : toDoBoard.gettoDoList()) {
				System.out.println(toDo.getDescription());
			}
			
		} else {
			System.out.println("Please enter one argument: ");
			System.out.println("1: Path to To Do test file.");
		}
				
    }

	
}
