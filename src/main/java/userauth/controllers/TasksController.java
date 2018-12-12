package userauth.controllers;


import javafx.concurrent.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import userauth.models.Tasks;
import userauth.repository.TasksRepository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@RequestMapping(path="/tasks")
@Controller
public class TasksController {

    @Autowired
    private TasksRepository taskRepo;

    @GetMapping(path="/getAll")
    @ResponseBody
    public Iterable<Tasks> retrieveTasks(){



        Iterable<Tasks> taskat = taskRepo.findAll();


        return taskRepo.findAll();
    }

    @PostMapping(path="/add")
    public @ResponseBody String addTask(@RequestParam Map<String,Object> newTask){

        Tasks task = new Tasks();

        task.setTitle(newTask.get("title").toString());

        task.setDescription(newTask.get("description").toString());

        try{
            taskRepo.save(task);
            return "Saved successfully";

        }catch(Exception e){
            return e.getMessage();
        }

    }
}
