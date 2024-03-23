package TodoProject.dao;

import TodoProject.model.Todo;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class TodoDao {

    JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

//    add task into project
    public int addData(Todo todo){
         String sql="insert into todolist(text) values(?)";
         return this.jdbcTemplate.update(sql, todo.getText());
    }
    
//    getAllTask 
    public List<Todo> getAllData(){
    	String sql="select * from todolist";
    	return this.jdbcTemplate.query(sql, new RowMappercls());
    }

    
//    delete form 
    public int deleteTask(int id) {
    	String sql="delete from todolist where id=?";
    	return this.jdbcTemplate.update(sql,id);
    }

}
