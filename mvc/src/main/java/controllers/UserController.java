package controllers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import javax.sql.DataSource;

import dao.UserDAO;
import test.test.User;
import dao.JDBCUserDAO;
/**
 * Controller User interface
 */
@Controller
public class UserController {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
 	private JDBCUserDAO jdbcUserDAO = new JDBCUserDAO();
 	
 	public void setDataSource(DataSource dataSource) {
		this.dataSource=dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
 
	 @RequestMapping("/users.html")
	 public ModelAndView listUsers() {
	    return new ModelAndView("WEB-INF/jsp/users.jsp", "users", jdbcUserDAO.listUsers());
	 }
	 
	@RequestMapping(value = "/add_user.html", method = RequestMethod.GET)
	 /*public String showCreateUser(Model model) {
	    User user = new User();
	    model.addAttribute("user", user);*/
	public String insert(int userId, String name){
		String sql="insert into user.user (USER_ID, USER_NAME) values (?,?)";
		jdbcTemplateObject.update(sql, userId, name);
		System.out.println("Created New Record Id: " + userId + " Name: " + name );
		return "WEB-INF/jsp/add_user.jsp";
	 }
}

