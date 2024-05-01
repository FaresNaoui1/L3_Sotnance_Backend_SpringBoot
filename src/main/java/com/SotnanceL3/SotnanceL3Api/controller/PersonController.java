package com.SotnanceL3.SotnanceL3Api.controller;

import com.SotnanceL3.SotnanceL3Api.service.PersonService;
import com.SotnanceL3.SotnanceL3Api.entity.Person;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/person")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping 
    public List<Person> getPersons() {
        return personService.getPersons();
    }
@PostMapping
public Person AddPerson(@RequestBody Person person)
{
return  personService.AddPerson(person);

}
@DeleteMapping("/{idPerson}")
public void DeletPerson(@PathVariable("idPerson") Long idPerson) {
    personService.DeletPerson(idPerson);
}
@PutMapping("/{idPerson}")
public void UpdatePerson (@PathVariable("idPerson") Long id,@RequestBody Person person)
{
    personService.UpdatePerson(id,person);
}

}
