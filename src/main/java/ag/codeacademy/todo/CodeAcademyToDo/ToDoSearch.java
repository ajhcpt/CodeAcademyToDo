package ag.codeacademy.todo.CodeAcademyToDo;

import java.util.ArrayList;
import java.util.List;

public class ToDoSearch {
	private static List<ToDo> FindByDescription(String description, List<ToDo> toDoList) {
		List<ToDo> searchResult = new ArrayList<ToDo>();
		for (ToDo toDo : toDoList) {
			if (toDo.getDescription().toUpperCase() == description.toUpperCase()) {
				searchResult.add(toDo);
			}
		}
		return searchResult;
		
	}
	
	private static List<ToDo> FindByImportance(String importance, List<ToDo> toDoList) {
		List<ToDo> searchResult = new ArrayList<ToDo>();
		for (ToDo toDo : toDoList) {
			if (toDo.getImportance().toUpperCase() == importance.toUpperCase()) {
				searchResult.add(toDo);
			}
		}
		return searchResult;
		
	}
	
	private static List<ToDo> FindByCategory(String category, List<ToDo> toDoList) {
		List<ToDo> searchResult = new ArrayList<ToDo>();
		for (ToDo toDo : toDoList) {
			if (toDo.getTaskCategory().toUpperCase() == category.toUpperCase()) {
				searchResult.add(toDo);
			}
		}
		return searchResult;		
	}
	
	public static List<ToDo> FindToDo(String searchParameter, String searchValue, List<ToDo> toDoList) {
		List<ToDo> searchResult = new ArrayList<ToDo>();
		
		switch (searchParameter.toUpperCase()) {
			case "CATEGORY": searchResult = FindByCategory(searchValue, toDoList);
							 return searchResult;
			case "IMPORTANCE": searchResult = FindByImportance(searchValue, toDoList);
			 				   return searchResult;
			case "DESCRIPTION": searchResult = FindByDescription(searchValue, toDoList);
			   					return searchResult;
			default: System.out.println("Please enter a valid seach paramenter: Category, Importance or Description.");
					 return null;
		
		}
	}
}
