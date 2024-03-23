package TodoProject.controller;

import TodoProject.dao.TodoDao;
import TodoProject.model.Todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TodoController {

    @Autowired
    private TodoDao todoDao;
    
    
    @RequestMapping(value = "/showTask")
    public String showTask(Model model)
    {
    	model.addAttribute("showTask",Todo.class);
    	return "showTask";
    }
    
    @RequestMapping(value = "/addData", method = RequestMethod.POST)
    public String addtask(@ModelAttribute Todo todo){
    	System.out.println(todo.getText());
    	todoDao.addData(todo);
        return "showTask";
    }
    
    @RequestMapping(value = "/viewAllData")
    public String getAllTask(Model model){
       List<Todo> todoList=todoDao.getAllData();
       model.addAttribute("list",todoList);
       return "viewAllData";
    }

    
    @RequestMapping(value = "deletetask/{id}")
    public String deleteTask(@PathVariable("id") int id) {
    	todoDao.deleteTask(id);
    	return "redirect:/viewAllData";
    }
}
