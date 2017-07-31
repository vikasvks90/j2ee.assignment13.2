package assignment13.session2.dao;
import org.springframework.jdbc.core.JdbcTemplate;
import assignment13.session2.bean.Users; 

public class UsersDao { 
	private JdbcTemplate jdbcTemplate;  
	  
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	}  
	  
	public int saveUsers(Users users){  
	    String query="insert into users values(?,?,?,?)";  
	    return jdbcTemplate.update(query,users.getUserId(),users.getUserName(),users.getPassword(),users.getAddress());  
	}    
  
}  