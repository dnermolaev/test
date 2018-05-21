package test.test;

/*
 * Sample of the User class
 */

public class User {
	int userId;
	String name;

	public User(int userId, String name) {
		this.userId = userId;
		this.name = name;
	}

	public User() {
		
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
