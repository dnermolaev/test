package dao;

import javax.sql.DataSource;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

import test.test.User;
import test.test.UserMapper;

public class JDBCUserDAO implements UserDAO{
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	public void setDataSource(DataSource dataSource) {
		this.dataSource=dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	
	public void insert(int userId, String name){
		String sql="insert into user.user (USER_ID, USER_NAME) values (?,?)";
		jdbcTemplateObject.update(sql, userId, name);
		System.out.println("Created New Record Id: " + userId + " Name: " + name );
		return;
	}
	
	/*public void insert(User user){
		String sql = "INSERT INTO USER" +
				"(USER_ID, USER_NAME) VALUES (?, ?)";
		Connection conn = null;
		
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, user.getUserId());
			ps.setString(2, user.getName());
			ps.executeUpdate();
			ps.close();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
			
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}*/

	public List<User> listUsers(){
		String sql="select * from user.user";
		List <User> users = jdbcTemplateObject.query(sql, 
				new UserMapper());
		return users;
		/*String sql = "SELECT * FROM USER";
		
		Connection conn = null;
		
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int ID=rs.getInt("USER_ID"); // or rs.getInt(1)
				String Name=rs.getString("USER_NAME"); // or rs.getString(2)
				System.out.println("----------------");
				System.out.println("USER_ID:"+ID);
				System.out.println("USER_NAME"+Name);
				}
			rs.close();
			ps.close();
			return User;
		} 	catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
				conn.close();
				} catch (SQLException e) {}
			}
		}*/

		
	}
}
