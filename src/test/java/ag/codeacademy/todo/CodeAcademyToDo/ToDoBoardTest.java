package ag.codeacademy.todo.CodeAcademyToDo;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.mockito.*;
import org.junit.*;

public class ToDoBoardTest {
	
	ToDoBoard toDoBoard; 
	ToDo toDo1, toDo2, toDo3, toDo4; 

	@Before 
	public void setUp() {
		List toDoList = new ArrayList<ToDo>();
		toDo1 = new ToDo("description1", "detail1", "01/02/2014",
				"02/02/2014", "Budget", "High");
		toDoList.add(toDo1);
		toDo2 = new ToDo("description2", "detail1", "01/02/2014",
				"02/02/2014", "Budget", "High");
		toDoList.add(toDo2);
		toDo3 = new ToDo("description3", "detail1", "01/02/2014",
				"02/02/2014", "Budget", "High");
		toDoList.add(toDo3);
		toDo4 = new ToDo("description4", "detail1", "01/02/2014",
				"02/02/2014", "Budget", "High");
		toDoList.add(toDo4);
		
		toDoBoard = new ToDoBoard(toDoList);
		
	}
	
	@Test
	public void testAddOneToDo() {
		ToDo toDoTest = new ToDo("TestToDo", "detail1", "01/02/2014",
				"02/02/2014", "Budget", "High");
		toDoBoard.AddToDo(toDoTest);
		assertEquals(true, toDoBoard.gettoDoList().contains(toDoTest));
		assertEquals(5, toDoBoard.gettoDoList().size());
		
	}

	@Test
	public void testRemoveToDo() {
		toDoBoard.RemoveToDo(toDo2);
		assertEquals(false, toDoBoard.gettoDoList().contains(toDo2));
		assertEquals(3, toDoBoard.gettoDoList().size());
	}
	
	@Test
	public void testAddMultipleToDos() {
		List toDoList = new ArrayList<ToDo>();
		ToDo toDo5 = new ToDo("description1", "detail1", "01/02/2014",
				"02/02/2014", "Budget", "High");
		toDoList.add(toDo5);
		ToDo toDo6 = new ToDo("description2", "detail1", "01/02/2014",
				"02/02/2014", "Budget", "High");
		toDoList.add(toDo6);
		toDoBoard.AddMultipleToDos(toDoList);
		assertEquals(true, toDoBoard.gettoDoList().contains(toDo5));
		assertEquals(true, toDoBoard.gettoDoList().contains(toDo6));
		assertEquals(6, toDoBoard.gettoDoList().size());
		
	}
}
