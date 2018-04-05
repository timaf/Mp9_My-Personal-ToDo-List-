package at.refugeescode.ToDo.repository;

import at.refugeescode.ToDo.persistant.ToDo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ToDoRepository extends MongoRepository<ToDo, String> {
}
