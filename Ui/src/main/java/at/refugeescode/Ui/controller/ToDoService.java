package at.refugeescode.Ui.controller;

import at.refugeescode.Ui.model.ToDo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoService {

    private List<ToDo> duties = new ArrayList <>();

    public void add(ToDo todo){
        duties.add(todo);
    }

    public List<ToDo> findAll(){
        return new ArrayList <>(duties);
    }
}
