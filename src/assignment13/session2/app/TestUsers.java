package assignment13.session2.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import assignment13.session2.bean.Users;
import assignment13.session2.dao.UsersDao;

public class TestUsers {
	private static ApplicationContext ctx;

	public static void main(String[] args) {  
	    ctx = new ClassPathXmlApplicationContext("spring.xml"); 
	    UsersDao dao=(UsersDao)ctx.getBean("usersDao");  
	    int status=dao.saveUsers(new Users("vks","Amit","amit","Noida"));
	    if(status>0)
	    System.out.println("inserted successfully");  
	      
	}  
}
