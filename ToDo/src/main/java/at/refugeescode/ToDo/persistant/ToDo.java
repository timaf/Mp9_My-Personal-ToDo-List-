package at.refugeescode.ToDo.persistant;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ToDo {

    @Id
    private String id;
    private String task;
    private boolean done;

    public ToDo() {
    }

    public ToDo(String task, boolean done) {
        this.task = task;
        this.done = done;
    }

    public String getId() {
        return id;
    }

    public String getTask() {
        return task;
    }

    public boolean isDone() {
        return done;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}

 /*   The ToDo application has an endpoint /todos where we can post our ToDo objects. A ToDo object contains the id,
        one string representing our tasks for us to do later and a boolean that says whether it is done or not.
        We can always see them if you make a get request to /todos.
        In order to see a particular ToDo we will do a get request to /todos/{id}.
        And if we want to mark a ToDo as done we will post to /todos/{id}/done.
        This application will connect to a MongoDB in a local environment or also in a hosted instance in the cloud with a given username and password*/

