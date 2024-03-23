package TodoProject.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import TodoProject.model.Todo;

public class RowMappercls implements RowMapper<Todo>{

	@Override
	public Todo mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Todo todo=new Todo();
		todo.setId(rs.getInt(1));
		todo.setText(rs.getString(2));
		return todo;
	}

}
