package at.refugeescode.ToDo;

import at.refugeescode.ToDo.persistant.ToDo;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/todos")
public class ToDoRestController {

    private ToDoRepository toDoRepository;

    public ToDoRestController(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }
    @GetMapping
    List<ToDo> getAll(){
        return toDoRepository.findAll();
    }

    @PostMapping
    ToDo createTask(@RequestBody ToDo toDo){
        return toDoRepository.save(toDo);
    }

    @DeleteMapping(value="/{id}")
    void endTask(@PathVariable String id){
        toDoRepository.deleteById(id);
    }

    @PutMapping(value = "/{id}/done")
    ToDo changeTask(@PathVariable String id){
        Optional <ToDo> updateTask = toDoRepository.findById(id);
        if(!updateTask.isPresent()){
            return null;
        }
        updateTask.get().setDone(true);
        return toDoRepository.save(updateTask.get());

    }

}

