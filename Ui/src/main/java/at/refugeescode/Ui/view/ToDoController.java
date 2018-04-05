package at.refugeescode.Ui.view;

import at.refugeescode.Ui.controller.ToDoService;
import at.refugeescode.Ui.model.ToDo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class ToDoController {

    private ToDoService toDoService;

    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }
    @ModelAttribute("duties")
    List<ToDo> doList(){
        return toDoService.findAll();
    }

    @ModelAttribute("todo")
    ToDo newTodo(){
        return new ToDo();
    }

    @GetMapping
    String page(){
        return "myToDo";
    }

    @PostMapping
    String post(ToDo toDo){
        toDoService.add(toDo);
        return "redirect:/";
    }
}
