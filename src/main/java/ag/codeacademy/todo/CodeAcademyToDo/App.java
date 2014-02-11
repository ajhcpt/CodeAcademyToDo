package ag.codeacademy.todo.CodeAcademyToDo;

import java.io.IOException;

import ag.codeacademy.todo.services.ReadToDoFromFile;

public class App {
	//public static ArrayList<ToDo> toDoList;
	
	public static void main( String[] args ) {
		ToDoBoard toDoBoard = new ToDoBoard(ReadToDoFromFile.ReadFromFile("C:\\downloads\\todos.txt"));
				
		for (ToDo toDo : toDoBoard.gettoDoList()) {
			System.out.println(toDo.getDescription());
		}
		
    }

	
}
