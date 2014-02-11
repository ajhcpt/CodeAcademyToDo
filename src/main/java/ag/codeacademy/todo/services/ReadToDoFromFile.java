package ag.codeacademy.todo.services;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ag.codeacademy.todo.CodeAcademyToDo.ToDo;

public class ReadToDoFromFile {
	public static List<ToDo> ReadFromFile(String fileName) {
		List<ToDo> toDoList = new ArrayList<ToDo>();
		
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
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
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
