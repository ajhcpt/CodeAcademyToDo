package ag.codeacademy.interfaces;

import java.io.IOException;
import java.util.List;

import ag.codeacademy.todo.CodeAcademyToDo.ToDo;

public interface IToDoReader {
	public List<ToDo> Read() throws IOException;

}
