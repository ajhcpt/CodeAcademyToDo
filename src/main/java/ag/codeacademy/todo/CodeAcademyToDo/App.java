package ag.codeacademy.todo.CodeAcademyToDo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import ag.codeacademy.todo.services.ToDoFileReader;

public class App {
	
	public static void main( String[] args ) throws IOException {
		if (args.length == 1) {
			ToDoFileReader fileReader = new ToDoFileReader(new BufferedReader(new FileReader(args[0])));
			ToDoBoard toDoBoard = new ToDoBoard(fileReader.Read());
			
			System.out.println("List of description of To Dos imported");
			for(ToDo toDo : toDoBoard.gettoDoList()) {
				System.out.println(toDo.getDescription());
			}
			
		} else {
			System.out.println("Please enter one argument: ");
			System.out.println("1: Path to To Do test file.");
		}
		
		
    }
	
	private void MainMenu() {
		System.out.println("To Application Menu.........");
		System.out.println("1. Add To Do");
		System.out.println("2. Delete To Do");
		System.out.println("3. Search To Dos");
		System.out.println("4. Save To Dos");
		System.out.println("5. Exit");
	}
	
	private void AddScreen() {
		System.out.println("Add a To Do........");
		System.out.println("Enter description: ");
		Syste
	}
}
