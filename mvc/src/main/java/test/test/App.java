package test.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;
import dao.JDBCUserDAO;
import dao.UserDAO;

public class App 
{
    public static void main( String[] args )    {
    	 /*User user = new User();
    	 //user.setUserId(userId);
    	 //user.setName("name");
         //new JDBCUserDAO.insertWithJDBC(user);*/
    	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
   	 
    	//JDBCUserDAO jdbcUserDAO = (JDBCUserDAO) context.getBean("jdbcUserDAO");
       UserDAO jdbcUserDAO = (UserDAO) context.getBean("jdbcUserDAO");
       
       //jdbcUserDAO.insert(user);
       //System.out.println(jdbcUserDAO.queryData());
       
       System.out.println("--Records--");
       jdbcUserDAO.insert(1, "Dima");
       jdbcUserDAO.insert(2, "Kolya");
       jdbcUserDAO.insert(3, "Nadya");
       
       System.out.println("--Listing--");
       List<User> users = jdbcUserDAO.listUsers();
       for (User record:users) {
    	   System.out.print("UserId: " + record.getUserId());
    	   System.out.print(" , Name: " + record.getName());
       }
       }
    }

