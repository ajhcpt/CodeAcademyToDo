package ag.codeacademy.todo.CodeAcademyToDo;

import java.util.List;

public class ToDoBoard {
	private static List<ToDo> toDoList;
	
	public ToDoBoard(List<ToDo> toDoList) {
		ToDoBoard.toDoList = toDoList;
	}
	
	public void AddToDo(ToDo toDo) {
		toDoList.add(toDo);
		System.out.println(toDo.getDescription() + " added.");
	}
	
	public void AddMultipleToDos(List<ToDo> toDoList) {
		ToDoBoard.toDoList.addAll(toDoList);
		for (ToDo toDo: toDoList) {
			System.out.println(toDo.getDescription() + " added.");
		}
	}
	
	public void RemoveSingleToDo(ToDo toDo) {
		toDoList.remove(toDo);
		System.out.println(toDo.getDescription() + " removed.");
	}
	
	public void RemoveMultipleToDos(List<ToDo> toDosToBeRemoved) {
		for(ToDo toDo: toDosToBeRemoved) {
			toDoList.remove(toDo);
			System.out.println(toDo.getDescription() + " removed.");
		}
	}
	
	public List<ToDo> gettoDoList() {
		return toDoList;
	}
}
