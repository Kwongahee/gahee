package co.edu.todo;

public class todoVO {

	private String todo;

	
	
	public todoVO(String todo) {
		super();
		this.todo = todo;
	}

	public String getTodo() {
		return todo;
	}

	public void setTodo(String todo) {
		this.todo = todo;
	}

	@Override
	public String toString() {
		return "todoVO [todo=" + todo + "]";
	}
	
	
	
	
}
