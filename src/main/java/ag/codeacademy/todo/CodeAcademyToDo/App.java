package ag.codeacademy.todo.CodeAcademyToDo;

import java.io.IOException;

import ag.codeacademy.todo.services.ReadToDoFromFile;

public class App {
	//public static ArrayList<ToDo> toDoList;
	
	public static void main( String[] args ) {
		ToDoBoard toDoBoard = new ToDoBoard(ReadToDoFromFile.ReadFromFile("C:\\downloads\\todos.txt"));
				
		System.out.println("Welcome to ToDo application!");
		System.out.println("Please select an option.");
		System.out.println("1. List all ToDo's");
		System.out.println("2. Add a new ToDo");
		System.out.println("3. Remove a ToDo");
		System.out.println("4. Find a ToDo");
		System.out.print("> ");
		try {
			int menuOption = System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (ToDo toDo : toDoBoard.gettoDoList()) {
			System.out.println(toDo.getDescription());
		}
		
    }

	
}
