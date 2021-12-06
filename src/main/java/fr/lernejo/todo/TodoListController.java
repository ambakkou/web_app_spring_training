package fr.lernejo.todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoListController {
    TodoRepository todolist;

    public TodoListController(TodoRepository todolist) {
        this.todolist = todolist;
    }


    @PostMapping(value = "/api/todo")
    public TodoEntity add(@RequestBody TodoEntity todo){
        return todolist.save(todo);
    }
    @GetMapping(value = "/api/todo")
    public Iterable<TodoEntity> getList(){
        return todolist.findAll();
    }
}
