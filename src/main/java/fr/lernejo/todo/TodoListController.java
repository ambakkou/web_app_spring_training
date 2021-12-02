package fr.lernejo.todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class TodoListController {
    ArrayList<Todo> todoArrayList = new ArrayList<>();
    @PostMapping(value = "/api/todo")
    public void add(@RequestBody Todo todo){
        todoArrayList.add(todo);
    }
    @GetMapping(value = "/api/todo")
    public ArrayList<Todo> getList(){
        return todoArrayList;
    }
}
