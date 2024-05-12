package com.SotnanceL3.SotnanceL3Api.service;

import com.SotnanceL3.SotnanceL3Api.entity.Cheffeur;
import com.SotnanceL3.SotnanceL3Api.entity.Person;
import com.SotnanceL3.SotnanceL3Api.repository.CheffeurRepository;
import com.SotnanceL3.SotnanceL3Api.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CheffeurService {

    private final CheffeurRepository cheffeurRepository;
    @Autowired
    public CheffeurService(CheffeurRepository cheffeurRepository) {
        this.cheffeurRepository = cheffeurRepository;
    }




    public List<Cheffeur> getCheffeurs() {
        return cheffeurRepository.findAll();
    }
    public Optional<Cheffeur> getCheffeur(Long id){return  cheffeurRepository.findById(id);}
 @SuppressWarnings("null")
public Cheffeur AddCheffeur(Cheffeur person)
 {
	return cheffeurRepository.save(person);
 }

@SuppressWarnings("null")
public void DeletCheffeur(Long idPerson) {
    cheffeurRepository.deleteById(idPerson);
}


@SuppressWarnings("null")
public void UpdateCheffeur(Long id, Cheffeur updatedPerson) {
    Optional<Cheffeur> optionalPerson = cheffeurRepository.findById(id);
    if (optionalPerson.isPresent()) {
        Cheffeur existingPerson = optionalPerson.get();
        existingPerson.setFirstName(updatedPerson.getFirstName());
        existingPerson.setName(updatedPerson.getName());
        existingPerson.setBirthdate(updatedPerson.getBirthdate());
        existingPerson.setSellPhone(updatedPerson.getSellPhone());
        cheffeurRepository.save(existingPerson);
    } else {
        // Handle error: Person not found
        throw new IllegalArgumentException("Person with ID " + id + " not found");
    }
}




}

