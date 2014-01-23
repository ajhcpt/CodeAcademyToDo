package ag.codeacademy.todo.CodeAcademyToDo;

public class Category {
	private int iD;
	private String categoryName;
	
	public Category(String Name) {
		categoryName = Name;
	}

	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	
	
	
}