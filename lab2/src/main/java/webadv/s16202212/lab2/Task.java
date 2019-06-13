package webadv.s16202212.lab2;

public class Task {
	int id;
	String message;
	public void task(int id, String message) {
		this.id=id;
		this.message=message;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
