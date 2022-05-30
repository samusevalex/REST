package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    private final IRepository repository = new ListRepository();
    private final SequenceGenerator sequenceGenerator = new SequenceGenerator();

    @GetMapping("/create")   //create new user: http://localhost:8080/create/?name=NAME&surname=SURNAME
    public Iterable<IUser> create(@RequestParam String name, @RequestParam String surname){
          long id = sequenceGenerator.getNext();
          IUser obj = new User(id, name, surname);
          repository.save(obj);
          return repository.findAll();
    }

    @GetMapping("/delete")   //delete user by id: http://localhost:8080/delete/?id=ID
    public Iterable<IUser> delete(@RequestParam long id) {
        repository.deleteById(id);
        return repository.findAll();
    }

    @GetMapping("/list")   //list users: http://localhost:8080/list/
    public Iterable<IUser> list(){
        return repository.findAll();
    }
}
