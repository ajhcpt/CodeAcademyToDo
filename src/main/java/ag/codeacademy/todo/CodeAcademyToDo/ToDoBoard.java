package ag.codeacademy.todo.CodeAcademyToDo;

import java.util.List;

public class ToDoBoard {
	private static List<ToDo> toDoList;
	
	public ToDoBoard(List<ToDo> toDoList) {
		ToDoBoard.toDoList = toDoList;
	}
	
	public void AddToDo(ToDo toDo) {
		toDoList.add(toDo);
	}
	
	public void AddMultipleToDos(List<ToDo> toDoList) {
		ToDoBoard.toDoList.addAll(toDoList);
	}
	
	public void RemoveSingleToDo(ToDo toDo) {
		toDoList.remove(toDo);
	}
	
	public void RemoveMultipleToDos(List<ToDo> toDosToBeRemoved) {
		for(ToDo toDo: toDosToBeRemoved) {
			toDoList.remove(toDo);
		}
	}
	
	public List<ToDo> gettoDoList() {
		return toDoList;
	}
}
