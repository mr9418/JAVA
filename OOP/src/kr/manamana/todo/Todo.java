package kr.manamana.todo;

public class Todo {
	private String title;
	private String todo;
	
	
	public Todo() {
		// TODO Auto-generated constructor stub
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTodo() {
		return todo;
	}
	public void setTodo(String todo) {
		this.todo = todo;
	}
	
	public void print() {
		System.out.println("������:"+title);
		System.out.println("������:"+todo);
	}

}
