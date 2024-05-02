package com.SotnanceL3.SotnanceL3Api.service;

import com.SotnanceL3.SotnanceL3Api.entity.Person;
import com.SotnanceL3.SotnanceL3Api.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PersonService {

    private final PersonRepository personRepository;
@Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getPersons() {
        return personRepository.findAll();
    }
    public Optional<Person> getPerson(Long id){return  personRepository.findById(id);}
 @SuppressWarnings("null")
public Person AddPerson(Person person)
 {
	return personRepository.save(person);
 }

@SuppressWarnings("null")
public void DeletPerson(Long idPerson) {
	personRepository.deleteById(idPerson);
}


@SuppressWarnings("null")
public void UpdatePerson(Long id, Person updatedPerson) {
    Optional<Person> optionalPerson = personRepository.findById(id);
    if (optionalPerson.isPresent()) {
        Person existingPerson = optionalPerson.get();
        existingPerson.setFirstName(updatedPerson.getFirstName());
        existingPerson.setName(updatedPerson.getName());
        existingPerson.setBirthdate(updatedPerson.getBirthdate());
        existingPerson.setSellPhone(updatedPerson.getSellPhone());
        personRepository.save(existingPerson);
    } else {
        // Handle error: Person not found
        throw new IllegalArgumentException("Person with ID " + id + " not found");
    }
}




}

