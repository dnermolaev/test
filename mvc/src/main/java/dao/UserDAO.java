package dao;

import test.test.User;
import java.util.List;
import javax.sql.DataSource;

public interface UserDAO {
	
	/* The method for initializing database resources - connection */
	public void setDataSource (DataSource ds);
	/* The method for adding new line */
	public void insert(int userId, String name);
	/* The method to list down all the records in database */
	public List<User> listUsers();

}
