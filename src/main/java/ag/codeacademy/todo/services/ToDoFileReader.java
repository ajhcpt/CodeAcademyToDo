package ag.codeacademy.todo.services;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ag.codeacademy.interfaces.IToDoReader;
import ag.codeacademy.todo.CodeAcademyToDo.ToDo;

public class ToDoFileReader implements IToDoReader {
	private BufferedReader reader;
		
	ToDoFileReader(BufferedReader reader) {
		this.reader = reader;
	}
	
	@Override
	public List<ToDo> Read() {
		List<ToDo> toDoList = new ArrayList<ToDo>();
		
		try {
			int numberOfToDos = Integer.parseInt(reader.readLine());
			for (int i = 0; i < numberOfToDos; i++) {
				String description = reader.readLine();
				String detail = reader.readLine();
				String startDate = reader.readLine();
				String endDate = reader.readLine();
				String category = reader.readLine();
				String importance = reader.readLine();
				
				ToDo toDo = new ToDo(description, detail, startDate, endDate, category, importance);
				toDoList.add(toDo);
			}
			return toDoList;	
		} catch (IOException e) {
			System.out.println(e.getMessage());
			return null;
		}		
		
	}
	
	
}
