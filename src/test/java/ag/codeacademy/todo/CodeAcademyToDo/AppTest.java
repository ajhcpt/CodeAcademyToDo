package ag.codeacademy.todo.CodeAcademyToDo;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class AppTest {

	@Before
	public void runBeforeEachTest() {
		//Category c1 = new Category("Groceries");
		//Category c2 = new Category("Budget");
		//Category c3 = new Category("Other");
		
	}
	
	@After
	public void runafterEachTest() {
	}
	

	@Test
	public void testAddANewTask() {
		Category c1 = new Category("Groceries");
		String description = "Test Task";
		String detail = "This is my unit test task. Here is some more detail.";
		String startDateString = "01/02/2014 00:00";
		String endDateTimeString = "01/03/2014 10:00";
		Date startDate = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(startDateString);
		Date endDateTime = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(startDateString);
		
		CreateTask(description, detail, startDate, endDateTime, c1, false);
		assertEquals("The task has been created and is in the task list", description, App.getTaskList().FindByDescription.description);
	}
	
	@Test
	public void testChangeCompletedToTrueFromFalse() {
		Category c2 = new Category("Other");
		String description = "Test Task2";
		String detail = "This is my unit test task2. Here is some more detail.";
		String startDateString = "01/02/2014 00:00";
		String endDateTimeString = "01/03/2014 10:00";
		Date startDate = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(startDateString);
		Date endDateTime = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(startDateString);
		
		CreateTask(description, detail, startDate, endDateTime, c2, false);
		ToggleIsCompleted(description);
		assertEquals("The is completed flag is set to True.", true, App.getTaskList().FindByDescription.getIsCompleted());
	}

	
}
