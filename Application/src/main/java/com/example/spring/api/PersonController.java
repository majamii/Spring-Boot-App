package com.example.spring.api;

import com.example.spring.model.Person;
import com.example.spring.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("api/v1/person")
@RestController
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping //POST Request into Person
    public void addPerson(@RequestBody Person person) {
        personService.addPerson(person);
    }

    public List<Person> getAllPeople() {
        return personService.getAllPeople();
    }
}
